package homework.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EnterDate {

  public void enteringDate() throws IOException, ParseException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter date in format dd/MM/yyyy");
    String date = reader.readLine();
    SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");

    Date y = s.parse(date);
    SimpleDateFormat a = new SimpleDateFormat("dd MMM, yyyy");

    System.out.println(a.format(y).toUpperCase());


  }
}
