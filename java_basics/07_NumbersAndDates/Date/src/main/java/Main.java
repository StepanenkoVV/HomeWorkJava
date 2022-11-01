import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Locale.Builder;

public class Main {

  public static void main(String[] args) {

    int day = 31;
    int month = 12;
    int year = 1990;

    System.out.println(collectBirthdays(year, month, day));
  }

  public static String collectBirthdays(int year, int month, int day) {

    LocalDate birthday = LocalDate.of(year, month, day);
    LocalDate today = LocalDate.now();
    int i = 0;
    String birthdayList = "";

    while (birthday.isBefore(today.plusDays(1))) {
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE").withLocale(
          Locale.ENGLISH);
      String str = i + " - " + birthday.format(format);
      i += 1;
      birthday = birthday.plusYears(1);
      birthdayList += str + System.lineSeparator();
    }

    //TODO реализуйте метод для построения строки в следующем виде
    //0 - 31.12.1990 - Mon
    //1 - 31.12.1991 - Tue

    return birthdayList;
  }
}
