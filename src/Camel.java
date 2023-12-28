class Camel extends Artiodactyls {
    private static int count = 0;
    private static int counter = 0;
    public Camel(String name) {
        super(name, 500, 1000);
        count = 757;
        counter++;
    }

    public static void getCount() {
        System.out.println("Число вида под названием - Верблюд " + " " + count);
    }

    public static int count() {
        return counter;
    }
}
