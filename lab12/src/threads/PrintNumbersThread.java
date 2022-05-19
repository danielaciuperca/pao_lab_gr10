package threads;

public class PrintNumbersThread extends Thread {

    @Override
    public void run() {
        for(int i = 20; i <= 30; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
