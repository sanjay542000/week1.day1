package week1.day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("enter the num");
		Scanner val = new Scanner(System.in);
		int n=val.nextInt();
		//System.out.println("enter the num");
		
		if (n==3) {
			System.out.println("it is prime number");
		}
		else if(n%2!=0&&n%3!=0) {
			System.out.println("it is prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
	}	

}
