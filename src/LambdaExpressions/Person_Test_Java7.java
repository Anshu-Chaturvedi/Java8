package LambdaExpressions;

import java.util.*;

public class Person_Test_Java7 {

    public static void main(String srgs[]){
        List<Person> personList = Arrays.asList(
                new Person(2, "Anshu", "Chaturvedi"),
                new Person(4, "Bharati", "Tripathi"),
                new Person(1, "Kusum", "Chaturvedi"),
                new Person(3, "Avinash", "Sharma")
        );

        //Sort list based on last name
        Collections.sort(personList, (Person o1, Person o2) -> o1.getLastName().compareTo(o2.getLastName()));

        //print all names
        printConditionally(personList, new Condition_L() {
            @Override
            public boolean test(Person p) {
                return true;
            }
        });

        //print when last name starts with 'C'
      printConditionally(personList, new Condition_L() {
          @Override
          public boolean test(Person p) {
              return p.getLastName().startsWith("C");
          }
      });
    }

    public static void printConditionally(List<Person> personList, Condition_L condition){

        for(Person p : personList){
              if(condition.test(p))
                System.out.println(p);
        }
    }
}

interface Condition_L{
    public boolean test(Person p);
}
