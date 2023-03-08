package com.generics;



public class FindMaximun <T extends Comparable<T>> {
	
	void getmaxno(T n1,T n2, T n3) {
		
		  T max=n1;
		if(n2.compareTo(max)>0) {
			max=n2;
		}if (n3.compareTo(max)>0) {
			
			max=n3;
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		System.out.println(" welcome to generics ");
		
		FindMaximun obj=new FindMaximun();
		System.out.println("maximum Integer is: ");
		obj.getmaxno(3, 1, 2);
		System.out.println("maximum Float is: ");
		obj.getmaxno(34.98f, 89.98f, 5.6f);
		System.out.println("maximum String is: ");
		obj.getmaxno("akash", "arpit", "abhishekh");
	
	}

}
