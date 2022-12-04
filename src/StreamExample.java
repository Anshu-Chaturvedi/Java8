import PracticeExercise.People;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String args[]){

       /* List<People> peopleList = Arrays.asList(new People(1,"Anshu","Chaturvedi"),
                                                new People(2,"Avinash","Chaturvedi"),
                                                new People(3,"Kusum","Chaturvedi"));

        peopleList.stream().filter((p) -> p.getFirstName().startsWith("A")).forEach(p -> System.out.println(p));
*/

       List<Integer> al = new ArrayList<Integer>();
        al.add(6);
        al.add(9);
        al.add(2);
        al.add(8);
        al.add(10);

        /*al.stream().map(i -> i+10).filter(i -> i%2 ==0 ).forEach(i -> System.out.println(i));
        al.stream().filter(i -> i%2 ==0 ).forEach(i -> System.out.println(i));*/
        System.out.println(al.stream().filter(i -> i%2 ==0 ).count());
        //al.stream().sorted((i1,i2) -> -i1.compareTo(i2)).forEach( i -> System.out.println(i));
        //List<Integer> al1 = al.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        //System.out.println(al.stream().min((i1,i2) -> i1.compareTo(i2)).get());
        al.stream().map(i -> i*i).forEach(i -> System.out.println(i));



    }
}
