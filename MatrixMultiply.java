
public class MatrixMultiply {
	public static void main(String[] args) {
		int x[][] = {{1,2},{2,1}};
		int y[][] = {{2,3},{1,3}};
		int sol[][] = new int[2][2];
		
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					sol[i][j]+=x[i][k]*y[k][j];
				}
			}
		}
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(sol[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
