public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = {
                new Cat("Barsik"),
                new Dog("Bobik"),
                new Tiger("Sherhan"),
                new БелМедведь("Белый Медведь"),
                new Амур("Амурский Тигр"),
                new Горностай("Горностай")
        };

        for (Animal animal : animals)
        {
            animal.run(400);
            animal.swim(1200);
        }

        System.out.println("Создано Краснокнижных: " + Red.createdCount());
        System.out.println("Создано животных: " + Animal.createdCount());
        System.out.println("Создано собачьих: " + Dog.createdCount());
        System.out.println("Создано тигров: " + Tiger.createdCount());
        System.out.println("Создано кошачьих: " + Cat.createdCount());
        System.out.println("Создано Амурских тигров: " + Амур.createdCount());
        ((Амур) animals[4]).roar();
        ((БелМедведь) animals[3]).count();
        ((Горностай) animals[5]).count();
        ((Амур) animals[4]).count();
    }
}
