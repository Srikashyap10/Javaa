package Jarvis;

public class Conversion {
	    public static void main(String[] args) {
	        
	        // Implicit conversions (Widening)
	        byte byteVal = 127;
	        short shortVal = byteVal; 
	        // byte to short
	        double data=9.87;
	        int p=(int) data;
	        System.out.println(+p);
	        System.out.println("Short value : " + shortVal);
	    }
	}