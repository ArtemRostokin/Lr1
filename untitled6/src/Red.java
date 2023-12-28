abstract class Red extends Animal
{
    public static int counter = 0;

    protected int count;

    public Red(String name, int runLimit, int swimLimit)
    {
        super(name, runLimit, swimLimit);
        counter++;
    }

    public static int createdCount()
    {
        return counter;
    }

    public void count()
    {
        System.out.println("Число Ваида под названием - " + name + " " + count);
    }
}