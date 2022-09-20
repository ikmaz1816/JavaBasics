package basics;

public class Lecture3ConditionalStatementsIFElseifElse {

	public static void main(String[] args) {
		int a=5;
		if(a==0)
		{
			System.out.println("a is composite");
		}
		else
		{
			if(a%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
		//Another way of writing can be
		if(a==0)
		{
			System.out.println("a is composite");
		}
		else if(a%2==0)
		{
			System.out.println("a is even");
		}
		else
		{
			System.out.println("a is odd");
		}

	}

}
