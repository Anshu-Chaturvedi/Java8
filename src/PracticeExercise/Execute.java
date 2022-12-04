package PracticeExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Execute {

public static void main(String args[]) {

    List<People> peopleList = Arrays.asList(
            new People(2, "Anshu", "Chaturvedi"),
            new People(4, "Bharati", "Tripathi"),
            new People(1, "Kusum", "Chaturvedi"),
            new People(3, "Avinash", "Sharma")
    );

    Collections.sort(peopleList, new Comparator<People>() {
        @Override
        public int compare(People o1, People o2) {

            return o1.getLastName().compareTo(o2.getLastName());
        }
    });

    for (People people : peopleList) {
        System.out.println(people.getLastName());
    }


}


}






