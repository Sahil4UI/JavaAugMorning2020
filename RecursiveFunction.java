
public class RecursiveFunction {
	
//	public static void myFunction(int x)
//	{
//	Base Case
//		if (x>10)
//		{
//			return;
//		}
//		
//
//		System.out.println(x);
//		
//		myFunction(x+1);
//		
//		System.out.println(x);
//	}
	
//	public static int myPower(int a, int b)
//	{
//		if (b==0)
//		{
//			return 1;
//		}
//		int power = a* myPower(a,b-1);
//		return power;
//	}
	
//	public static int fibonacci(int n)
//	{
//		if (n<=1)
//		{
//			return n;
//		}
//		return fibonacci(n-1)+fibonacci(n-2);
//	}
	
//	public static int sumDigits(int n)
//	{
//		if (n==0)
//		{
//			return 0;
//		}
//		return (n%10) + sumDigits(n/10);
//	}
	static int rev=0;
	static int base=1;
	public static int Reverse(int n)
	{
		if(n>0)
		{
			Reverse(n/10);
			rev += (n%10)*base;
			base=base*10;
		}
		return rev;
	}
	public static void main(String[] args) {
//		myFunction(1);
//		System.out.println(myPower(5,2));
//		System.out.println(fibonacci(1));
		System.out.println(Reverse(12345));
	}

}
