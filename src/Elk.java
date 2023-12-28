class Elk extends Artiodactyls
{
    private static int count = 0;
    public Elk(String name)
    {
        super(name, 500, 1100);
        count = 1693;

    }
    public static void getCount()
    {
        System.out.println("Число вида под названием - Лось " + " " + count);
    }

    public void running() {
        System.out.println(name + " бежит");
    }
}