package Chapter4.T0;

public class Test {
}






//        8. Which of the following are true? (Choose all that apply)
//        A. Encapsulation uses package private instance variables.
//        B. Encapsulation uses private instance variables.
//        C. Encapsulation allows setters.
//        D. Immutability uses package private instance variables.
//        E. Immutability uses private instance variables.
//        F. Immutability allows setters.
//        9. Which are methods using JavaBeans naming conventions for accessors and mutators?
//        (Choose all that apply)
//        A. public boolean getCanSwim() { return canSwim;}
//        B. public boolean canSwim() { return numberWings;}
//        C. public int getNumWings() { return numberWings;}
//        D. public int numWings() { return numberWings;}
//        E. public void setCanSwim(boolean b) { canSwim = b;}
//        10. What is the output of the following code?
//        package rope;
//public class Rope {
//  public static int LENGTH = 5;
//4: static {
//    LENGTH = 10;
//  }
//  Review Questions 221
//  c04.indd 1½ 4/2014 Page 221
//  public static void swing() {
//    System.out.print("swing ");
//  }
//}
//  import rope.*;
//          import static rope.Rope.*;
//public class Chimp {
//4: public static void main(String[] args) {
//    Rope.swing();
//    new Rope().swing();
//    System.out.println(LENGTH);
//  }
//}
//  A. swing swing 5
//        B. swing swing 10
//        C. Compiler error on line 2 of Chimp.
//        D. Compiler error on line 5 of Chimp.
//        E. Compiler error on line 6 of Chimp.
//        F. Compiler error on line 7 of Chimp.
//        11. Which are true of the following code? (Choose all that apply)
//public class Rope {
//  public static void swing() {
//    System.out.print("swing ");
//    4: }
//  public void climb() {
//    System.out.println("climb ");
//  }
//  public static void play() {
//    swing();
//    climb();
//    1  }
//1  public static void main(String[] args) {
//    1  Rope rope = new Rope();
//    rope.play();
//    1  Rope rope2 = null;
//    1  rope2.play();
//    1  }
//1  }
//222 Chapter 4 ■ Methods and Encapsulation
//        c04.indd 1½ 4/2014 Page 222
//        A. The code compiles as is.
//        B. There is exactly one compiler error in the code.
//        C. There are exactly two compiler errors in the code.
//        D. If the lines with compiler errors are removed, the output is climb climb.
//        E. If the lines with compiler errors are removed, the output is swing swing.
//        F. If the lines with compile errors are removed, the code throws a NullPointerException.
//        12. What is the output of the following code?
//        import rope.*;
//        import static rope.Rope.*;
//public class RopeSwing {
//  private static Rope rope1 = new Rope();
//  private static Rope rope2 = new Rope();
//  {
//    System.out.println(rope1.length);
//  }
//  public static void main(String[] args) {
//    rope1.length = 2;
//    rope2.length = 8;
//    System.out.println(rope1.length);
//  }
//}
//package rope;
//public class Rope {
//  public static int length = 0;
//}
//A. 02
//        B. 08
//        C. 2
//        D. 8
//        E. The code does not compile.
//        F. An exception is thrown.
//        13. How many compiler errors are in the following code?
//public class RopeSwing {
//  private static final String leftRope;
//  private static final String rightRope;
//4: private static final String bench;
//  private static final String name = "name";
//  Review Questions 223
//  c04.indd 1½ 4/2014 Page 223
//  static {
//    leftRope = "left";
//    rightRope = "right";
//  }
//  static {
//    1  name = "name";
//    1  rightRope = "right";
//    1  }
//  public static void main(String[] args) {
//    1  bench = "bench";
//    1  }
//1  }
//A. 0
//        B. 1
//        C. 2
//        D. 3
//        E. 4
//        F. 5
//        14. Which of the following can replace line 2 to make this code compile? (Choose
//        all that apply)
//        import java.util.*;
//// INSERT CODE HERE
//public class Imports {
//4: public void method(ArrayList<String> list) {
//    sort(list);
//  }
//}
//A. import static java.util.Collections;
//        B. import static java.util.Collections.*;
//        C. import static java.util.Collections.sort(ArrayList<String>);
//        D. static import java.util.Collections;
//        E. static import java.util.Collections.*;
//        F. static import java.util.Collections.sort(ArrayList<String>);
//        15. What is the result of the following statements?
//public class Test {
//  public void print(byte x) {
//    System.out.print("byte");
//    4: }
//  public void print(int x) {
//    System.out.print("int");
//    224 Chapter 4 ■ Methods and Encapsulation
//    c04.indd 1½ 4/2014 Page 224
//  }
//  public void print(float x) {
//    System.out.print("float");
//  }
//1  public void print(Object x) {
//    1  System.out.print("Object");
//    1  }
//  public static void main(String[] args) {
//    1  Test t = new Test();
//    1  short s = 123;
//    1  t.print(s);
//    1  t.print(true);
//    1  t.print(6.789);
//    20: }
//2  }
//A. bytefloatObject
//        B. intfloatObject
//        C. byteObjectfloat
//        D. intObjectfloat
//        E. intObjectObject
//        F. byteObjectObject
//        16. What is the result of the following program?
//public class Squares {
//  public static long square(int x) {
//    long y = x * (long) x;
//    4: x = -1;
//    return y;
//  }
//  public static void main(String[] args) {
//    int value = 9;
//    long result = square(value);
//    System.out.println(value);
//    1  } }
//A. -1
//        B. 9
//        C. 81
//        D. Compiler error on line 9.
//        E. Compiler error on a different line.
//        Review Questions 225
//        c04.indd 1½ 4/2014 Page 225
//        17. Which of the following are output by the following code? (Choose all that apply)
//public class StringBuilders {
//  public static StringBuilder work(StringBuilder a,
//                                   StringBuilder b) {
//    a = new StringBuilder("a");
//    b.append("b");
//    return a;
//  }
//  public static void main(String[] args) {
//    StringBuilder s1 = new StringBuilder("s1");
//    StringBuilder s2 = new StringBuilder("s2");
//    StringBuilder s3 = work(s1, s2);
//    System.out.println("s1 = " + s1);
//    System.out.println("s2 = " + s2);
//    System.out.println("s3 = " + s3);
//  }
//}
//A. s1 = a
//        B. s1 = s1
//        C. s2 = s2
//        D. s2 = s2b
//        E. s3 = a
//        F. s3 = null
//        G. The code does not compile.
//        18. Which of the following are true? (Choose 2)
//        A. this() can be called from anywhere in a constructor.
//        B. this() can be called from any instance method in the class.
//        C. this.variableName can be called from any instance method in the class.
//        D. this.variableName can be called from any static method in the class.
//        E. You must include a default constructor in the code if the compiler does not include one.
//        F. You can call the default constructor written by the compiler using this().
//        G. You can access a private constructor with the main() method.
//        19. Which of these classes compile and use a default constructor? (Choose all that apply)
//        A. public class Bird { }
//B. public class Bird { public bird() {} }
//C. public class Bird { public bird(String name) {} }
//D. public class Bird { public Bird() {} }
//226 Chapter 4 ■ Methods and Encapsulation
//        c04.indd 1½ 4/2014 Page 226
//        E. public class Bird { Bird(String name) {} }
//F. public class Bird { private Bird(int age) {} }
//G. public class Bird { void Bird() { }
//20. Which code can be inserted to have the code print 2?
//  public class BirdSeed {
//    private int numberBags;
//    boolean call;
//    public BirdSeed() {
//      // LINE 1
//      call = false;
//      // LINE 2
//    }
//    public BirdSeed(int numberBags) {
//      this.numberBags = numberBags;
//    }
//    public static void main(String[] args) {
//      BirdSeed seed = new BirdSeed();
//      System.out.println(seed.numberBags);
//    } }
//  A. Replace line 1 with BirdSeed(2);
//  B. Replace line 2 with BirdSeed(2);
//  C. Replace line 1 with new BirdSeed(2);
//  D. Replace line 2 with new BirdSeed(2);
//  E. Replace line 1 with this(2);
//  F. Replace line 2 with this(2);
//21. Which of the following complete the constructor so that this code prints out 50? (Choose
//  all that apply)
//  public class Cheetah {
//    int numSpots;
//    public Cheetah(int numSpots) {
//      // INSERT CODE HERE
//    }
//    public static void main(String[] args) {
//      System.out.println(new Cheetah(50).numSpots);
//    }
//  }
//  Review Questions 227
//  c04.indd 1½ 4/2014 Page 227
//  A. numSpots = numSpots;
//  B. numSpots = this.numSpots;
//  C. this.numSpots = numSpots;
//  D. numSpots = super.numSpots;
//  E. super.numSpots = numSpots;
//  F. None of the above.
//          22. What is the result of the following?
//  public class Order {
//    static String result = "";
//    { result += "c"; }
//4: static
//    { result += "u"; }
//    { result += "r"; }
//  }
//  public class OrderDriver {
//    public static void main(String[] args) {
//      System.out.print(Order.result + " ");
//      4: System.out.print(Order.result + " ");
//      new Order();
//      new Order();
//      System.out.print(Order.result + " ");
//    }
//  }
//  A. curur
//  B. ucrcr
//  C. u ucrcr
//  D. u u curcur
//  E. u u ucrcr
//  F. ur ur urc
//  G. The code does not compile.
//23. What is the result of the following?
//  public class Order {
//    String value = "t";
//    { value += "a"; }
//4: { value += "c"; }
//    public Order() {
//      228 Chapter 4 ■ Methods and Encapsulation
//      c04.indd 1½ 4/2014 Page 228
//      value += "b";
//    }
//    public Order(String s) {
//      value += s;
//    }
//1  public static void main(String[] args) {
//      1  Order order = new Order("f");
//      1  order = new Order();
//      System.out.println(order.value);
//      1  } }
//  A. tacb
//  B. tacf
//  C. tacbf
//  D. tacfb
//  E. tacftacb
//  F. The code does not compile.
//  G. An exception is thrown.
//          24. Which of the following will compile when inserted in the following code? (Choose
//  all that apply)
//  public class Order3 {
//    final String value1 = "1";
//    static String value2 = "2";
//    String value3 = "3";
//    {
//      // CODE SNIPPET 1
//    }
//    static {
//      // CODE SNIPPET 2
//    }
//  }
//  A. value1 = "d"; instead of // CODE SNIPPET 1
//  B. value2 = "e"; instead of // CODE SNIPPET 1
//  C. value3 = "f"; instead of // CODE SNIPPET 1
//  D. value1 = "g"; instead of // CODE SNIPPET 2
//  E. value2 = "h"; instead of // CODE SNIPPET 2
//  F. value3 = "i"; instead of // CODE SNIPPET 2
//  Review Questions 229
//  c04.indd 1½ 4/2014 Page 229
//          25. Which of the following are true about the following code? (Choose all that apply)
//  public class Create {
//    Create() {
//      System.out.print("1 ");
//    }
//    Create(int num) {
//      System.out.print("2 ");
//    }
//    Create(Integer num) {
//      System.out.print("3 ");
//    }
//    Create(Object num) {
//      System.out.print("4 ");
//    }
//    Create(int... nums) {
//      System.out.print("5 ");
//    }
//    public static void main(String[] args) {
//      new Create(100);
//      new Create(1000L);
//    }
//  }
//  A. The code prints out 2 4.
//  B. The code prints out 3 4.
//  C. The code prints out 4 2.
//  D. The code prints out 4 4.
//  E. The code prints 3 4 if you remove the constructor Create(int num).
//  F. The code prints 4 4 if you remove the constructor Create(int num).
//  G. The code prints 5 4 if you remove the constructor Create(int num).
//          26. What is the result of the following class?
//          import java.util.function.*;
//
//  public class Panda {
//4: int age;
//    public static void main(String[] args) {
//      Panda p1 = new Panda();
//      p1.age = 1;
//      check(p1, p -> p.age < 5);
//      230 Chapter 4 ■ Methods and Encapsulation
//      c04.indd 1½ 4/2014 Page 230
//    }
//    private static void check(Panda panda, Predicate<Panda> pred) {
//      1  String result = pred.test(panda) ? "match" : "not match";
//      1  System.out.print(result);
//      1  } }
//  A. match
//  B. not match
//  C. Compiler error on line 8.
//  D. Compiler error on line 10.
//  E. Compiler error on line 11.
//  F. A runtime exception is thrown.
//27. What is the result of the following code?
//  interface Climb {
//    boolean isTooHigh(int height, int limit);
//  }
//4:
//  public class Climber {
//    public static void main(String[] args) {
//      check((h, l) -> h.append(l).isEmpty(), 5);
//    }
//    private static void check(Climb climb, int height) {
//      if (climb.isTooHigh(height, 10))
//        1  System.out.println("too high");
//      1  else
//      1  System.out.println("ok");
//    }
//1  }
//  A. ok
//  B. too high
//  C. Compiler error on line 7.
//  D. Compiler error on line 10.
//  E. Compiler error on a different line.
//  F. A runtime exception is thrown.
//28. Which of the following lambda expressions can fill in the blank? (Choose all that apply)
//  List<String> list = new ArrayList<>();
//list.removeIf(___________________);
//  Review Questions 231
//  c04.indd 1½ 4/2014 Page 231
//  A. s -> s.isEmpty()
//  B. s -> {s.isEmpty()}
//  C. s -> {s.isEmpty();}
//  D. s -> {return s.isEmpty();}
//  E. String s -> s.isEmpty()
//          F. (String s) -> s.isEmpty()
//          29. Which lambda can replace the MySecret class to return the same value? (Choose
//  all that apply)
//  interface Secret {
//    String magic(double d);
//  }
//  class MySecret implements Secret {
//    public String magic(double d) {
//      return "Poof";
//    }
//  }
//A. caller((e) -> "Poof");
//B. caller((e) -> {"Poof"});
//C. caller((e) -> { String e = ""; "Poof" });
//D. caller((e) -> { String e = ""; return "Poof"; });
//E. caller((e) -> { String e = ""; return "Poof" });
//F. caller((e) -> { String f = ""; return "Poof"; });
