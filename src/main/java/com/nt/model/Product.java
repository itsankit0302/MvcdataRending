package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	public Product(int i, String string, double d, double e) {
		// TODO Auto-generated constructor stub
	}
	private Integer pid;
	private String pname;
	private Double price;
	private Double qty;

}
