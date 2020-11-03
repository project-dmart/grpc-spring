package dev.idion.server2;

import java.net.URI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Server2Application {

	@GetMapping("/hi")
	public String hi() {
		final RestTemplate restTemplate = new RestTemplate();
		final ResponseEntity<String> entity = restTemplate
				.getForEntity(URI.create("http://localhost:8080/hello"), String.class);
		return "server1: " + entity.getBody();
	}

	public static void main(String[] args) {
		SpringApplication.run(Server2Application.class, args);
	}

}
