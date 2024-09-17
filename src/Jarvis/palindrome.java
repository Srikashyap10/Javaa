package Jarvis;

public class palindrome {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=10; i<=100; i++) {
			int num=i;			
			int sum=0;
			int temp=num;
			while(num!=0)//check reverse of number  
			{
				int r=num%10;
				sum=(sum*10)+r;
				num=num/10;
			}
			if(temp==sum) {
				System.out.println(sum+" is palindrome");
				count++;
			}	
		}
		System.out.println("Number of palindromes are:" +count);

	}

}
