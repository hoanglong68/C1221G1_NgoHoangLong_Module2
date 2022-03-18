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
    public void read() {

    }

    @Override
    public void addBooking() {
        if (!bookingSet.isEmpty()) {

        }
    }

    @Override
    public void displayBooking() {

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
        while (!flag){
            for (Customer customer: customerList
                 ) {
                if (customer.getIdCustomer().equals(id)){
                    flag = true;
                    return customer;
                }
            }
            if (!flag){
                System.out.println("wrong id !");
                id = scanner.nextLine();
            }
        }
    }
}
