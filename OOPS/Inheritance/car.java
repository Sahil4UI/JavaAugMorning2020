class car
{
    int gear=0;
    int speed=0;

    public void speedPlus(int increment)
    {
        speed += increment;
    }
    public void speedMinus(int decrement)
    {
        speed -= decrement;
        // speed = speed-decrement;
    }
    public void show()
    {
        System.out.println("Gear : "+gear);
        System.out.println("Speed : "+speed);
    }
}