package com.generics;

public class FindMaximun {
	
	void getmaxno(Integer n1,Integer n2, Integer n3) {
		
		Integer max=n1;
		if(n2.compareTo(max)>0) {
			max=n2;
		}if (n3.compareTo(max)>0) {
			
			max=n3;
		}
		
		System.out.println("maximum no is : " +max);
	}

	public static void main(String[] args) {
		System.out.println(" welcome to generics ");
		
		FindMaximun obj=new FindMaximun();
		obj.getmaxno(3, 1, 2);

	}

}
