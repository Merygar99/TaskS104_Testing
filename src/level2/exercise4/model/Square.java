package level2.exercise4.model;

import java.util.Objects;

public class Square extends Polygon {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(side);
    }
}
