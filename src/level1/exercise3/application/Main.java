package level1.exercise3.application;

public class Main {
    public static void main(String[] args) {

        outOfBoundsMethod();
    }
    public static void outOfBoundsMethod() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[10]);
    }
}
