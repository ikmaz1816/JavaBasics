package basics;

public class IFELSEBITWISE {

	public static void main(String[] args) {
		/*
		 if both the conditions are true then and only then the output is true
		 	& ->AND
		 */
		int a=3;       
		if(a > 5 && a!=7)   
		{
			System.out.println("WIN");
		}
		/*
		  It checkes for both the conditions
		  True & True it executes
		  True & false doesnt execute
		  False & true doesnt execute
		  False & false doesnt execute
		  
		  If the first condition fails then it doesnt checks the other condition
		  
		  If the first condition is true then only it will check the next condition
		 */
		
		if(a>5 || a!=7)
		{
			System.out.println("LOSE");
		}
		/*
		 Or Condition 
		 If anyone condition is true the block will execute
		 
		 If the first condition is false then it looks for the second condition
		 
		 If the first condition is true it will not check for the other condition
		 */
		// true-> False false->true
		if(!(a>5)) 
		{
			System.out.println("it is greater than 5");
		}

	}

}
