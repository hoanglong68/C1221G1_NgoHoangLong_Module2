package case_study.services.impl;

import case_study.models.check_in.Booking;
import case_study.models.facility.Facility;
import case_study.models.facility.Villa;
import case_study.models.person.Customer;
import case_study.services.IBookingService;
import case_study.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    private static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    private static List<Customer> customerList = new ArrayList<>();
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static Scanner scanner = new Scanner(System.in);
    private static String id;

    static {
        customerList.add(new Customer("1", "long", "20/1/1998", "male", "1",
                "999999999", "long@gmail.com", "Vip", "dn"));
        customerList.add(new Customer("2", "long", "21/1/1998", "male", "2",
                "999999999", "long@gmail.com", "Vip", "dn"));
        customerList.add(new Customer("3", "long", "22/1/1998", "male", "3",
                "999999999", "long@gmail.com", "Vip", "dn"));
        facilityIntegerMap.put(new Villa("SVVL-1212", "Villa", 40, 40, 15, "Day",
                "Vip", 40), 0);
        facilityIntegerMap.put(new Villa("SVVL-1213", "Villa", 50, 50, 15, "Day",
                "Vip", 50), 0);
    }

    @Override
    public void addBooking() {
        if (!bookingSet.isEmpty()) {
            id = "1";
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("enter start date and end date");
        System.out.print("enter start date: ");
        String startDate = scanner.nextLine();
        System.out.print("enter end date: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        bookingSet.add(booking);
        System.out.println("successful !");
    }

    @Override
    public void displayBooking() {
        for(Booking booking: bookingSet){
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("list customer: ");
        for (Customer customer : customerList
        ) {
            System.out.println(customer.toString());
        }
        System.out.print("enter id customer: ");
        boolean flag = false;
        id = scanner.nextLine();
        while (!flag) {
            for (Customer customer : customerList
            ) {
                if (customer.getIdCustomer().equals(id)) {
                    flag = true;
                    return customer;
                }
            }
            if (!flag) {
                System.out.println("wrong id customer!");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("list facility: ");
        for (Map.Entry<? extends Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.print("enter id facility: ");
        boolean flag = false;
        id = scanner.nextLine();
        while (!flag) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (entry.getKey().getIdFacility().equals(id)) {
                    flag = true;
                    return entry.getKey();
                }
            }
            if (!flag) {
                System.out.println("wrong id facility!");
                id = scanner.nextLine();
            }
        }
        return null;
    }
    public Set<Booking> sendBooking(){
        return bookingSet;
    }
}
