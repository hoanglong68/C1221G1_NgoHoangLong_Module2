package case_study.utils;
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
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static <E> void writeToCSVFile(String pathFile, List<E> vehicleList, boolean append) {
        file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : vehicleList) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
