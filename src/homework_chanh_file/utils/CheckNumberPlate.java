package homework_chanh_file.utils;

public class CheckNumberPlate {
    public static boolean checkNumberPlate(String numberPlate,int choice){
        String regexTruck = "^\\d{2}C-\\d{3}\\.\\d{2}$";
        String regexCar = "^\\d{2}[AB]-\\d{3}\\.\\d{2}$";
        String regexMotorBike = "^\\d{2}-[A-Z][A-Z0-9]-\\d{3}\\.\\d{2}$";
        boolean flag = false;
        switch (choice){
            case 1:
                flag =  numberPlate.matches(regexCar);
                break;
            case 2:
                flag = numberPlate.matches(regexTruck);
                break;
            case 3:
                flag = numberPlate.matches(regexMotorBike);
                break;
            default:
                break;
        }
        return flag;
    }
}
