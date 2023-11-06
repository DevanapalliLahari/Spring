package com.xworkz.perfume.runner;
import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.perfume.config.PerfumeConfig;
import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.service.PerfumeService;
import com.xworkz.perfume.service.PerfumeServiceImpl;

public class PerfumeRunner {

	public static void main(String[] args) {
		
		PerfumeDTO perfume = new PerfumeDTO("Denver", 1000, "India", 550, "Oak");
		ApplicationContext context=new AnnotationConfigApplicationContext(PerfumeConfig.class);
		PerfumeService service = context.getBean(PerfumeServiceImpl.class);
		service.validateAndSave(perfume);
		service.findByName("Denver");
		Collection<PerfumeDTO> found=service.readAll();
		System.out.println(found);
		
		service.findByName("Denver");
		Collection<PerfumeDTO> read=service.readAll();
		System.out.println(read);
		
		boolean exist=service.isExist(perfume);
		System.out.println(exist);
		
		boolean update=service.updatePriceByName("Denver", 750);
		Collection<PerfumeDTO> saved=service.readAll();
		System.out.println(saved);
	}

}
