package basics;

public class BreakAndContinue {

	public static void main(String[] args) { 
		for(int i=0;i<10;i++)
		{
			if(i==4)
				break;
			System.out.println(i);
		}
		for(int i=0;i<10;i++)
		{
			if(i==4)
				continue;
			System.out.println(i);
		}
         //break statement terminates the loop
		//continue statement skips that part of iteration and moves to next step of execution
	}

}
