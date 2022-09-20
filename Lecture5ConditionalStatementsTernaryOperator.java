package basics;

public class Lecture5ConditionalStatementsTernaryOperator {

	public static void main(String[] args) {
		boolean a=false;//default value of boolean is false
		int b=6;
		a= b>5 ? true : false;
		System.out.println(b>5 ? true : false);
		System.out.println(a);
//		b > 5 ? System.out.println(true) : System.out.println(false); in valid 
		// Even or odd
		System.out.println(b%2!=0 ? true : false);
	}

}
