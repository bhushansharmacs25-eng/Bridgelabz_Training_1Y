package java_interfaces.FunctionalInterfaces;

public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Background job is running asynchronously...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Job finished.");
        };
        
        Thread thread = new Thread(task);
        thread.start();
        
        System.out.println("Main thread is free to do other things.");
    }
}
