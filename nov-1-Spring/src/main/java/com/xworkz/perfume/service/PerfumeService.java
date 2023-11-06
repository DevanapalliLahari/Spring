package com.xworkz.perfume.service;

import java.util.Collection;

import com.xworkz.perfume.dto.PerfumeDTO;

public interface PerfumeService {
public boolean validateAndSave(PerfumeDTO perfumedto);
public Collection<PerfumeDTO> findByName(String name);
public Collection<PerfumeDTO> readAll();
public boolean isExist(PerfumeDTO dto);
public boolean updatePriceByName(String name,int price);
}
