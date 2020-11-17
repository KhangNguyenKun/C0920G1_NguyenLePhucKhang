package _16_IO_in_java.exercise;

import java.io.*;

public class OptionalReader {
    public static void main(String[] args) {
        String path = "src/_16_IO_in_java/exercise/practise.txt";
        String line ="";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line= bufferedReader.readLine()) != null){
//                String[] values = line.split(",");
                bufferedReader.readLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
