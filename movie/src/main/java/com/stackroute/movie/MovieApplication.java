package com.stackroute.movie;

import com.stackroute.movie.domain.Movie;
import com.stackroute.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableSwagger2
public class MovieApplication implements ApplicationListener<ContextRefreshedEvent> , CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}
	@Autowired
	private MovieRepository movieRepository;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

		movieRepository.save(new Movie(1,"bean","english",5,2018,"done"));
		movieRepository.save(new Movie(2,"race","hindi",4,2018,"save"));

	}

	@Override
	public void run(String... args) throws Exception {

		movieRepository.save(new Movie(3,"venom","english",5,2018,"done"));
		movieRepository.save(new Movie(4,"stree","hindi",4,2018,"save"));
	}
}
