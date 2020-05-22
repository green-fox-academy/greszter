package seconds_in_a_day;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int hoursInADay = 24;
        int minutesInAnHour = 60;
        int secondsInAMinute = 60;

        int remainingSeconds = ((hoursInADay * minutesInAnHour * secondsInAMinute) - (currentHours * minutesInAnHour * secondsInAMinute) - (currentMinutes * secondsInAMinute) - currentSeconds);
        System.out.println(remainingSeconds);

    }
}
