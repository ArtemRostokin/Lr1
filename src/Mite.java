class Mite extends Arachnids
{
    private static String habitat = "";

    public Mite(String name)
    {
        super(name, 10, 0);
        habitat = "Лес";

    }
    public static void getHabitat()
    {
        System.out.println("Место обитания паукообразного под названием Клещ -  " + habitat);
    }
}