package com.xworkz.perfume.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.perfume.dto.PerfumeDTO;

@Component
public class PerfumeRepositoryImpl implements PerfumeRepository {
	@Autowired
	Collection<PerfumeDTO> perfume;

	@Override
	public boolean save(PerfumeDTO perfumeDto) {

		perfume.add(perfumeDto);

		return false;

	}

	@Override
	public Collection<PerfumeDTO> findByName(String name) {
		if (name != null) {
			List<PerfumeDTO> name1 = perfume.stream().sorted().filter(e -> e.getName().equalsIgnoreCase(name))
					.collect(Collectors.toList());
			name1.forEach(e -> System.out.println("name:"+e.getName()));
		}
		return null;

	}

	@Override
	public Collection<PerfumeDTO> readAll() {
		// TODO Auto-generated method stub
		return perfume;
	}

	@Override
	public boolean isExist(PerfumeDTO dto) {
		Collection<PerfumeDTO> list=perfume;
		for(PerfumeDTO perfume:list)
		{
			if(perfume.getName().equals(dto.getName()))
			{
				if(perfume.getSmell().equals(dto.getSmell()))
				{
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean updatePriceByName(String Name, int price) {
		for(PerfumeDTO perfume:perfume)
		{
			if(perfume.getName().equals(Name))
			{
				perfume.setPrice(price);
				return true;
			}
		}
		return false;
	}

}
