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
	void getmaxflot(Float n1,Float n2, Float n3) {
		
		Float max=n1;
		if(n2.compareTo(max)>0) {
			max=n2;
			
		}
		if (n3.compareTo(max)>0) {
			max=n3;
		}
		System.out.println("max float is : "+max);
	}
	void getmaxString(String n1, String n2, String n3) {
		String max=n1;
		if(n2.compareTo(max)>0) {
			max=n2;
			
		}
		if(n3.compareTo(max)>0) {
			max=n3;
		}
		System.out.println("maximum string is :" +max);
	}

	public static void main(String[] args) {
		System.out.println(" welcome to generics ");
		
		FindMaximun obj=new FindMaximun();
		obj.getmaxno(3, 1, 2);
		obj.getmaxflot(23.4f, 1.2f, 23.5f);
		obj.getmaxString("akash", "abhishekh", "arpit");

	}

}
