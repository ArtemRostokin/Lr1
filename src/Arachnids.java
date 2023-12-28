abstract class Arachnids extends Animal {

    public static int counter1 = 0;

    public Arachnids(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        counter1++;
    }

    public static int count() {
        return counter1;
    }
}