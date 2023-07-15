import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        for(int i =0;i<10;i++){
            final int taskNum = i;
            executor.submit(()->{
                System.out.println("Task " + taskNum + " started.");
                //perform some task in parallel here
                System.out.println("Task " + taskNum + " finished.");
            });
        }
        executor.shutdown();
    }
}