public class polymorphism {

    public void area(int radius)
    {
        System.out.println("Area of Circle : "+3.14*radius*radius);
    }
    
    public void area(double base,double height)
    {   
        System.out.println("Area of triangle : "+(0.5)*base*height);

    }
    public void area(int length , int breadth)
    {
        System.out.println("Area of rectangle : "+length*breadth);
    }

}
