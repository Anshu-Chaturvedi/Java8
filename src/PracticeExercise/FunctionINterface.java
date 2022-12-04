package PracticeExercise;

import java.util.function.Function;

public class FunctionINterface {

    public static void main(String args[]){

     /*   CalculateSize sizeClass1 = (int n) -> {
            if(n<=5)
                return "Small";
            else
                return "Big";
        };
        System.out.println(sizeClass1.doPrint(7));*/

        Function<Integer,String> function = (n) -> {
            if(n<=5)
                return "Small";
            else
                return "Big";
        };
        System.out.println(function.apply(7));

    }

}

/*
interface CalculateSize{

    String doPrint(int n);
}
*/


