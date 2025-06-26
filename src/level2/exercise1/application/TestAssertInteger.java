package level2.exercise1.application;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestAssertInteger {
    int number1 = 5;
    int number2 = 10;
    int number3 = 5;

  @Test
  public void checkInteger() {
      assertThat(number1)
              .isEqualTo(number3)
              .isNotEqualTo(number2);
  }
}
