package com.classpractice;
import java.util.Scanner;

public class EvenOrAdd {


	    public static void main(String[] args) {

	        try (Scanner reader = new Scanner(System.in)) {
				System.out.print("Enter a number: ");
				int num = reader.nextInt();

				if(num % 2 == 0)
				    System.out.println(num + " is even");
				else
				    System.out.println(num + " is odd");
			}
	    }
	}
	


