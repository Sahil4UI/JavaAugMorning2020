import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		sc.close();
		int sum;
		for (sum=0;num !=0; num=num%10)
		{
			int rem = num%10;
			
			sum = sum+rem;
			
//			num=num/10;
		}
		System.out.println(sum);
		
	}
}
