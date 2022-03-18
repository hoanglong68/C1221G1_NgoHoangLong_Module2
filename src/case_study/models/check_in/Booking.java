package case_study.models.check_in;

import case_study.models.facility.Facility;
import case_study.models.person.Customer;

public class Booking {
    private String idBooking;
    private String startDate;
    private String endDate;
    private Customer customer;
    private Facility facility;
    private static final String COMMA = ",";

    public Booking(String idBooking, String startDate, String endDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }

    public String toConvert() {
        return idBooking + COMMA +
                startDate + COMMA +
                endDate + COMMA +
                customer + COMMA +
                facility;
    }
}
