package homework.homework3;


import java.io.IOException;
import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;


//    3. Write an example that tests whether a given date occurs on Friday the 13th.
//    3. Напишите пример, который проверяет, происходит ли данная дата в пятницу 13-го числа.


public class Test3 {

  public static void main(String[] args) throws IOException, ParseException {

    Test3 test3 = new Test3();

    //Enter numbers for date
    test3.calculateFridayOf13th(13, Month.MARCH, 2020);


  }
    private void calculateFridayOf13th(int date, Month month, int year){

      LocalDate enteredDate = LocalDate.of(year, month, date);
      System.out.println("Entered date is: " + enteredDate);
      System.out.println();

      int numberOfMonth = enteredDate.getDayOfMonth();
      DayOfWeek nameOfDay = enteredDate.getDayOfWeek();
      DayOfWeek friday = DayOfWeek.FRIDAY;


//      System.out.println(nameOfDay);
//      System.out.println(numberOfDay);
//      System.out.println(numberOfMonth);

      if(nameOfDay == friday && numberOfMonth == 13){
        System.out.println("This day is the FRIDAY of the 13th.");
      }
      else{
        System.out.println("It's not a FRIDAY of the 13th, it's - " + nameOfDay + " " + numberOfMonth + "th.");
        //System.out.printf("It's not a FRIDAY of the 13th, {0} it's - {1} th.", nameOfDay, numberOfMonth);

      }


    }
  
}