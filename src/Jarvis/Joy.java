package Jarvis;

import java.util.Scanner;

public class Joy {

	public static void main(String[] args) {
		System.out.println("Laptops");
		System.out.println("1. Lenovo");
		System.out.println("2. Asus");
		System.out.println("3. Hp");
		System.out.println("4. Dell");
		System.out.println("Select one");
		
		Scanner scn=new Scanner(System.in);
		
		int choice=scn.nextInt();
		
		switch(choice) {
		case 1 -> System.out.println("Lenovo Yoga");
		case 2 -> System.out.println("Asus Tuf Gaming F15");
		case 3 -> System.out.println("Hp OMEN");
		case 4 -> System.out.println("Dell inspiron");
		default -> System.out.println("Invalid");
		}	
	}

}
