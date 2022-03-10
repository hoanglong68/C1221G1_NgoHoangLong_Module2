package ss16_io_text_file.bai_tap.copy_text;

import java.io.*;

public class CopyFileText {
   public static String stringList = "";
    public static String read(String pathName){
        File file = new File(pathName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                stringList = line;
            }

            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(stringList);
        return stringList;
    }
public static void write(String target,String pathName){
    try {
        FileWriter fileWriter = new FileWriter(target);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(pathName+" after copy chau my!");
        bufferedWriter.close();
        fileWriter.close();
        if(!target.isEmpty()){
            System.out.println("file exist");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    public static void main(String[] args) {
        CopyFileText.read("src\\ss16_io_text_file\\bai_tap\\copy_text\\source.txt");
        System.out.println("target before copy !");
        CopyFileText.write("src\\ss16_io_text_file\\bai_tap\\copy_text\\target.txt",stringList);
        CopyFileText.read("src\\ss16_io_text_file\\bai_tap\\copy_text\\target.txt");
    }
}
