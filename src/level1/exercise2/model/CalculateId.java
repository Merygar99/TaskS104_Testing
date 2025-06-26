package level1.exercise2.model;

import java.util.ArrayList;
import java.util.List;

public class CalculateId {
    private int id;

    public CalculateId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Calculate DNI {" +
                "DNI = '" + id + '\'' + '}';
    }

    public String calculateIdLetter() {
        ArrayList<String> lettersOfDNI = new ArrayList<>(List.of("T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"));
        String DNILetter;
        DNILetter = lettersOfDNI.get(this.id % 23);
        return DNILetter;
    }
}
