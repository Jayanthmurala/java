// Import necessary packages
public class ThreadExample extends Thread {
    
    // Constructor
    public ThreadExample(String name) {
        // Setting the name of the thread using the parent class constructor
        super(name);
    }

    // The run method contains the code that will execute when the thread starts
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                // Pausing execution of the thread for a specified duration
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample("Thread 1");
        ThreadExample thread2 = new ThreadExample("Thread 2");

        // Starting the threads
        thread1.start();
        thread2.start();

        // Demonstrating some thread methods
        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 1 Priority: " + thread1.getPriority());

        // Changing priority
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.setName("jayanth");
        System.out.println("Thread 1 New Priority: " + thread1.getPriority());

        try {
            // Main thread waits for thread1 and thread2 to complete
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Thread 1 and Thread 2 have finished execution.");
    }
}
