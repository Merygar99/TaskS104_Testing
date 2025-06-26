package level1.exercise2.application;

import level1.exercise2.model.CalculateId;
import org.junit.*;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class CalculateIdTest {
    CalculateId id1 = new CalculateId(12345678);
    CalculateId id2 = new CalculateId(87654321);
    CalculateId id3 = new CalculateId(11223344);
    CalculateId id4 = new CalculateId(55667788);
    CalculateId id5 = new CalculateId(99887766);
    CalculateId id6 = new CalculateId(44556677);
    CalculateId id7 = new CalculateId(33445566);
    CalculateId id8 = new CalculateId(22113344);
    CalculateId id9 = new CalculateId(77889900);
    CalculateId id10 = new CalculateId(66778899);

    ArrayList<CalculateId> idsWithoutLetter = new ArrayList<>();

    @Test
    public void testCalculateId() throws Throwable {
        idsWithoutLetter.add(id1);
        idsWithoutLetter.add(id2);
        idsWithoutLetter.add(id3);
        idsWithoutLetter.add(id4);
        idsWithoutLetter.add(id5);
        idsWithoutLetter.add(id6);
        idsWithoutLetter.add(id7);
        idsWithoutLetter.add(id8);
        idsWithoutLetter.add(id9);
        idsWithoutLetter.add(id10);

        ArrayList<String> idsWithLetter = new ArrayList<>();

        for(int i = 0; i < idsWithoutLetter.size(); i++) {
            idsWithLetter.add(idsWithoutLetter.get(i).getId() + idsWithoutLetter.get(i).calculateIdLetter());
        }

        ArrayList<String> comprobateIds = new ArrayList<>();

        comprobateIds.add("12345678Z");
        comprobateIds.add("87654321X");
        comprobateIds.add("11223344B");
        comprobateIds.add("55667788Z");
        comprobateIds.add("99887766P");
        comprobateIds.add("44556677L");
        comprobateIds.add("33445566R");
        comprobateIds.add("22113344V");
        comprobateIds.add("77889900D");
        comprobateIds.add("66778899D");

        boolean aux = true;
        for(int i = 0; i < idsWithLetter.size(); i++) {
            if(!idsWithLetter.get(i).equalsIgnoreCase(comprobateIds.get(i))) {
                aux = false;
            }
        }

        assertTrue(aux);

    }

}
