//Factorial using Modulo
class NFactorial
{
	static int fact(int n)
	{
		int ans = 1;
		for(int i=1; i<=n; i++)
		{
			ans = i*ans;
		}
		return ans;
	}
	public static void main(String args[])
	{
		int mod = 47;
		System.out.println(fact(5)%47);
	}
}
		