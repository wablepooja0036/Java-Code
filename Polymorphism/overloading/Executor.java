//Program to demonstrate Overloading - Compile Time Polymorphism
package com.tnsif.dayseven.overloading;



	public class Executor {

	public static void main(String[] args) {

		System.out.println("Is 121 Palindrome? "+Operations.isPalindrome(121));
		System.out.println("Is 123 Palindrome? "+Operations.isPalindrome(123));
		
		System.out.println("Is CAR Palindrome? "+Operations.isPalindrome("CAR"));
		System.out.println("Is RACECAR Palindrome? "+Operations.isPalindrome("RACECAR"));

	}

}