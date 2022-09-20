package basics;

public class Lecture2PrimitiveDataTypes {

	public static void main(String[] args) {
		/*
		 int stores integer values
		 short int has a byte capacity of 2 bytes
		 long int has a byte capacity of 4 bytes
		 float stores decimal point number 4 bytes
		 char stores character values 1 byte
		 double stores decimal point number upto 15 decimal point number
		 */
		int a=5;
		float b=5.6f;
		// by default in java every decimal number is considered as a double
		double c=6.7;
		char d='a';
		byte e=90;
		boolean f=true;
		//boolean consist of two values true and false;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		// Sytem.out.println() requires no arguments;
		System.out.println();//This will not give you any error
//		System.out.print(); this will give you error as it requires certain arguments
	}

}
