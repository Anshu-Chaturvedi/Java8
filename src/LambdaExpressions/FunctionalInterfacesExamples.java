package LambdaExpressions;

import java.util.function.Function;

public class FunctionalInterfacesExamples {
public static void main(String args[]) {

    //Function eg , accepts 1 param and returns 1 param
    Function<String,Integer> func = x -> x.length() ;
    System.out.println(func.apply("Anshu"));

    Function<Integer,Integer> func1 = y -> y*2 ;
    System.out.println(func.andThen(func1).apply("Anshu"));

    //----------------------------------------------------------------
}
}
























