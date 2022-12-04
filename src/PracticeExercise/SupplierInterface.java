package PracticeExercise;

import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String args[]){

        Supplier<String> supplier = () -> "Anshu";
        System.out.println(supplier.get());

    }
}
