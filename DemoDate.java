import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
    public static void main(String[] args) {
        //LocalDate cannot be "new"
        LocalDate ld1 = LocalDate.of(2024, 12, 31);
        // sysout -> ld1.toString()
        System.out.println(ld1);
        System.out.println(ld1.getDayOfWeek());

        LocalDate today = LocalDate.now();
        System.out.println(today.getDayOfWeek());


        // +, -
        LocalDate joinDate = LocalDate.now();
        LocalDate probationEndDate = joinDate.plusMonths(3L);
        System.out.println(probationEndDate);

        LocalDate firstDayOfYear = LocalDate.of(2026, 1, 1);
        LocalDate yearEnd = firstDayOfYear.minusDays(1L);
        System.out.println(yearEnd);

        Month month = joinDate.getMonth();
        System.out.println(month);

        //comparison
        if (probationEndDate.isBefore(LocalDate.of(2026,7,10))){
        System.out.println("yes, before");
    }
    //isAfter
    if (probationEndDate.isAfter(LocalDate.of(2026,7,1))){
        System.out.println("yes, is after 2026, 7, 01");
    }

    //equal
    if (probationEndDate.equals(LocalDate.of(2026, 7, 9))){
        System.out.println("Yes, is exactly 3 months");
    }

    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear());

    System.out.println(joinDate.isLeapYear());

    //compareTo





    }   
}
