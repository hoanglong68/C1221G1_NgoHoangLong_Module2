package account_bank.models;

public abstract class AccountBank implements IToAccountBankCsv {
    private int id;
    private String code, name, dateCreate;
    protected static final String COMMA = ",";

    public AccountBank() {
    }

    public AccountBank(int id, String code, String name, String dateCreate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.dateCreate = dateCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", code='" + code + '\'' +
                        ", name='" + name + '\'' +
                        ", dateCreate='" + dateCreate + '\''
                ;
    }

    @Override
    public String toAccountBankCsv() {
        return id + COMMA +
                code + COMMA +
                name + COMMA +
                dateCreate
                ;
    }
}
