package account_bank.utils;

public class NotFoundBankAccountException extends Exception{
    @Override
    public String getMessage() {
        return "Account Bank is not exist ! retry";
    }
}
