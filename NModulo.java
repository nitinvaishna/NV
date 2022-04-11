class NModulo
{
	public static void main(String args[])
	{
		/*
			int a = Integer.MAX_VALUE;
			System.out.println(a);
		*/
		
		int a = 2147483647,	b = 2;
		System.out.println(a);
		
		int N = a+1;
		System.out.println(N%7);	//This will Going to start from the End 
								//				 AND
								// Gives The answer in Negative(from back)
								
		int Num1 = a+b;
		System.out.println(Num1%7);	//Gives wrong answer
		
		int Num2 = ((a%7)+(b%7))%7;	//Gives right answer
		System.out.println(Num2);
	}
}