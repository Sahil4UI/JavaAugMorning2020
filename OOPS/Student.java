class Student
{
//	instance variable
	//they came into memory when object is object
	private int rollNo;
	private String name;
//	camel case
	private String courseName;
	private int marks;
	
//	local variable
	
	public void input(int rollNo,String name ,String courseName , int marks)
	{
		if (rollNo >0)
		{
			this.rollNo = rollNo;
		}
		
		
		this.name = name;
		this.courseName = courseName;
		
		if (marks >0){
			this.marks = marks;
		}
		
		
	}
	
	public void print()
	{
		System.out.println("Roll No :"+this.rollNo);
		System.out.println("Name : "+this.name);
		System.out.println("Course Name : "+this.courseName);
		System.out.println("Marks : "+this.marks);
	}
	
	
}