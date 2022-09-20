package basics;

public class Lecture12IFBITWISE {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		if( a || b)//If anyone is true it will execute
		{
			System.out.println("Hello World");
		}
		if(a && b)//If both are true then it will execute
		{
			System.out.println("Hello World");
		}
		if(!a)//reverses it if  true makes it false
		{
			System.out.println("Hello World");
		}
	}

}
