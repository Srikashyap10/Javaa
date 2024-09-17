package Jarvis;

import java.util.Scanner;

public class Whileloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num =scn.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			int r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(sum+" is palindrome");
		}
		else {
			System.out.println(sum+" is Not a palindrome");
		}
	}

}
