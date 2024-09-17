package Jarvis;

import java.util.Scanner;

public class sonata {

	public static void main(String[] args) {
		System.out.println("Laptops");
		System.out.println("1. Lenovo");
		System.out.println("2. Asus");
		System.out.println("3. Hp");
		System.out.println("4. Dell");
		System.out.println("Select one");
		
		Scanner scn=new Scanner(System.in);
		
		int choice=scn.nextInt();
		
		String result=switch(choice) {
		case 1 ->  {yield "Lenovo Yoga";
		}
		case 2 -> {  yield "Asus Tuf Gaming F15";
		
		}
		case 3 ->  { yield "Hp OMEN";
		
		}
		case 4 -> { yield "Dell inspiron";
		
		}
		default ->  { yield "Invalid";
		}
		};
		System.out.println(result);
	}

}
