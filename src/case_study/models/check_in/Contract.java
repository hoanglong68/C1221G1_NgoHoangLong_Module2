package case_study.models.check_in;

import case_study.models.person.Customer;

public class Contract {
    private String idContract, prePay, totalPay;
    private Customer customer;
    private Booking booking;
    private static final String COMMA = ",";

    public Contract() {
    }

    public Contract(String idContract, Booking booking, String prePay, String totalPay, Customer customer) {
        this.idContract = idContract;
        this.booking = booking;
        this.prePay = prePay;
        this.totalPay = totalPay;
        this.customer = customer;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getPrePay() {
        return prePay;
    }

    public void setPrePay(String prePay) {
        this.prePay = prePay;
    }

    public String getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", booking=" + booking +
                ", prePay='" + prePay + '\'' +
                ", totalPay='" + totalPay + '\'' +
                ", customer=" + customer.getIdCustomer() +
                '}';
    }

    public String toConvert() {
        return idContract + COMMA +
                booking + COMMA +
                prePay + COMMA +
                totalPay + COMMA +
                customer.getIdCustomer();
    }
}
