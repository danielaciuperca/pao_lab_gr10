package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    /*
        Thread
        Runnable
        ExecutorServices

     */
    public static void main(String [] args) {
        // pe firul principal de executie al aplicatiei - main
        for(int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

        //1. crearea unui thread cu clasa Thread
        PrintNumbersThread printNumbersThread = new PrintNumbersThread(); // threadul se afla in stadiul NEW
        printNumbersThread.start(); // threadul va trece in stadiul de RUNNABLE si apoi automat in RUNNING

        // pe firul principal de executie al aplicatiei - main
        System.out.println(Thread.currentThread().getName() + ": " + printNumbersThread.getName());

        //2. crearea unui thread cu clasa Thread si interfata Runnable
        PrintNumbersRunnable printNumbersRunnable = new PrintNumbersRunnable();
        new Thread(printNumbersRunnable).start();

        //3. crearea unui thread cu ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            for(int i = 60; i <= 70; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        executorService.shutdown();
    }
}
