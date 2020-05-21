package coding_hours;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int daily = 6;
        int weeks = 17;

        System.out.println("Hours spent with coding in a semester: " + (weeks * 5 * daily));

        int a = weeks * 5 * daily;
        int b = weeks * 52;

        System.out.println("Percentage of the coding hours: " + ((float) a / b * 100) + "%");

        System.out.println("Percentage counted slightly differently: " + ((float) 30 / 52 * 100) + "%");

    }
}
