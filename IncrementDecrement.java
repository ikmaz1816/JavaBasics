package basics;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a=5;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		// a++ is called post increment where the value is changed or incremented in the next step if execution
		// ++a is called pre increment where the value is incremented at that line of execution itself
		//Same is for decrement as well
	}

}
