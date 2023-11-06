package com.xworkz.perfume.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.repository.PerfumeRepository;

@Component
public class PerfumeServiceImpl implements PerfumeService {
	@Autowired
	PerfumeRepository repository;

	@Override
	public boolean validateAndSave(PerfumeDTO perfumedto) {
		if (perfumedto.getName() != null && perfumedto.getName().length() >= 3) {
			if (perfumedto.getPrice() != 0 && perfumedto.getPrice() >= 500) {
				if (perfumedto.getQuantity() != 0 && perfumedto.getQuantity() >= 500) {
					if (perfumedto.getOriginalCountry() != null && perfumedto.getOriginalCountry().length() >= 3) {
						if (perfumedto.getSmell() != null && perfumedto.getSmell().length() >= 3) {
							System.out.println("The data is saved");
							repository.save(perfumedto);
							return true;
						}
					}

				}
			}
		}
		return false;
	}

	@Override
	public Collection<PerfumeDTO> findByName(String name) {
		if (name != null && name.length() >= 3) {
			System.out.println("Find the name successfully");
			return repository.findByName(name);

		}
		return null;

	}

	@Override
	public Collection<PerfumeDTO> readAll() {
		// TODO Auto-generated method stub
		return repository.readAll();
	}

	@Override
	public boolean isExist(PerfumeDTO dto) {
		if(dto.getName()!=null&& dto.getSmell()!=null)
		{
			repository.isExist(dto);
			return true;
		}
				
		return false;
	}

	@Override
	public boolean updatePriceByName(String Name, int price) {
		
		return repository.updatePriceByName(Name, price);
	}

}
