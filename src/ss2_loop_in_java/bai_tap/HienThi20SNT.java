package ss2_loop_in_java.bai_tap;

public class HienThi20SNT {
    public static void main(String[] args) {
        int number = 20;
        int n = 2;
        int count = 0;
        StringBuilder result = new StringBuilder();
        while (count < number) {
            boolean flag = true;
            if (n < 2) {
                flag = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                count++;
                String newN = Integer.toString(n);
                result.append(newN + ",");
            }
            n++;
        }
        System.out.print(result);
    }
}
