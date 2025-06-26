package level2.exercise7.application;

import org.junit.Test;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestOptional {

    @Test
    public void OptionalEmpty() {
        Optional<String> opt = Optional.empty();

        assertThat(opt)
                .isEmpty();
    }

}
