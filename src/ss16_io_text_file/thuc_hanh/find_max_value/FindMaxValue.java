package ss16_io_text_file.thuc_hanh.find_max_value;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\code_gym\\module2\\src\\ss16_io_text_file\\thuc_hanh\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\code_gym\\module2\\src\\ss16_io_text_file\\thuc_hanh\\result.txt", maxValue);
    }
}