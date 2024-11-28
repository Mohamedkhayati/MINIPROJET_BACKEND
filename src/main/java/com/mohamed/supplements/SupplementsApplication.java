package com.mohamed.supplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.mohamed.supplements.entities.Nutritional;
import com.mohamed.supplements.entities.Supplement;

@SpringBootApplication
public class SupplementsApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;


	public static void main(String[] args) {
		SpringApplication.run(SupplementsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Supplement.class,Nutritional.class);
	}

}
