package level2.exercise6.application;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class TestArrayIndexOutOfBoundsException {

    @Test
    public void TestArrayException() {

        int[] numbers = {10, 20, 30};

        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> {
            int invalid = numbers[5];
        } );
    }
}
