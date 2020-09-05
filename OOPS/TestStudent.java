class TestStudent
{
	public static void main(String[] args) {
		Student ram = new Student();
//		RHS will create a new object & give the reference(addres) to ram in LHS
//		new -> new is a keyword and used to allocate memory during runtime
//		ram - reference variable
		
		
		ram.input(-4101, "RAM" , "B.Tech" , 90);
		
		ram.print();
		
		System.out.println("********************************");
		
		Student shyam = new Student();
		
		
		shyam.input(102 ,"Shyam", "BCA", -8000);
		
		shyam.print();
		
		
	
		
		
	}
}