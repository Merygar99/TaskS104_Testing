package level2.exercise4.model;

import java.util.Objects;

public class Circle extends Polygon {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle circle)) return false;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
