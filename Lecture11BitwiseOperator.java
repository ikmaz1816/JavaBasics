package basics;

public class Lecture11BitwiseOperator {

	public static void main(String[] args) {
		// And is used when we perform bit operation
		//AND
		// If both the inputs are true then and only then the ouput is true
		//OR
		//If any one input is true then the output is true
		//Ex-OR
		//If anyone input is high and other is only then and only then the output is true;
		int a=5;
		a = a |1;
		System.out.println(a);
		a=a&1;
		System.out.println(a);
		a=a^1;
		System.out.println(a);
		a=~a;
		System.out.println(a);
		//~ -(n+1)
	}

}
