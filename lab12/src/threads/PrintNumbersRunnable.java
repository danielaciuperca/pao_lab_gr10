package threads;

// defineste un task ce poate fi executat de un thread
public class PrintNumbersRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 40; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
