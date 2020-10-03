public class C_Chaining {
    C_Chaining()
    {
        this(10);
        System.out.println("Default Constructor");
    }
    C_Chaining(int a)
    {
        this(20,30);
        System.out.println("a : "+a);
    }
    
    C_Chaining(int a,int b)
    {
        this(40,50,60);
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    C_Chaining(int a,int b,int c)
    {
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);

    }
    
    
}
