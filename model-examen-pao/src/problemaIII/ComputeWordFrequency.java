package problemaIII;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeWordFrequency implements Runnable {

    private String word;
    private String filename;
    private int frequency;

    public ComputeWordFrequency(String word, String filename) {
        this.word = word;
        this.filename = filename;
    }

    @Override
    public void run() {
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filename)))) {
            String line = "";
            while( (line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("[().,;!? ]+");
//                if(line.contains(word)) {
//                    frequency++;
//                }
                for(String part : parts) {
                    if(part.equals(word)) {
                        frequency++;
                    }
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public int getFrequency() {
        return frequency;
    }
}
