public class Main {
    public static void main(String[] args) {
        Animal[] animals =
                {
                        new Cat("Murzik"),
                        new Dog("Oskar"),
                        new Tiger("Henry"),
                        new Hippopotamus("Бегемот"),
                        new Camel("Верблюд"),
                        new Elk("Лось"),
                        new Mite("Клещ"),
                        new Scorpio("Скорпион"),
                        new Tarantula("Тарантул")
                };
        for (Animal animal : animals) {
            animal.run(800);
            animal.swim(600);
        }

        System.out.println("Создано животных: " + Animal.count());
        System.out.println("Создано Парнокопытных: " + Artiodactyls.count());
        System.out.println("Создано Паукообразных: " + Arachnids.count());
        System.out.println("Создано собак: " + Dog.count());
        System.out.println("Создано тигров: " + Tiger.count());
        System.out.println("Создано котов: " + Cat.count());
        ((Elk)animals[5]).running();
        Elk.getCount();
        Camel.getCount();
        Hippopotamus.getCount();
        Mite.getHabitat();
        Scorpio.getHabitat();
        Tarantula.getHabitat();
    }
}
