package com.xworks.movie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.movies.app.Language;
import com.xworkz.movies.app.Movie;
public class HollyWood implements Movie {
@Autowired
@Qualifier("hindi")
private Language lang;
	@Override
	public void produce() {
System.out.println("Producing the HollyWood movie");
	}

	@Override
	public void promote() {
	
System.out.println("Promoting the HollyWood movie");
	}

	@Override
	public void release() {
System.out.println("Releasing the HollyWood movie");
	}

}
