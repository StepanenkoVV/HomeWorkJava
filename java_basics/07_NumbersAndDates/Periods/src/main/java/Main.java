import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {

  public static void main(String[] args)  {
    LocalDate birthday = LocalDate.of(1970,1,1);
    System.out.println(getPeriodFromBirthday(birthday));

  }

  public static String getPeriodFromBirthday(LocalDate birthday) {
    LocalDate now = LocalDate.now();
    Period p = Period.between(birthday,now);
    int years = p.getYears();
    int months = p.getMonths();
    int days = p.getDays();
    String result = years + " years, " + months + " months, " + days + " days";

    return result;
  }

}
