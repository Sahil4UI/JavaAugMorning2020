
public class countVowels {
	public static void main(String[] args) {
		String x = "JATINJAIN87987$#@@@";
		x = x.toLowerCase();
		int vowelsCount=0,consCount =0,digitCount=0,special=0;
	
		for (int i=0;i<x.length();i++)
		{
			if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
			{
				if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u')
				{
					vowelsCount++;
				}
				else {
					consCount++;
				}
				
			}
			
			else if (x.charAt(i) >= '0' && x.charAt(i) <= '9')
			{
				digitCount++;
			}
			else {
				special++;
			}
		}
		System.out.println("vowels count : "+vowelsCount);
		System.out.println("cons count : "+consCount);
		System.out.println("Digit Count : "+digitCount);
		System.out.println("Special Count : "+special);
	}
}
