package com.xworkz.perfume.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.perfume.dto.PerfumeDTO;

import java.util.ArrayList;
@Configuration
@ComponentScan("com.xworkz.perfume")
public class PerfumeConfig {
	
	
@Bean
public ArrayList<PerfumeDTO> getArrayList(){
	return new ArrayList<PerfumeDTO>();
}
}
