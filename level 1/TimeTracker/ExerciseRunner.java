public class ExerciseRunner {

public static void main(String[] args) {

    ProjectTime shortProject =
            new ProjectTime("2023-05-14 09:00", "2023-05-14 09:30");
    System.out.println("Short Project: expected = 30 m, actual = "
            + shortProject.getHoursLogged());

    ProjectTime overnightProject =
            new ProjectTime("2023-05-14 20:00", "2023-05-15 08:00");
    System.out.println("Overnight Project: expected = 12 h, actual = "
            + overnightProject.getHoursLogged());

    ProjectTime fullDayProject =
            new ProjectTime("2023-05-14 00:00", "2023-05-15 00:00");
    System.out.println("Full Day Project: expected = 24 h, actual = "
            + fullDayProject.getHoursLogged());

    ProjectTime errorProject =
            new ProjectTime("2023-05-14", "2023-05-15 08:00");
    System.out.println("Error Project: expected = -1, actual = "
            + errorProject.getHoursLogged());

    ProjectTime negativeProject =
            new ProjectTime("2023-05-15 08:00", "2023-05-14 09:00");
    System.out.println("Negative Time Project: expected = -1, actual = "
            + negativeProject.getHoursLogged());

    // Edge cases

    ProjectTime minutesToHours =
            new ProjectTime("2023-05-14 09:00", "2023-05-14 11:00");
    System.out.println("Minutes -> Hours: expected = 2 h, actual = "
            + minutesToHours.getHoursLogged());

    ProjectTime hoursToDays =
            new ProjectTime("2023-05-14 00:00", "2023-05-19 00:00");
    System.out.println("Hours -> Days: expected = 5 d, actual = "
            + hoursToDays.getHoursLogged());

    ProjectTime daysToMonths =
            new ProjectTime("2023-01-01 00:00", "2023-05-01 00:00");
    System.out.println("Days -> Months: expected = 4 mo, actual = "
            + daysToMonths.getHoursLogged());

    // Exact threshold: minutes -> hours

    ProjectTime thresholdMinutes =
            new ProjectTime("2023-05-14 09:00", "2023-05-14 10:59");
    System.out.println("119 minutes: expected = 119 m, actual = "
            + thresholdMinutes.getHoursLogged());

    thresholdMinutes.setEndTime("2023-05-14 11:00");
    System.out.println("120 minutes: expected = 2 h, actual = "
            + thresholdMinutes.getHoursLogged());

    // Exact threshold: hours -> days

    ProjectTime thresholdHours =
            new ProjectTime("2023-05-14 00:00", "2023-05-18 23:59");
    System.out.println("119 hours: expected = 119 h, actual = "
            + thresholdHours.getHoursLogged());

    thresholdHours.setEndTime("2023-05-19 00:00");
    System.out.println("120 hours: expected = 5 d, actual = "
            + thresholdHours.getHoursLogged());

    // Exact threshold: days -> months

    ProjectTime thresholdDays =
            new ProjectTime("2023-01-01 00:00", "2023-04-30 23:59");
    System.out.println("119 days: expected = 119 d, actual = "
            + thresholdDays.getHoursLogged());

    thresholdDays.setEndTime("2023-05-01 00:00");
    System.out.println("120 days: expected = 4 mo, actual = "
            + thresholdDays.getHoursLogged());
}


}
