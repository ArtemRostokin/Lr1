class Cat extends Animal {
    private static int counter = 0;

    public Cat(String name) {
        super(name, 700, 0);
        counter++;
    }

    public static int count() {
        return counter;
    }
}
