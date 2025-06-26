package level1.exercise3.application;

import org.junit.*;

public class ArrayIndexOutOfBoundsTest {

@Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOutOfBounds() throws Throwable {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[10]);
    }

}
