package account_bank.models;

public class PayingAccountBank extends AccountBank {
    private String cardNumber;
    private double balance;

    public PayingAccountBank() {
    }

    public PayingAccountBank(int id, String code, String name, String dateCreate, String cardNumber, double balance) {
        super(id, code, name, dateCreate);
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "PayingAccountBank{" + super.toString() +
                "cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public String toAccountBankCsv() {
        return super.toAccountBankCsv() + COMMA +
                cardNumber + COMMA +
                balance
                ;
    }
}
