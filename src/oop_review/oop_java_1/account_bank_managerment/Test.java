package oop_review.oop_java_1.account_bank_managerment;

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(1002, "long2");
        Account account3 = new Account(1003, "long3", 3000);

        account1.depositMoney();
        account2.depositMoney();
        account3.withdrawMoney();
        account2.expire();
        account3.sendMoneyToAnotherAccount(account1, 1000);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}
