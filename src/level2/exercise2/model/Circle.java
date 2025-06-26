package level2.exercise2.model;

import java.util.Objects;

public class Circle {
    private int radius;

    public Circle(int side) {
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
