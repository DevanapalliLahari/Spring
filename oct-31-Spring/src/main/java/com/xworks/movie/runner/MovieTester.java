package com.xworks.movie.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworks.movie.impl.TollyWood;
import com.xworkz.movie.config.MovieConfig;
import com.xworkz.movies.app.Movie;


public class MovieTester {

	public static void main(String[] args) {
		ApplicationContext context=	new AnnotationConfigApplicationContext(MovieConfig.class);
		Movie movie= context.getBean(TollyWood.class);
		movie.release();
	}

}
