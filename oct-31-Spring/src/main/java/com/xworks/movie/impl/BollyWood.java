package com.xworks.movie.impl;

import com.xworkz.movies.app.Movie;

public class BollyWood implements Movie {

	@Override
	public void produce() {
System.out.println("Producing the BollyWood movie");
	}

	@Override
	public void promote() {
System.out.println("Promoting the BollyWood movie");
	}

	@Override
	public void release() {
System.out.println("Releasing the BollyWood movie");
	}

}
