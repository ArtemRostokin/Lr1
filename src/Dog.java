class Dog extends Animal
{
    private static int counter = 0;
    public Dog(String name)
    {
        super(name, 900, 300);
        counter++;
    }
    public static int count() {
        return counter;
    }


}
