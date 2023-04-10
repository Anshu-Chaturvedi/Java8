package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Person_Test_Java8 {

    public static void main(String srgs[]){
        List<Person> personList = Arrays.asList(
                new Person(2, "Anshu", "Chaturvedi"),
                new Person(4, "Bharati", "Tripathi"),
                new Person(1, "Kusum", "Chaturvedi"),
                new Person(3, "Avinash", "Sharma")
        );

        //for-each loop
        //personList.forEach(per -> System.out.println(per));

        //method reference
        //personList.forEach(System.out::println);

        //Sort list based on last name
        Collections.sort(personList, (Person o1, Person o2) -> o1.getLastName().compareTo(o2.getLastName()));

        //print all names
        printConditionally(personList, (Person p) -> true);

        //print when last name starts with 'C'
        printConditionally(personList, (Person p) -> p.getLastName().startsWith("C"));
    }

    public static void printConditionally(List<Person> personList, Predicate<Person> condition){

        for(Person p : personList){
            if(condition.test(p))
                System.out.println(p);
        }
    }
}

/*interface Condition_L1{
    public boolean test(Person p);
}*/
