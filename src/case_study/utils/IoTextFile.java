package case_study.utils;

import case_study.models.facility.Facility;
import case_study.models.person.Person;

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

    public static void writeToCSVFacilityFile(String pathFile, List<? extends Facility> elementList, boolean append) {
        file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility facility : elementList) {
                bufferedWriter.write(facility.toConvert());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeToCSVPersonFile(String pathFile, List<? extends Person> elementList, boolean append) {
        file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Person person : elementList) {
                bufferedWriter.write(person.toConvert());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public static <E> void writeToCSVFile(String pathFile, List<E> elementList, boolean append) {
//        file = new File(pathFile);
//        try {
//            FileWriter fileWriter = new FileWriter(file, append);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            for (E e : elementList) {
//                bufferedWriter.write(e.toString());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

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
//public static List<String> readFromCSVFile(String pathFile) {
//    List<String> stringList = new ArrayList<>();
//    file = new File(pathFile);
//    try {
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            stringList.add(line);
//        }
//        bufferedReader.close();
//        fileReader.close();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//    return stringList;
//}
}
