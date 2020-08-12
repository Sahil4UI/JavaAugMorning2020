
public class Fibonacci {
	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
//		int third = 0;
		System.out.println(first);
		System.out.println(second);
		
		for (int i=0;i<8;i++)
		{
			int third = first+second;
			System.out.println(third);
			first = second;
			second = third;
		}
	
	}
}
