package Jarvis;

public class series {

	    public static void main(String[] args) {
	        // Outer loop for the number of lines (1 to 5)
	        for (int i = 5; i >=1;i--) {
	            // Inner loop to print numbers in each line
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j+" ");
	            }
	           
	            System.out.println("");
	        }
	    }
}
