class Tarantula extends Arachnids
{
    private static String habitat = "";
    public Tarantula(String name)
    {
        super(name, 10, 0);
        habitat = "Степи";

    }
    public static void getHabitat()
    {
        System.out.println("Место обитания паукообразного под названием Тарантул -  " + habitat);
    }
}