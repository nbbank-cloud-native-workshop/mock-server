package capbility.thoughtworks.com.stubrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@SpringBootApplication
@AutoConfigureWireMock
public class StubRunnerApplication {
	public static void main(String[] args) {
		SpringApplication.run(StubRunnerApplication.class, args);
	}
}
