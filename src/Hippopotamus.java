class Hippopotamus extends Artiodactyls
{
    private static int count = 0;
    public Hippopotamus(String name)
    {
        super(name, 500, 1200);
        count = 873;
    }
    public static void getCount()
    {
        System.out.println("Число вида под названием - Бегемот " + " " + count);
    }
}