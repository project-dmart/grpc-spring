package dev.idion.server1.hello;

import dev.idion.grpc.HelloRequest;
import dev.idion.grpc.HelloResponse;
import dev.idion.grpc.HelloServiceGrpc.HelloServiceImplBase;
import io.grpc.stub.StreamObserver;

public class HelloGrpcService extends HelloServiceImplBase {

	@Override
	public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
		HelloResponse helloResponse = HelloResponse.newBuilder()
				.setAllowed(request.getAge() > 20)
				.setGreeting("Hello, " + request.getFirstName() + " " + request.getLastName())
				.build();

		responseObserver.onNext(helloResponse);
		responseObserver.onCompleted();
	}
}
