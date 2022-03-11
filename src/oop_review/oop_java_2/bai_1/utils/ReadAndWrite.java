package oop_review.oop_java_2.bai_1.utils;

import java.io.File;
import java.io.FileReader;

public class ReadAndWrite {
   static File file = null;
    public static final String EMPLOYEE_CSV ="src\\oop_review\\oop_java_2\\bai_1\\data\\employee.csv";
    public static void readFile(String EMPLOYEE_CSV){
        file = new File(EMPLOYEE_CSV);
    }
}
