
public class IterativeStatement {

	public static void main(String[] args) {
		
//		for (int num=2 ; num <= 20 ; num=num+2)
//		{
//			System.out.println(num);
//		}
		
//		for (int num=10 ; num >=1 ; num--)
//		{
//			System.out.println(num);
//			
//			if (num == 5)
//			{
//				break;
//				it transfers the flow of program to the outside of loop
//			}
//			
//	
//		}
		
		for (int num=1;num<=50;num++)
		{
			if (num%5 != 0)
			{
				continue;
//				it is used to transfer the control flow of program to the starting of loop
			}
			System.out.println(num);
		}
	}
}
