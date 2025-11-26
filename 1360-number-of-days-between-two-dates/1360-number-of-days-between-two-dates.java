import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution
 {
    public static int daysBetweenDates(String date1, String date2)
     {
        LocalDate ld1 = LocalDate.parse(date1);
        LocalDate ld2 = LocalDate.parse(date2);      
        return (int) Math.abs(ChronoUnit.DAYS.between(ld1, ld2));
     }
 }
    

  