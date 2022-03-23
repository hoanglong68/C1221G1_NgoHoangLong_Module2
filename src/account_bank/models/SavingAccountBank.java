package account_bank.models;

public class SavingAccountBank extends AccountBank {
    private double valueSaving;
    private String dateSaving;
    private double interest;
    private int term;

    public SavingAccountBank() {
    }

    public SavingAccountBank(int id, String code, String name, String dateCreate, double valueSaving, String dateSaving,
                             double interest, int term) {
        super(id, code, name, dateCreate);
        this.valueSaving = valueSaving;
        this.dateSaving = dateSaving;
        this.interest = interest;
        this.term = term;
    }

    public double getValueSaving() {
        return valueSaving;
    }

    public void setValueSaving(double valueSaving) {
        this.valueSaving = valueSaving;
    }

    public String getDateSaving() {
        return dateSaving;
    }

    public void setDateSaving(String dateSaving) {
        this.dateSaving = dateSaving;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "SavingAccountBank{" + super.toString() +
                "valueSaving=" + valueSaving +
                ", dateSaving='" + dateSaving + '\'' +
                ", interest=" + interest +
                ", term=" + term +
                '}';
    }

    @Override
    public String toAccountBankCsv() {
        return super.toAccountBankCsv() + COMMA +
                valueSaving + COMMA +
                dateSaving + COMMA +
                interest + COMMA +
                term
                ;
    }
}
