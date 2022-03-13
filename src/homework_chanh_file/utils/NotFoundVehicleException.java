package homework_chanh_file.utils;

public class NotFoundVehicleException extends Exception{
    @Override
    public String getMessage() {
        return "the number of plate is not exist !";
    }
}
