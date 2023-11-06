package com.xworkz.perfume.repository;

import java.util.Collection;


import com.xworkz.perfume.dto.PerfumeDTO;

public interface PerfumeRepository {
public boolean save(PerfumeDTO prufumeDto);
public Collection<PerfumeDTO> findByName(String name);
public Collection<PerfumeDTO> readAll() ;
public boolean isExist(PerfumeDTO dto);
public boolean updatePriceByName(String name,int price);
}
