package com.iiht.securityinmemory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	Integer productd;
	String name;
	String category;
	String brand;
	double price;
	print1();
       public void print1(){
	System.out.println("Product File");}

}
