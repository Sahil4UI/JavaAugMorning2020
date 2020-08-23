
public class String1 {
	public static void main(String[] args) {
		String x = "Hello";
//		String y = x;
		String x1 = new String("Hello");
//		System.out.println(x==x1); 
//		System.out.println(x.equals(x1));
		
		String a = "Hello EveryOne llllllllll";
//		System.out.println(a.replaceFirst("l","J"));
//		
//		System.out.println(a.replace("l","J"));
//		System.out.println(a.replaceAll("l","J"));
		
//		System.out.println(a.toUpperCase());
		a=a.toLowerCase();
//		System.out.println(a);
		
		int length = a.length();
//		System.out.println(length);
		
		String s1="Jatin a";
		String s2 = "Jain";
//		System.out.println(s1+s2);
		String merge= s1.concat(s2);
//		System.out.println(merge);
		
//		System.out.println(s1.startsWith("J"));
//		System.out.println(s1.endsWith("n"));
//		System.out.println(s1.indexOf("a",2));
//		System.out.println(s1.isEmpty());
		String p = "How are you ?";
		String m[]=p.split(" ");
		System.out.println(m[3]);
		
		String c1 = "     JATIN     ";
		System.out.println(c1.trim());
		
	}

}
