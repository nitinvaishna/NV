// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// T = sqrt(n)   S = O(1)
/*	1 Factors
	2 Prime Factors
	3 IsPrime
	4 Prime Seive*/
class NPrimeClass 
{
    static void factors(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                 System.out.print(i + " ");
            }
        }
    }
    
    static void factorsSqrt(int n)
    {
        for(int i = 1; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
                if(n/i!=0)  //this is to remove duplicate
                {
                 System.out.println(n/i + " ");   
                }
            }
        }
    }
    
    static void primeFactors(int n)
    {
        while(n%2==0)
        {
            n = n/2;
            System.out.print(2+ " ");
        }
        
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
            {
                n = n/i;
                System.out.print(i+" ");
            }
         }
         
         if(n>1)
         {
            System.out.print(n + " ");
         }
         System.out.println();
     }
	 
	 static boolean isPrime(int n)
	 {
		 for(int i=2;i<n;i++)
		 {
			if(n%i==0)
			{
				System.out.println("Not Prime");
				return false;
			}
		 }
		 System.out.println(" Prime");
				return true;
	 }
	 
	 static boolean isPrimeSqrt(int n)
	 {
		 
		 if(n<=1){
			     System.out.println("Not Prime");
				 return false;
		 }   
		 for(int i=2; i<=Math.sqrt(n); i++)
		 {
			 if(n%i==0)
			 {
				// System.out.println("Not Prime");
				 return false;
			 }
		 }
		 //System.out.println(" Prime");
		 return true;
	 }
		 		
      
    public static void main(String[] args) 
    {
        System.out.println("Hello, World!");
        factors(10);
        System.out.println("ok");
        factors(20);
        System.out.println("ok");
        factorsSqrt(30);
        
		System.out.println();
        System.out.println();
        primeFactors(71);
        System.out.println();
        primeFactors(83);
        System.out.println();
        primeFactors(21);
		
		System.out.println();
		isPrime(22);
		isPrime(19);
		
		System.out.println();
		System.out.println("Time Complexity reduced to Sqrt n");
		isPrimeSqrt(22);
		isPrimeSqrt(19);
		isPrimeSqrt(1);
		
		System.out.println();
		System.out.println("Time complexity n*sqrt(n)");
		
		
		
		
		int n =100;
		for(int i=0; i<=n; i++)
		{
			if(isPrimeSqrt(i)){
				System.out.print(i + " ");
			}
		}
        
    }
}