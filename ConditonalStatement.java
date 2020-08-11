
public class ConditonalStatement {
	public static void main(String[] args) {
//		int a = 200;
//		int b = -100;
//		
////		if (a>b)
////		{
////			System.out.println(a);
////		}
////		else{
////			System.out.println(b);
////		}
//		int max = (a>b)?a:b;
//		System.out.println(max);
		int a,b,c;
		a=5;
		b = 5;
		c= 8;
		
		if (a+b>c && b+c>a && c+a>b)
		{
			if (a==b && b==c && c==a)
			{
				System.out.println("Equilateral Traingle");
			}
			else if(a==b || b==c || c==a)
			{
				System.out.println("Isoceles Traingle");
			}
			else {
				System.out.println("Scalene Traingle");
				
			}
		}
		else {
			System.out.println("Traingle cannot be formed");
		}
	}

}
