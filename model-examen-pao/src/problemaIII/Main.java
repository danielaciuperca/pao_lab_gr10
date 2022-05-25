package problemaIII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        ComputeWordFrequency computeWordFrequency1 =
                new ComputeWordFrequency(word, "src/problemaIII/exemplu_1.txt");
        Thread t1 = new Thread(computeWordFrequency1);
        t1.start();

        ComputeWordFrequency computeWordFrequency2 =
                new ComputeWordFrequency(word, "src/problemaIII/exemplu_2.txt");
        Thread t2 = new Thread(computeWordFrequency2);
        t2.start();

        ComputeWordFrequency computeWordFrequency3 =
                new ComputeWordFrequency(word, "src/problemaIII/exemplu_3.txt");
        Thread t3 = new Thread(computeWordFrequency3);
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();

            int totalFrequency = computeWordFrequency1.getFrequency() +
                    computeWordFrequency2.getFrequency() +
                    computeWordFrequency3.getFrequency();
            System.out.println("Frequency: " + totalFrequency);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
