package oop_review.oop_java_1.account_bank_managerment;

import java.util.Scanner;

public class Account {
    private long idAccount = 1001;
    private String nameAccount = "account default";
    private double accountAmount;
    private final double INTEREST = 0.035;

    public Account() {
    }

    public Account(long idAccount, String nameAccount) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
        this.accountAmount = 50;
    }

    public Account(long idAccount, String nameAccount, double accountAmount) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
        this.accountAmount = accountAmount;
    }

    public long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(long idAccount) {
        this.idAccount = idAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "idAccount= " + this.idAccount +
                ", nameAccount= '" + this.nameAccount + '\'' +
                ", accountAmount= " + this.accountAmount + " USD" +
                '}';
    }

    public void depositMoney() {
        double moneyWantToDeposit;
        do {
            System.out.println("enter amount money to deposit for " + this.getNameAccount());
            Scanner scanner = new Scanner(System.in);
            moneyWantToDeposit = Double.parseDouble(scanner.nextLine());
            if (moneyWantToDeposit <= 0) {
                System.out.println("invalid amount");
            }
        } while (moneyWantToDeposit <= 0);
        this.setAccountAmount(this.getAccountAmount() + moneyWantToDeposit);
    }

    public void withdrawMoney() {
        double moneyWantToWithdraw;
        do {
            System.out.println("enter amount money to withdraw for " + this.getNameAccount());
            Scanner scanner = new Scanner(System.in);
            moneyWantToWithdraw = Double.parseDouble(scanner.nextLine());
            if (moneyWantToWithdraw <= 0) {
                System.out.println("invalid amount");
            } else if (moneyWantToWithdraw > this.getAccountAmount()) {
                System.out.println("account limit exceeded");
            }
        } while (moneyWantToWithdraw <= 0 || moneyWantToWithdraw > this.getAccountAmount());
        this.setAccountAmount(this.getAccountAmount() - (moneyWantToWithdraw));
    }

    public void expire() {
        this.setAccountAmount(this.getAccountAmount() + this.getAccountAmount() * INTEREST);
    }

    public void sendMoneyToAnotherAccount(Account account) {
        double moneyWantToSend;
        do {
            System.out.println("enter amout money to send for " + account.getNameAccount());
            Scanner scanner = new Scanner(System.in);
            moneyWantToSend = Double.parseDouble(scanner.nextLine());
            if (moneyWantToSend <= 0) {
                System.out.println("invalid amount");
            } else if (moneyWantToSend > this.getAccountAmount()) {
                System.out.println("account limit exceeded");
            }
        } while (moneyWantToSend <= 0 || moneyWantToSend > this.getAccountAmount());
        if (this.getAccountAmount() <= moneyWantToSend) {
            System.out.println("can not send !");
        } else {
            System.out.println(this.nameAccount + " sended " + moneyWantToSend + " to " + account.nameAccount);
            account.setAccountAmount(account.getAccountAmount() + moneyWantToSend);
            this.setAccountAmount(this.getAccountAmount() - moneyWantToSend);
        }
    }
}