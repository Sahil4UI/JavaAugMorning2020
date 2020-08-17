
public class PatternProblems {
	
	public static void main(String[] args) {

//		*
//		**
//		***
//		****
//		*****
		
//		for (int i=1;i<=5;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
//		for (int i=1;i<=5;i++)
//		{
//			for (int j=5-i;j>=1;j--)
//			{
//				System.out.print(" ");
//			}
//			for (int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
//		for (int i=1;i<5;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for (int k=1;k<=5-i;k++)
//				{
//					System.out.print("*");
//				}
//			System.out.println();
//		}
//		new pattern
//		for (int i=1;i<=5;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//			
//		}
//		
//		for (int i=5;i>1;i--)
//		{
//			for (int j=1;j<=i-1;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		int columns = 1;
		for (int i=1;i<5*2;i++)
		{
			for (int j=1;j<=columns;j++)
			{
				System.out.print("* ");
			}
			if (i < 5)
			{
				columns++;
			}
			else {
				columns--;
			}
			
			System.out.println();
		}
		
		
	}

}
