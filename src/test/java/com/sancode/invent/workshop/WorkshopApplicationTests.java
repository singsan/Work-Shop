package com.sancode.invent.workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Base64;

class WorkshopApplicationTests {

	@Test
	void contextLoads() {
		HttpClient httpClient = HttpClient.newBuilder()
				.version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(10))
				.build();
		try {
			HttpRequest request = HttpRequest.newBuilder()
					.GET()
					.headers("Authorization",basicAuth("sanjay","12345"))
					.uri(URI.create("http://localhost:8080/workShop/mechanicDetail/version1?id=v1")).build();

			HttpResponse<Path> response = httpClient
					.send(request,HttpResponse.BodyHandlers.ofFile(Path.of("s:/responseValue.json")));
			System.out.println("Response Status = "+response.statusCode());
			System.out.println("Response Body = "+response.body());
			Assertions.assertEquals(200,response.statusCode());

		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	private String basicAuth(String userName, String password) {
		return "Basic "+ Base64.getEncoder().encodeToString((userName+":"+password).getBytes());
	}

}
