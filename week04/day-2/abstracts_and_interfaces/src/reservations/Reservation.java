package reservations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reserve{

    protected String reservationCode;
    protected String dayOfWeek;

    public Reservation() {
        this.reservationCode = getCodeBooking();
        this.dayOfWeek = getDowBooking();
    }

    @Override
    public String getDowBooking() {
        List<String> dow = new ArrayList<>();
        dow.add("MON");
        dow.add("TUE");
        dow.add("WED");
        dow.add("THU");
        dow.add("FRI");
        dow.add("SAT");
        dow.add("SUN");
        Random random = new Random();
        int day = random.nextInt(7);

        return dow.get(day);
    }

    @Override
    public String getCodeBooking() {
        Random random = new Random();
        String alpha_num_characters = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder bookingCode = new StringBuilder();
        int randomLetter;
        for (int i = 0; i < 8; i++) {
            randomLetter = random.nextInt(alpha_num_characters.length());
            bookingCode.append(alpha_num_characters.charAt(randomLetter));
        }
        return bookingCode.toString().toUpperCase();
    }

    public String getBooking(){
        return String.format("Booking# " + getCodeBooking() + " for " + getDowBooking());
    }

}


