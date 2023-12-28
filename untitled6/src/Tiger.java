class Tiger extends Cat
{
    private static int counter = 0;

    public Tiger(String name)
    {
        super(name, 10000, 1000);
        counter++;
    }

    protected Tiger(String name, int runLimit, int swimLimit)
    {
        super(name, 20000, 2000);
        counter++;
    }

    public static int createdCount()
    {
        return counter;
    }
}