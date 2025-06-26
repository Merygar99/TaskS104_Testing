package level2.exercise4.application;

import level2.exercise4.model.Circle;
import level2.exercise4.model.Square;
import level2.exercise4.model.Polygon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TestArrayListObjects {

    Square square1 = new Square("square1", 4);
    Square square2 = new Square("square2", 5);
    Circle circle1 = new Circle("circle1", 2);

    ArrayList<Polygon> polygons = new ArrayList<>();

    @Test
    public void ArrayListObjectsTest() {
        polygons.add(square1);
        polygons.add(square2);
        polygons.add(circle1);

        assertThat(polygons)
                .contains(square1, square2, circle1);
    }

    @Test
    public void NoDuplicatesArrayList() {
        polygons.add(square1);
        polygons.add(square2);
        polygons.add(circle1);

        Set<Polygon> withoutDuplicates = new HashSet<>(polygons);

        assertThat(polygons.size()).isEqualTo(withoutDuplicates.size());
    }

    public void TestAddOneLess() {
        polygons.add(square1);
        polygons.add(square2);

        assertThat(polygons).doesNotContain(circle1);
    }

}
