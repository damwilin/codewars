package UnluckyDays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Kata {
    public static int unluckyDays(int year) {
        int fridays = 0;
        for (Month month : Month.values()) {
            if (LocalDate.of(year, month, 13).getDayOfWeek() == DayOfWeek.FRIDAY)
                fridays++;
        }
        return fridays;
    }
}
