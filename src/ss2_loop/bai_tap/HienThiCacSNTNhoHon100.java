package ss2_loop.bai_tap;

public class HienThiCacSNTNhoHon100 {
    public static void main(String[] args) {
        int numbers = 100;
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < numbers; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                String newI = Integer.toString(i);
                result.append(newI + ",");
            }
        }
        System.out.println(result);
    }
}
