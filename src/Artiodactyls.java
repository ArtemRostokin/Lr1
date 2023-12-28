abstract class Artiodactyls extends Animal {

    public static int counter = 0;

    public Artiodactyls(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        counter++;
    }

    public static int count() {
        return counter;
    }
}