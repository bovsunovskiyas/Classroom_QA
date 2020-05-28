package homework.homework3;

import java.util.Calendar;
import java.util.GregorianCalendar;

//    2. Write an example that, for a given month of the current year, lists all of the Mondays in that month.
public class Test2 {

  public static void main(String[] args) {

    Test2 test2 = new Test2();
    //Enter int year in format 2020 and int month number
    test2.calculateMondaysOfMonth(2020, Calendar.MAY);
  }

  public void calculateMondaysOfMonth(int year, int month) {

    Calendar calendar = new GregorianCalendar(year, month, 1);
    //DateFormat dateFormat = new SimpleDateFormat("E");

    do {
      // calculate a day of the week for the current day
      int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

      if (dayOfWeek == Calendar.FRIDAY) {
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
      }

      calendar.add(Calendar.DAY_OF_YEAR, 1);
    } while (calendar.get(Calendar.MONTH) == month);


  }


}

