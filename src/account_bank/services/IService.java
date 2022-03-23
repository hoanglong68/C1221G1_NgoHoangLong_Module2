package account_bank.services;

import account_bank.utils.NotFoundBankAccountException;

public interface IService {
    void delete() throws NotFoundBankAccountException;
    void display();
    void search() throws NotFoundBankAccountException;
    int checkId();
}
