package homework_chanh_file.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class IoTextFile {

    private static File file = null;


    public static List<String> readFromCSVFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
        file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            bufferedReader.close();
//            fileReader.close();
             String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static <T> void writeToCSVFile(String pathFile, List<T> tList, boolean append) {
        file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (T t : tList) {
                bufferedWriter.write(t.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}