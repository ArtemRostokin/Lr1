class Scorpio extends Arachnids
{
    private static String habitat  = "";
    public Scorpio(String name)
    {
        super(name, 10, 0);
        habitat = "Пустыня";

    }
    public static void getHabitat()
    {
        System.out.println("Место обитания паукообразного под названием Скорпион -  " + habitat);
    }
}