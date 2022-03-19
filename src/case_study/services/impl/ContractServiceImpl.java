package case_study.services.impl;

import case_study.models.check_in.Booking;
import case_study.models.check_in.Contract;
import case_study.models.person.Customer;
import case_study.services.IContractService;

import java.util.*;

public class ContractServiceImpl implements IContractService {
    Scanner scanner = new Scanner(System.in);
    List<Contract> contractList = new ArrayList<>();

    @Override
    public void addContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println(" is doing contract with booking information" + booking.toString());
            System.out.println(" is doing contract with customer information" + customer.toString());
            System.out.print("enter id contract: ");
            String idContract = scanner.nextLine();
            System.out.print("enter prepay: ");
            String prePay = scanner.nextLine();
            System.out.print("enter pay: ");
            String totalPay = scanner.nextLine();
            Contract contract = new Contract(idContract, booking, prePay, totalPay, customer);
            contractList.add(contract);
            System.out.println("created successful: " + contract.toString());
        }
    }

    @Override
    public void displayContract() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }
}
