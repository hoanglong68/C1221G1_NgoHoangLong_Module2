package homework_chanh_file.utils;

import homework_chanh_file.models.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class IoTextFileVehicle {

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

    public static void writeToCSVFile(String pathFile, List<? extends Vehicle> vehicleList, boolean append) {
        file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Vehicle vehicle : vehicleList) {
                bufferedWriter.write(vehicle.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}