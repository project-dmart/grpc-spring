package dev.idion.server2;

import dev.idion.grpc.HelloRequest;
import dev.idion.grpc.HelloResponse;
import dev.idion.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Server2Application {

	@GetMapping("/hi")
	public String hi() {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext()
				.build();

		HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

		HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
				.setFirstName("김")
				.setLastName("선동")
				.setAge(26)
				.build());

		channel.shutdown();

		return helloResponse.getGreeting();
	}

	public static void main(String[] args) {
		SpringApplication.run(Server2Application.class, args);
	}

}
