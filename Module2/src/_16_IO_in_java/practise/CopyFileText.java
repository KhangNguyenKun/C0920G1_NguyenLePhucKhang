package _16_IO_in_java.practise;

import java.io.*;
import java.util.Arrays;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/_16_IO_in_java/practise/sourceFile.csv")));
        String line = null;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src/_16_IO_in_java/practise/targetFile.csv")));
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
