package com.loopsStatements.Examples;

public class For_Each_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names = { "Java" , "C", "C++", "Python", "JavaScript"};
		System.out.println("Printing the content of array names:\n");
		for(String name :names) {
			System.out.println(name);
		}

	}

}
