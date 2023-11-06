package com.xworkz.perfume.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
public class PerfumeDTO implements Serializable{
private String name;
private int  price;
private String originalCountry;
private int quantity;
private String smell;

}
