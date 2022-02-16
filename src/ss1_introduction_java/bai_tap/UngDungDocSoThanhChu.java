package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = Integer.parseInt(scanner.nextLine());
        int hundred = number / 100;
        int residualOfNumber = number % 100;
        int dozen = residualOfNumber / 10;
        int unit = residualOfNumber % 10;
        String result = "";
        if (number <= 999 && number > 0) {
            switch (hundred) {
                case 0:
                    break;
                case 1:
                    result += "one hundred";
                    break;
                case 2:
                    result += "two hundred";
                    break;
                case 3:
                    result += "three hundred";
                    break;
                case 4:
                    result += "four hundred";
                    break;
                case 5:
                    result += "five hundred";
                    break;
                case 6:
                    result += "six hundred";
                    break;
                case 7:
                    result += "seven hundred";
                    break;
                case 8:
                    result += "eight hundred";
                    break;
                case 9:
                    result += "nine hundred";
                    break;
            }
            if (dozen > 0 || unit > 0) {
                if (hundred > 0) {
                    result += " and";
                }
            }
            if (dozen < 1) {
                result = cloneUnit(unit, result);
            }
            if (dozen > 1) {
                switch (dozen) {
                    case 2:
                        result += " twenty";
                        break;
                    case 3:
                        result += " thirty";
                        break;
                    case 4:
                        result += " forty";
                        break;
                    case 5:
                        result += " fifty";
                        break;
                    case 6:
                        result += " sixty";
                        break;
                    case 7:
                        result += " seventy";
                        break;
                    case 8:
                        result += " eighty";
                        break;
                    case 9:
                        result += " ninety";
                        break;
                }
                result = cloneUnit(unit, result);
            } else if (dozen == 1) {
                switch (unit) {
                    case 0:
                        result += " ten";
                        break;
                    case 1:
                        result += " eleven";
                        break;
                    case 2:
                        result += " twelve";
                        break;
                    case 3:
                        result += " thirteen";
                        break;
                    case 4:
                        result += " fourteen";
                        break;
                    case 5:
                        result += " fifteen";
                        break;
                    case 6:
                        result += " sixteen";
                        break;
                    case 7:
                        result += " seventeen";
                        break;
                    case 8:
                        result += " eighteen";
                        break;
                    case 9:
                        result += " nineteen";
                        break;
                }
            }
            System.out.println(result);
        } else {
            System.out.println("out of ability");
        }
    }
    public static String cloneUnit(int unit, String result) {
        switch (unit) {
            case 0:
                break;
            case 1:
                result += " one";
                break;
            case 2:
                result += " two";
                break;
            case 3:
                result += " three";
                break;
            case 4:
                result += " four";
                break;
            case 5:
                result += " five";
                break;
            case 6:
                result += " six";
                break;
            case 7:
                result += " seven";
                break;
            case 8:
                result += " eight";
                break;
            case 9:
                result += " nine";
                break;
        }
        return result;
    }
}
