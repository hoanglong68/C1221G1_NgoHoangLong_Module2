package de_3.utils;

public class NotFoundProductException extends Exception{
    @Override
    public String getMessage() {
        return "Product is not exist !";
    }
}
