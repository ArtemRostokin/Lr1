class Tiger extends Animal
{
    private static int counter = 0;
    public Tiger(String name)
    {
        super(name, 1000,1000);
        counter++;
    }

    public static int count() {
        return counter;
    }

}