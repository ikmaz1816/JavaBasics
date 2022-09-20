package basics;

public class Lecture10DoWhile {

	public static void main(String[] args) {
		//The do while loop is an exit controlled loop
		//In this the condition is not checked while entering the loop 
		// hence the loop atleast runs once
		int i=6;
		do
		{
			System.out.println(i);
			i++;
		}while(i<5);

	}

}
