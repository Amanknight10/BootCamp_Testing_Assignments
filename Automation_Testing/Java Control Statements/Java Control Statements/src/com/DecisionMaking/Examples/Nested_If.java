package com.DecisionMaking.Examples;

public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String address = "Bijnor,  India";
		
		if(address.endsWith("India")) {
			if(address.contains(" Bijnor ")) {
				System.out.println(" City is bijnor ");
			}else if(address.contains(" Noida ")) {
				System.out.println("City is in NCR region");
			}else {
				System.out.println(address.split(",")[1]);
			}
		}else {
			System.out.println("City is outside India");
		}
	}
}
