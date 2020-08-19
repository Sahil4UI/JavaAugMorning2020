import java.util.Scanner;
public class Functions {
//	Default function - without argument without return type.

//	function definition
//	public static void addition()
//	{
//		int a,b;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Two Numbers : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(a+b);
//		sc.close();
//		
//	}
//	without argument with return type
//	public static int addition()
//	{
//		int a,b;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter Two Numbers : ");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		sc.close();
//		return a+b;
//		
//		
//	}
//	with argument without return type
	public static int addition(int a , int b)
	{
		int k = a+b;
		return k;
	}
	
	public static void main(String[] args) {
//		
//		Functions obj = new Functions();
//		obj.addition();
//		int k =addition();
//		System.out.println(k);
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y =sc.nextInt();
		System.out.println(addition(x,y));
		sc.close();
		
	
	}
}
