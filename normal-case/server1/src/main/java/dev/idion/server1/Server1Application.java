package dev.idion.server1;

import dev.idion.server1.hello.HelloGrpcService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Server1Application {

	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(8080).addService(new HelloGrpcService()).build();

		server.start();
		server.awaitTermination();
	}

}
