class Амур extends Tiger
{
    private int count = 0;
    private static int counter = 0;

    public Амур(String name)
    {
        super(name, 500, 1000);
        count = 523;
        counter++;
        Red.counter++;
    }

    protected Амур(String name, int runLimit, int swimLimit)
    {
        super(name, 20000, 2000);
        counter++;
    }
    public void count()
    {
        System.out.println("Число Ваида под названием - " + name + " " + count);
    }
    public void roar()
    {
        System.out.println(name + " рычит");
    }
}
