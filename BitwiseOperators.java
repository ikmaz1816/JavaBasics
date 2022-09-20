package basics;

public class BitwiseOperators {

	public static void main(String[] args) {
		/*
		 AND OPERATOR
		i1 i2 output
 		0  0    0
		1  0    0
		0  1    0
		1  1	1	 
		 high:-1 Low:-0
		 */
		int a=5;
		int b=3;
		System.out.println(a | b);
		/*
		 	8 4 2 1
		 	 
		 	0 1 0 1 ->5
	AND(*)	0 0 1 1 ->3
			
		 	0 0 0 1 
		 	&->AND operator
		 	
		 	0 1 0 0
		 	0 1 0 1
		 	
		 	0 1 0 0 ->4
		 	And states if both the inputs are high then and only then the output is high
		 	
		 */
//		System.out.println(a & b);
		
		/*	  output	
		  0 0 0
		  1 0 1
		  0 1 1
		  1 1 1
		  
		  
		  5-> 0 1 0 1
		  8-> 1 0 0 0
		  	  1	1 0	1->13
		  	| -> Or operand
		  Or states if any one input is high then the output is high
		  
		  Ex-OR
		  
		  ^ this is the symbol used to represent Ex-OR
		  
		  If one input is high and the other one is low then and only then the output is high
		  		output
		  0 0 	0
		  0 1	1
		  1 0	1
		  1 1	0
		  
		  8-> 1 0 0 0
		  5-> 0 1 0 1 ex-or
		      1 1 0 1->13
		      
		 ~12
		 -(number + 1)
		 -(12+1)=-13
		 
		 >> right shift operator
		 >>1
		 >>2
		 >>3
		 
		 x=10
		 
		 1 0 1 0 >> 1 -> 1 0 1       10
		 1 0 1  >> 1-> 1 0           5
		 1 0  >> 1->1				 2
		 1 >> 1-> 0					 1
		 							 0
		 							 / ->Quotient
		 	Right shift can be used as a division factor of 2
 		  
 		  Left shift <<
 		  
 		  1
 		  0 0 0 1 << 1 -> 0 0 1 0     2
 		  0 0 1 0 << 1 -> 0 1 0 0     4
 		  0 1 0 0 << 1->  1 0 0 0     8
 		  
 		  Left shift can be used as a multiplication factor of 2
		 */
		
		System.out.println(8 | 5);
		
		System.out.println(8 ^ 5);

		System.out.println(~12);
		
		System.out.println(10>>2);
		//10/2=5
		//5/2=2
		
		System.out.println(10<<2);
		//20  10 * 2=20
		//40  20 * 2=40
	}

}
