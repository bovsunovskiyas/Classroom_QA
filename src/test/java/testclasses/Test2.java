package testclasses;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

  static int x = 10;
  static int y = 20;

  public static void main(String[] args) {

    Button button = null;

    List<String> bunnies = new ArrayList<>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies); // [long ear, floppy, hoppy]
    bunnies.removeIf(s   ->  s.charAt(0) != 'h' );
    // s - parameter name |    body            |

    System.out.println(bunnies); // [hoppy]

    Printable printer = s->System.out.println(s);
    printer.print("Hello Java!");

    Operation op = ()->{

      x=30;
      return x+y;
    };
    System.out.println(op.calculate()); // 50
    System.out.println(x); // 30 - значение x изменилось

  }

  private static void doWork() {
  }

  public static void lambda(){

  }
}

interface Printable{
  void print(String s);
}


interface Operation{
  int calculate();
}