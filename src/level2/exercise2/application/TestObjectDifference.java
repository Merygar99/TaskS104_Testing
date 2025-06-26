package level2.exercise2.application;

import level2.exercise2.model.Circle;
import level2.exercise2.model.Square;
import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestObjectDifference {

    Square square1 = new Square(4);
    Square square2 = new Square(4);
    Circle circle1 = new Circle(2);

    @Test
    public void checkObjects() {
        assertThat(square1)
                .isEqualTo(square2)
                .isNotEqualTo(circle1);
    }
}
