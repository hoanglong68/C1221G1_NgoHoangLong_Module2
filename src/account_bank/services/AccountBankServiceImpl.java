package account_bank.services;

import account_bank.models.AccountBank;
import account_bank.models.PayingAccountBank;
import account_bank.models.SavingAccountBank;
import account_bank.utils.CheckValid;
import account_bank.utils.IoTextFile;
import account_bank.utils.NotFoundBankAccountException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AccountBankServiceImpl implements ISavingAccountBankService, IPayingAccountBankService {
    Scanner scanner = new Scanner(System.in);
    private static List<AccountBank> accountBankList = new ArrayList<>();
    private static final String ACCOUNTBANK_CSV = "src\\de_4\\data\\accountbank.csv";
    private static final String REGEX_STR = "^\\w+$";
    private static final String REGEX_DAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String REGEX_INT_NUMBER = "^\\d+$";
    private static final String REGEX_DOUBLE_NUMBER = "^(\\d)(\\.*\\d+)*$";

    static {
        AccountBankServiceImpl.convertStringListToAccountBankList(ACCOUNTBANK_CSV);
    }

    public static List<AccountBank> getAccountBankList() {
        return accountBankList;
    }

    public static void setAccountBankList(List<AccountBank> accountBankList) {
        AccountBankServiceImpl.accountBankList = accountBankList;
    }

    @Override
    public void addNewPayingAccount() {
        int id = this.checkId();
        System.out.print("enter code account: ");
        String code = CheckValid.regexInputString(scanner.nextLine(), REGEX_STR,
                "at least one character ! retry");
        System.out.print("enter name account: ");
        String name = CheckValid.regexInputString(scanner.nextLine(), REGEX_STR,
                "at least one character ! retry");
        System.out.print("enter date create account: ");
        String dateCreate = CheckValid.regexInputString(scanner.nextLine(), REGEX_DAY,
                "base: (dd/MM/yyyy) ! retry");
        System.out.print("enter card number: ");
        String cardNumber = CheckValid.regexInputString(scanner.nextLine(), REGEX_INT_NUMBER,
                "must be positive number ! retry");
        System.out.print("enter balance in account: ");
        double balance = Double.parseDouble(CheckValid.regexInputString(scanner.nextLine(), REGEX_DOUBLE_NUMBER,
                "must be positive number ! retry"));
        AccountBank accountBank = new PayingAccountBank(id, code, name, dateCreate, cardNumber, balance);
        getAccountBankList().add(accountBank);
        IoTextFile.writeToCSVFile(ACCOUNTBANK_CSV, getAccountBankList(), false);
    }

    @Override
    public void addNewSavingAccount() {
        int id = this.checkId();
        System.out.print("enter code account: ");
        String code = CheckValid.regexInputString(scanner.nextLine(), REGEX_STR,
                "at least one character ! retry");
        System.out.print("enter name account: ");
        String name = CheckValid.regexInputString(scanner.nextLine(), REGEX_STR,
                "at least one character ! retry");
        System.out.print("enter date create account: ");
        String dateCreate = CheckValid.regexInputString(scanner.nextLine(), REGEX_DAY,
                "base: (dd/MM/yyyy) ! retry");
        System.out.print("enter value saving: ");
        double valueSaving = Double.parseDouble(CheckValid.regexInputString(scanner.nextLine(), REGEX_DOUBLE_NUMBER,
                "must be positive number ! retry"));
        String dateSaving;
        do {
            System.out.print("enter date saving: ");
            dateSaving = CheckValid.regexInputString(scanner.nextLine(), REGEX_DAY,
                    "base: (dd/MM/yyyy) ! retry");
            if (Date.parse(dateCreate) - Date.parse(dateSaving) < 0) {
                System.out.println("please day saving must be greater day create ! retry");
            }
        } while (Date.parse(dateCreate) - Date.parse(dateSaving) < 0);
        System.out.print("enter interest: ");
        double interest = Double.parseDouble(CheckValid.regexInputString(scanner.nextLine(), REGEX_DOUBLE_NUMBER,
                "must be positive number ! retry"));
        System.out.print("enter term: ");
        int term = Integer.parseInt(CheckValid.regexInputString(scanner.nextLine(), REGEX_INT_NUMBER,
                "must be positive number ! retry"));
        AccountBank accountBank = new SavingAccountBank(id, code, name, dateCreate, valueSaving, dateSaving, interest, term);
        getAccountBankList().add(accountBank);
        IoTextFile.writeToCSVFile(ACCOUNTBANK_CSV, getAccountBankList(), false);
    }

    @Override
    public void delete() throws NotFoundBankAccountException {
        String codeToFind;
        boolean flag = false;
        do {
            System.out.println("enter code account bank: ");
            codeToFind = scanner.nextLine();
            if ("".equals(codeToFind)) {
                System.out.println("at least one character ! retry");
            }
        } while ("".equals(codeToFind));
        for (int i = 0; i < getAccountBankList().size(); i++) {
            if (getAccountBankList().get(i).getCode().contains(codeToFind)) {
                flag = true;
                System.out.println(getAccountBankList().get(i));
                System.out.println("do you want to delete (Y/N)");
                String confirm = scanner.nextLine();
                if ("Y".equals(confirm.toUpperCase())) {
                    getAccountBankList().remove(i);
                    System.out.println("delete successful !");
                    break;
                } else if ("N".equals(confirm.toUpperCase())) {
                    break;
                }
            }
        }
        if (!flag) {
            throw new NotFoundBankAccountException();
        }
        IoTextFile.writeToCSVFile(ACCOUNTBANK_CSV, getAccountBankList(), false);
    }

    @Override
    public void display() {
        for (AccountBank accountBank : getAccountBankList()) {
            System.out.println(accountBank.toString());
        }
    }

    @Override
    public void search() throws NotFoundBankAccountException {
        boolean flag = false;
        String strToFind;
        do {
            System.out.println("enter code account bank: ");
            strToFind = scanner.nextLine();
            if ("".equals(strToFind)) {
                System.out.println("at least one character ! retry");
            }
        } while ("".equals(strToFind));
        for (int i = 0; i < getAccountBankList().size(); i++) {
            if (getAccountBankList().get(i).getCode().contains(strToFind) ||
                    getAccountBankList().get(i).getName().contains(strToFind)) {
                flag = true;
                System.out.println(getAccountBankList().get(i));
                break;
            }
        }
        if (!flag) {
            throw new NotFoundBankAccountException();
        }
    }

    @Override
    public int checkId() {
        int idTemp;
        if (getAccountBankList().size() == 0) {
            return idTemp = 1;
        } else {
            return idTemp = getAccountBankList().get(getAccountBankList().size() - 1).getId() + 1;
        }
    }

    public static void convertStringListToAccountBankList(String csvPath) {
        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                array = stringList.get(i).split(",");
                if (array.length == 8) {
                    // saving
                    int id = Integer.parseInt(array[0]);
                    String code = array[1];
                    String name = array[2];
                    String dateCreate = array[3];
                    double valueSaving = Double.parseDouble(array[4]);
                    String dateSaving = array[5];
                    double interest = Double.parseDouble(array[6]);
                    int term = Integer.parseInt(array[7]);
                    AccountBank accountBank = new SavingAccountBank(id, code, name, dateCreate, valueSaving, dateSaving,
                            interest, term);
                    getAccountBankList().add(accountBank);
                } else if (array.length == 6) {
                    // paying
                    int id = Integer.parseInt(array[0]);
                    String code = array[1];
                    String name = array[2];
                    String dateCreate = array[3];
                    String cardNumber = array[4];
                    double balance = Double.parseDouble(array[5]);
                    AccountBank accountBank = new PayingAccountBank(id, code, name, dateCreate, cardNumber, balance);
                    getAccountBankList().add(accountBank);
                }
            }
        }
    }
}
