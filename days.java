import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class days {
 public static void main(String[] args) throws ParseException {
  
  LocalDate l = LocalDate.of(1999, 12, 02); 
  LocalDate now = LocalDate.now(); 
  Period diff = Period.between(l, now); 
  System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");

}
}