package homework.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;

//    1. Write an example that, for a given year, reports the length of each month within that year.
public class Test1 {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter year in format YYYY: ");
    String year = reader.readLine();

    int intYear = Integer.parseInt(year);
    //System.out.println("entered year: " + intYear);


Test1 test1 = new Test1();
test1.lengthOfMonth(intYear);

  }

  public void lengthOfMonth(int year){


    for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {

      Year currentYear = Year.of(year);
      Month monthName = currentYear.atMonth(monthNumber).getMonth();
      int month = currentYear.atMonth(monthNumber).lengthOfMonth();
      System.out.println("Length of " + monthName + " is: "  + month);
    }

  }

}




