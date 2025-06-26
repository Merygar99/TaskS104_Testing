package level2.exercise3.application;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestArrayIntegerDifference {

    int[] list1 = { 1, 2, 3, 4, 5 };
    int[] list2 = { 1, 2, 3, 4, 5 };

    @Test
    public void differenceArrayInteger() {
        assertThat(list1)
                .isEqualTo(list2);
    }
}
