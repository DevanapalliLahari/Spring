package com.xworks.movie.impl;

import org.springframework.stereotype.Component;

import com.xworkz.movies.app.Movie;
@Component
public class TollyWood implements Movie {

	@Override
	public void produce() {
System.out.println("Producing the TollyWood movie");
	}

	@Override
	public void promote() {
System.out.println("Promoting the TollyWood movie");
	}

	@Override
	public void release() {
System.out.println("Releasing the TollyWood movie");
	}

}
