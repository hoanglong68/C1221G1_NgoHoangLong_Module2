package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class View {
    public static final String COUNTRIES = "src\\ss16_io_text_file\\bai_tap\\doc_file_csv\\countries.csv";

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(COUNTRIES));
            while ((line = bufferedReader.readLine())!= null){
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static void printCountry(List<String> country) {
        for (int i = 0; i <country.size() ; i++) {
        }
        System.out.println(
                "country\n" +
                        "id: " + country.get(0) +
                        ", code: " + country.get(1) +
                        ", name: " + country.get(2)
        );
    }
}
