package LambdaExpressions;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;
import java.util.Map;

public class Test {


    public static void main(String args[]) {

        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();

        hm.put(1,2);
        hm.put(2,4);
        hm.put(3,6);

        for(Map.Entry<Integer,Integer> m : hm.entrySet()){
            if(m.getValue() > 1){

            }
        }



    }

    public static void printlen(calc c) {

        System.out.println(c.findLength("Bharati"));
    }

}

@FunctionalInterface
interface Greet{

    void perform();
}

@FunctionalInterface
interface Greet1{
    void perform(String s);
}

@FunctionalInterface
interface calc{
    int findLength(String s);
}




class Greet_Imp implements Greet{

    @Override
    public void perform() {
        System.out.println("hello");
    }
}






















