package basics;

public class Lecture7SwitchCase {

	public static void main(String[] args) {
		char c='*';
		int a=5;
		int b=3;
		switch(c)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("Enter correct Symbol");
		}
// if you don't write the break statement then if a particular condition is true then all the condition 
		// below it will be executed.
	}

}
