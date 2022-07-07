package com.example.demo.controller;

public class StudentController {
	
	
	public static void main(String[] args) {
		String s1= "raggsffssytuiojhsf";
		char[] a=s1.toCharArray();
		char[] b = null;
		int count;
		
		for(int i=0;i<s1.length();i++) {
			for(int j =i+1; j<s1.length();j++) {
				if(a[i] == a[j]) {
					System.out.println(":::"  +s1.charAt(i));
					b[i]=s1.charAt(i);
					break;
				}
			}
			
		}
	}

}
