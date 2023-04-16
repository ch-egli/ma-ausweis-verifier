package ch.sbb.iam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MAAusweisVerifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(MAAusweisVerifierApplication.class, args);
	}

}
