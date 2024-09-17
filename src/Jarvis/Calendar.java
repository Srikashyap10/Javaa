package Jarvis;
 import java.util.*;

public class Calendar {
	public static void printMonthsWithDays(int days)
	{
		switch(days) {
		case 30: System.out.println("feb");
		System.out.println("april");
		break;
case 31: System.out.println("jan");
		System.out.println("mar");
		break;
		default:System.out.println("invalid"); 
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of days in the month (30 or 31): ");
		int days = scanner.nextInt();
		
		printMonthsWithDays(days);

		scanner.close();
}
	
}		

		
	
		
		
		
	
