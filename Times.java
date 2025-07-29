import java.time.*;
import java.time.format.*;

public class Times
{
public static void main(String[] args){

/* NEVER USE "NEW" WHEN MAKING THE LOCALDATE OBJECT
LocalDate date = LocalDate.now();
LocalDateTime dateTime = LocalDateTime.now();

System.out.println(date);
System.out.println(dateTime);


 manipulating the date class
LocalDate dates = LocalDate.of(2025, 5, 22);
dates = dates.plusDays(10).plusWeeks(1);
System.out.println(dates);

DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
String formatted = LocalDate.now().format(formatter);
System.out.println(formatted);*/

DateTimeFormatter x = DateTimeFormatter.ofPattern("MM dd yyyy");
LocalDate y = LocalDate.parse("05 22 2025", x);
System.out.println(y);

}
}

