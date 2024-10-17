package Mess;

class MessageThread extends Thread {
    private String message;
    private int interval;

    public MessageThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class MultiThreadMessages {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new MessageThread("Good morning", 1000));
        Thread thread2 = new Thread(new MessageThread("Hello", 2000));
        Thread thread3 = new Thread(new MessageThread("Welcome", 3000));

        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
