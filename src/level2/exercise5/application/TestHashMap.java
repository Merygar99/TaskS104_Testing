package level2.exercise5.application;

import org.junit.Test;
import java.util.HashMap;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class TestHashMap {

    @Test
    public void TestHashMapKeys() {

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("John", 34);
        people.put("Mery", 25);
        people.put("Paul", 45);
        people.put("Rachel", 40);

        assertThat(people).containsKey("Mery");
    }
}
