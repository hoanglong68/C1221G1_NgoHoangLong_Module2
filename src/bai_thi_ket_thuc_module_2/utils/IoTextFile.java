package bai_thi_ket_thuc_module_2.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IoTextFile {
    // phương thức viết từ list lên file csv
    public static <E> void writeToCSVFile(String pathFile, List<E> elementList, boolean append) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : elementList) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // phương thức đọc từ file csv xuống list string
    public static List<String> readFromCSVFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
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
}
// phương thức chuyển đổi từ list string thành list đối tượng trong chương trình
//    public static void convertStringListToObjectList(String csvPath) {
//        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
//        String array[];
//        for (int i = 0; i < stringList.size(); i++) {
//            if (!stringList.get(i).isEmpty()) {
//                array = stringList.get(i).split(",");
//                O o = new O(...);
//                o.create(o);
//            }
//        }
//    }