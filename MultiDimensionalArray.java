import java.util.Scanner;
public class MultiDimensionalArray {
	public static void main(String[] args) {
//		int arr[][] = new int[5][5];
		
		int arr[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		for (int row=0;row<arr.length;row++)
		{
			for (int col =0;col<3;col++)
			{
				System.out.print(arr[row][col]+ "       ");
			}
			System.out.println();
		}
		int row,col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row no : ");
		row = sc.nextInt();
		System.out.println("Enter col no : ");
		col = sc.nextInt();
		
		System.out.println(arr[row][col]);
		
		
	}
}
