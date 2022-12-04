package LambdaExpressions;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {

    public static void main(final String[] arguments) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(4);
        for(int i =0;i<10;i++){
            executor.submit(new Run());
        }
       executor.shutdown();
    }
}

class Run implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello");
    }
}
