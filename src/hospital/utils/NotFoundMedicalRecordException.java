package de_2.utils;

public class NotFoundMedicalRecordException extends Exception{
    @Override
    public String getMessage() {
        return "Bệnh án không tồn tại";
    }
}
