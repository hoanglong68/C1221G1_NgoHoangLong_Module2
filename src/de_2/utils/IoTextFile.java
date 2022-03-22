package de_2.utils;

import de_2.models.IChuyenSangCsv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IoTextFile {
    public static <E> void writeToCSVFile(String pathFile, List<E> elementList, boolean append) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : elementList) {
                bufferedWriter.write(((IChuyenSangCsv) e).chuyenCsv());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
