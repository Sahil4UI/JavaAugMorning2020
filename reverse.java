package coreJava;

public class reverse {
	public static void main(String[] args) {
		String x = "Java Programming";
		String result ="";
		for (int i = x.length()-1;i>=0;i--)
		{
			result += x.charAt(i);
		}
		System.out.println(result);
	}
}
