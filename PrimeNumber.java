import java.util.Scanner;
public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		String isPrime = "Prime"; //lets assume that number is prime
		sc.close();
		
		
		for (int i =2 ; i<=num-1;i++)
		{
			if (num%i==0)
			{
				//number is not prime
				isPrime="Not Prime";
				break;
			}
		}
		
		if (isPrime =="Prime")
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
