package case_study.utils;

import case_study.models.check_in.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate1 = LocalDate.parse(o1.getStartDate(), dateTimeFormatter);
        LocalDate startDate2 = LocalDate.parse(o2.getStartDate(), dateTimeFormatter);
        LocalDate endDate1 = LocalDate.parse(o1.getEndDate(), dateTimeFormatter);
        LocalDate endDate2 = LocalDate.parse(o2.getEndDate(), dateTimeFormatter);
        if (startDate1.compareTo(startDate2) < 0) {
            return 1;
        } else if (startDate1.compareTo(startDate2) > 0) {
            return -1;
        } else {
            if (endDate1.compareTo(endDate2) < 0) {
                return 1;
            } else if (endDate1.compareTo(endDate2) > 0) {
                return -1;
            }else {
                return 0;
            }
        }
    }
}
