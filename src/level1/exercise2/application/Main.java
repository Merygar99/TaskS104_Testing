package level1.exercise2.application;

import level1.exercise2.model.CalculateId;

public class Main {
    public static void main(String[] args) {

        CalculateId id1 = new CalculateId(47305631);
        id1.calculateIdLetter();

        System.out.println("The complete ID is: " + id1.getId() + id1.calculateIdLetter());
    }


}
