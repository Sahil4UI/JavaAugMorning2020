
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
	
	public static int myPower(int a, int b)
	{
		if (b==0)
		{
			return 1;
		}
		int power = a* myPower(a,b-1);
		return power;
	}
	public static void main(String[] args) {
//		myFunction(1);
		System.out.println(myPower(5,2));
	}

}
