package level2.exercise2.model;

import java.util.Objects;

public class Square {
    private int side;

    public Square(int side) {
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
