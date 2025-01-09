package com.nt.service;

public class service {
     static int x=20;
     static int y=10;
     //Addition method
	public int sum(int x,int y) {
		 
		return x+y;
	}
	//Subtraction method
	public int sub(int x,int y) {
		return x-y;
	}
	public int multiply(int x,int y) {
		return x*y;
	}
	public static void main(String[] args) {
		int result=x*y;
		System.out.println(result);
	}
}
