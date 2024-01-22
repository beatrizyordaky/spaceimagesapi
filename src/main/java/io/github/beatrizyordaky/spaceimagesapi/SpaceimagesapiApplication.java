package io.github.beatrizyordaky.spaceimagesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpaceimagesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceimagesapiApplication.class, args);
	}

}
