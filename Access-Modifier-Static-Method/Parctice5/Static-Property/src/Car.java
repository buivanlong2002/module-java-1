public class Car {
    private final String name;
    private final String color;
    private final String engine;
    public static int numberCars;
    public Car(String name, String color, String engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
        numberCars++;
    }
    void display() {
        System.out.println(numberCars + " " + name + " " + color + " " + engine);
    }
}
