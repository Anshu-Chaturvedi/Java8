import PracticeExercise.People;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String args[]){

        List<People> peopleList = Arrays.asList(new People(1,"Anshu","Chaturvedi"),
                                                new People(2,"Avinash","Chaturvedi"),
                                                new People(3,"Kusum","Chaturvedi"),
                                                new People(4,"Bharati","Tripathi"));

        //for-each eg
        //peopleList.forEach(people -> System.out.println(people));
        //peopleList.forEach(System.out::println);

        //equals to al1.stream().forEach(al -> System.out.println(al));
        //al1.stream().forEach(System.out::println);

        //----------------------------------------------------------------

        //filter eg
        //peopleList.stream().filter(people -> people.getLastName().startsWith("C")).forEach(System.out::println);
        //peopleList.stream().filter(people -> people.getLastName().startsWith("C")).filter(people -> people.getFirstName().startsWith("K")).forEach(System.out::println);
        //peopleList.stream().filter(people -> people.getLastName().startsWith("C") &&  people.getFirstName().startsWith("K")).forEach(System.out::println);

        //----------------------------------------------------------------

        //Collector eg
        //List<People> al = peopleList.stream().filter(people -> people.getFirstName().startsWith("A")).collect(Collectors.toList());
        //al.stream().forEach(System.out::println);

        //count method
        //System.out.println(peopleList.stream().collect(Collectors.counting()));

        //toCollection eg : toCollection requires a Supplier interface implementation with constructor been passed of Collection O/P is expected
        ArrayList<People> al1 = peopleList.stream().filter(people -> people.getFirstName().startsWith("A")).collect(Collectors.toCollection(() ->new ArrayList<People>()));
        al1.forEach(System.out::println);

        //printing whole object = peopleList.stream().collect(Collectors.toMap( People::getFirstName , a -> a));
        //Map<String, People> map = peopleList.stream().collect(Collectors.toMap( People::getFirstName , Function.identity()));
        //resolving duplicate key issue , a bi-function is supplied in toMap()
        //Map<String, People> map = peopleList.stream().collect(Collectors.toMap( People::getFirstName , Function.identity(),(oldPeople, newPeople) -> oldPeople));
        //converting HashMap to TreeMap
        //Map<String, People> map = peopleList.stream().collect(Collectors.toMap( People::getFirstName , Function.identity() ,(oldPeople, newPeople) -> oldPeople, TreeMap :: new));
        //printing a part of object as value
        //Map<String, People> map = peopleList.stream().collect(Collectors.toMap( People::getFirstName , People::getLastName));

        //Map<String,People> map = peopleList.stream().collect(Collectors.toMap()

        //2 ways to print a map in Java 8
        //map.entrySet().stream().forEach(a -> System.out.println(a.getKey() + "-> " +a.getValue()));
        //map.forEach((k,v) -> System.out.println(k+"-> "+v));

        //iterating map over a condition
        //map.entrySet().stream().filter(k -> k.getValue().getFirstName().equalsIgnoreCase("Anshu")).forEach(System.out::println);

        //----------------------------------------------------------------

        //map with filter eg
        //peopleList.stream().filter(people -> people.getFirstName().startsWith("A")).map(people -> people.getFirstName().concat("A")).forEach(System.out::println);

        //----------------------------------------------------------------

        //mapToInt eg
        //peopleList.stream().filter(people -> people.getFirstName().startsWith("A")).mapToInt(people -> people.getId()).forEach(System.out::println);
        //System.out.println(peopleList.stream().filter(people -> people.getFirstName().startsWith("A")).mapToInt(people -> people.getId()).sum());

        //List<String> al = Arrays.asList("1","2");
        //al.stream().mapToInt(num -> Integer.parseInt(num)*2).forEach(System.out::println);

        //----------------------------------------------------------------

        // flat map eg

        /* class User{
         String name;
         public String getName() {
                 return name;
             }
         public User(String name, int age, List<Integer> phoneNums) {
                 this.name = name;
                 this.age = age;
                 this.phoneNums = phoneNums;
             }
             public int getAge() {
                 return age;
             }

             public List<Integer> getPhoneNums() {
                 return phoneNums;
             }
             int age;
         List<Integer> phoneNums;
         }

        List<User> userList = Arrays.asList(
                new User("Anshu",33,Arrays.asList(999,123,345,754)),
                new User("Bharati",32,Arrays.asList(599,823,305,714)),
                new User("Abhinav",34,Arrays.asList(930,121,340,784))
        );

         //using Map , we can get 1st level data from User list but not 2nd level data like phone nos .
         //System.out.println(userList.stream().map(user -> user.getName()).collect(Collectors.toList()));

        //If we use Map to get 2nd level data , it'll show as lists of lists , it'll not flatten the data
         //System.out.println(userList.stream().map(user -> user.getPhoneNums()).collect(Collectors.toList()));

        //Use of Flat Map
       // System.out.println(userList.stream().flatMap(user -> user.getPhoneNums().stream().filter(age -> age.equals(999))).collect(Collectors.toList()));

        //System.out.println(userList.stream().map(user -> user.getPhoneNums().stream().filter(age -> age.equals(33))).collect(Collectors.toList()));*/







    }
}
