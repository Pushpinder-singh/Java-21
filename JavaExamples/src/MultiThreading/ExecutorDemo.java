package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<String> result = executor.submit(() -> {
            Thread.sleep(2000);
            return "Payment is done !";
        });

        // Do other work

        System.out.println("Payment Success :::   " + result); // Blocking call
    }

}
