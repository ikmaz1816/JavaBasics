package basics;

public class Lecture4ConditionalStatementsNestedIf {

	public static void main(String[] args) {
		int a=12;
		if(a>5)
		{
			if(a>7)
			{
				if(a>9)
				{
					if(a>11)
					{
						System.out.println("11");
					}
				}
			}
		}
		else
		{
		System.out.println("a is lesser than 5");	
		}

	}

}
