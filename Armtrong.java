import java.util.Scanner;
public class Armtrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int temp = num;
		sc.close();
		int sum;
		for (sum=0;num !=0; num=num/10)
		{
			int rem = num%10;
			
			sum = sum+rem*rem*rem;
			
//			num=num/10;
		}
		
		if(temp == sum)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not an ArmStrong Number");
		}
		
		
	}
}
