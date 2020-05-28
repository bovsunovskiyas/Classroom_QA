package Chapter3.T1;



//1. What is output by the following code? (Choose all that apply)

//G. The code does not compile.

public class Fish {
  public static void main(String[] args) {
    int numFish = 4;
    String fishType = "tuna";
    //String anotherFish = numFish + 1;                    - error
    //System.out.println(anotherFish + " " + fishType);
    System.out.println(numFish + " " + 1);
  } }
//        A. 4 1
//        B. 41
//        C. 5
//        D. 5 tuna
//        E. 5tuna
//        F. 51tuna
//        G. The code does not compile.





//        3. Which are true statements? (Choose all that apply)
//        A. An immutable object can be modified.
//        B. An immutable object cannot be modified.
//        C. An immutable object can be garbage collected.
//        154 Chapter 3 ■ Core Java APIs
//        D. An immutable object cannot be garbage collected.
//        E. String is immutable.
//        F. StringBuffer is immutable.
//        G. StringBuilder is immutable.
//        4. What is the result of the following code?
//        StringBuilder sb = new StringBuilder();
//        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
//        System.out.println(sb);
//        A. abbaaccc
//        B. abbaccca
//        C. bbaaaccc
//        D. bbaaccca
//        E. An exception is thrown.
//        F. The code does not compile.
//        5. What is the result of the following code?
//        String s1 = "java";
//        StringBuilder s2 = new StringBuilder("java");
//        if (s1 == s2)
//        System.out.print("1");
//        if (s1.equals(s2))
//        System.out.print("2");
//        A. 1
//        B. 2
//        C. 12
//        D. No output is printed.
//        E. An exception is thrown.
//        F. The code does not compile.
//        6. What is the result of the following code?
//public class Lion {
//  public void roar(String roar1, StringBuilder roar2) {
//    roar1.concat("!!!");
//    roar2.append("!!!");
//  }
//  public static void main(String[] args) {
//    String roar1 = "roar";
//    StringBuilder roar2 = new StringBuilder("roar");
//    new Lion().roar(roar1, roar2);
//    Review Questions 155
//    System.out.println(roar1 + " " + roar2);
//  } }
//  A. roar roar
//  B. roar roar!!!
//        C. roar!!! roar
//        D. roar!!! roar!!!
//        E. An exception is thrown.
//        F. The code does not compile.
//        7. Which are the results of the following code? (Choose all that apply)
//        String letters = "abcdef";
//        System.out.println(letters.length());
//        System.out.println(letters.charAt(3));
//        System.out.println(letters.charAt(6));
//        A. 5
//        B. 6
//        C. c
//        D. d
//        E. An exception is thrown.
//        F. The code does not compile.
//        8. Which are the results of the following code? (Choose all that apply)
//        String numbers = "012345678";
//        System.out.println(numbers.substring(1, 3));
//        System.out.println(numbers.substring(7, 7));
//        System.out.println(numbers.substring(7));
//        A. 12
//        B. 123
//        C. 7
//        D. 78
//        E. A blank line.
//        F. An exception is thrown.
//        G. The code does not compile.
//        9. What is the result of the following code?
//        String s = "purr";
//        s.toUpperCase();
//        s.trim();
//        s.substring(1, 3);
//        156 Chapter 3 ■ Core Java APIs
//        s += " two";
//        System.out.println(s.length());
//        A. 2
//        B. 4
//        C. 8
//        D. 10
//        E. An exception is thrown.
//        F. The code does not compile.
//        10. What is the result of the following code? (Choose all that apply)
//        1  String a = "";
//        1  a += 2;
//        1  a += 'c';
//        1  a += false;
//        1  if ( a == "2cfalse") System.out.println("==");
//        1  if ( a.equals("2cfalse")) System.out.println("equals");
//        A. Compile error on line 14.
//        B. Compile error on line 15.
//        C. Compile error on line 16.
//        D. Compile error on another line.
//        E. ==
//        F. equals
//        G. An exception is thrown.
//        11. What is the result of the following code?
//        int total = 0;
//        StringBuilder letters = new StringBuilder("abcdefg");
//        total += letters.substring(1, 2).length();
//        total += letters.substring(6, 6).length();
//        total += letters.substring(6, 5).length();
//        System.out.println(total);
//        A. 1
//        B. 2
//        C. 3
//        D. 7
//        E. An exception is thrown.
//        F. The code does not compile.
//        Review Questions 157
//        12. What is the result of the following code? (Choose all that apply)
//        StringBuilder numbers = new StringBuilder("0123456789");
//        numbers.delete(2, 8);
//        numbers.append("-").insert(2, "+");
//        System.out.println(numbers);
//        A. 01+89–
//        B. 012+9–
//        C. 012+–9
//        D. 0123456789
//        E. An exception is thrown.
//        F. The code does not compile.
//        13. What is the result of the following code?
//        StringBuilder b = "rumble";
//        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
//        System.out.println(b);
//        A. rum
//        B. rum4
//        C. rumb4
//        D. rumble4
//        E. An exception is thrown.
//        F. The code does not compile.
//        14. Which of the following can replace line 4 to print "avaJ"? (Choose all that apply)
//        StringBuilder puzzle = new StringBuilder("Java");
//        // INSERT CODE HERE
//        System.out.println(puzzle);
//        A. puzzle.reverse();
//        B. puzzle.append("vaJ$").substring(0, 4);
//        C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
//        D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
//        E. None of the above.
//        15. Which of these array declarations is not legal? (Choose all that apply)
//        A. int[][] scores = new int[5][];
//        B. Object[][][] cubbies = new Object[3][0][5];
//        C. String beans[] = new beans[6];
//        D. java.util.Date[] dates[] = new java.util.Date[2][];
//        E. int[][] types = new int[];
//        F. int[][] java = new int[][];
//        158 Chapter 3 ■ Core Java APIs
//        16. Which of these compile when replacing line 8? (Choose all that apply)
//        char[]c = new char[2];
//        // INSERT CODE HERE
//        A. int length = c.capacity;
//        B. int length = c.capacity();
//        C. int length = c.length;
//        D. int length = c.length();
//        E. int length = c.size;
//        F. int length = c.size();
//        G. None of the above.
//        17. Which of these compile when replacing line 8? (Choose all that apply)
//        ArrayList l = new ArrayList();
//        // INSERT CODE HERE
//        A. int length = l.capacity;
//        B. int length = l.capacity();
//        C. int length = l.length;
//        D. int length = l.length();
//        E. int length = l.size;
//        F. int length = l.size();
//        G. None of the above.
//        18. Which of the following are true? (Choose all that apply)
//        A. An array has a fixed size.
//        B. An ArrayList has a fixed size.
//        C. An array allows multiple dimensions.
//        D. An array is ordered.
//        E. An ArrayList is ordered.
//        F. An array is immutable.
//        G. An ArrayList is immutable.
//        19. Which of the following are true? (Choose all that apply)
//        A. Two arrays with the same content are equal.
//        B. Two ArrayLists with the same content are equal.
//        C. If you call remove(0) using an empty ArrayList object, it will compile successfully.
//        D. If you call remove(0) using an empty ArrayList object, it will run successfully.
//        E. None of the above.
//        Review Questions 159
//        20. What is the result of the following statements?
//        List<String> list = new ArrayList<String>();
//        list.add("one");
//        list.add("two");
//        list.add(7);
//        for(String s : list) System.out.print(s);
//        A. onetwo
//        B. onetwo7
//        C. onetwo followed by an exception
//        D. Compiler error on line 9.
//        E. Compiler error on line 10.
//        21. What is the result of the following statements?
//        ArrayList<Integer> values = new ArrayList<>();
//        values.add(4);
//        values.add(5);
//        values.set(1, 6);
//        values.remove(0);
//        for (Integer v : values) System.out.print(v);
//        A. 4
//        B. 5
//        C. 6
//        D. 46
//        E. 45
//        F. An exception is thrown.
//        G. The code does not compile.
//        22. What is the result of the following?
//        int[] random = { 6, -4, 12, 0, -10 };
//        int x = 12;
//        int y = Arrays.binarySearch(random, x);
//        System.out.println(y);
//        A. 2
//        B. 4
//        C. 6
//        D. The result is undefined.
//        E. An exception is thrown.
//        F. The code does not compile.
//        160 Chapter 3 ■ Core Java APIs
//        23. What is the result of the following?
//        List<Integer> list = Arrays.asList(10, 4, -1, 5);
//        Collections.sort(list);
//        Integer array[] = list.toArray(new Integer[4]);
//        System.out.println(array[0]);
//        A. –1
//        B. 10
//        C. Compiler error on line 4.
//        D. Compiler error on line 5.
//        E. Compiler error on line 6.
//        F. An exception is thrown.
//        24. What is the result of the following?
//        String [] names = {"Tom", "Dick", "Harry"};
//        List<String> list = names.asList();
//        list.set(0, "Sue");
//        System.out.println(names[0]);
//        A. Sue
//        B. Tom
//        C. Compiler error on line 7.
//        D. Compiler error on line 8.
//        E. An exception is thrown.
//        25. What is the result of the following?
//        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
//        Collections.sort(hex);
//        int x = Collections.binarySearch(hex, "8");
//        int y = Collections.binarySearch(hex, "3A");
//        int z = Collections.binarySearch(hex, "4F");
//        System.out.println(x + " " + y + " " + z);
//        A 0 1 –2
//        B. 0 1 –3
//        C. 2 1 –2
//        D. 2 1 –3
//        E. None of the above.
//        F. The code doesn’t compile.
//        26. Which of the following are true statements about the following code? (Choose all that
//        apply)
//        List<Integer> ages = new ArrayList<>();
//        ages.add(Integer.parseInt("5"));
//        Review Questions 161
//        ages.add(Integer.valueOf("6"));
//        ages.add(7);
//        ages.add(null);
//        for (int age : ages) System.out.print(age);
//        A. The code compiles.
//        B. The code throws a runtime exception.
//        C. Exactly one of the add statements uses autoboxing.
//        D. Exactly two of the add statements use autoboxing.
//        E. Exactly three of the add statements use autoboxing.
//        27. What is the result of the following?
//        List<String> one = new ArrayList<String>();
//        one.add("abc");
//        List<String> two = new ArrayList<>();
//        two.add("abc");
//        if (one == two)
//        System.out.println("A");
//        else if (one.equals(two))
//        System.out.println("B");
//        else
//        System.out.println("C");
//        A. A
//        B. B
//        C. C
//        D. An exception is thrown.
//        E. The code does not compile.
//        28. Which of the following can be inserted into the blank to create a date of June 21, 2014?
//        (Choose all that apply)
//        import java.time.*;
//public class StartOfSummer {
//  public static void main(String[] args) {
//    LocalDate date = ____________________________
//  }
//}
//A. new LocalDate(2014, 5, 21);
//        B. new LocalDate(2014, 6, 21);
//        C. LocalDate.of(2014, 5, 21);
//        162 Chapter 3 ■ Core Java APIs
//        D. LocalDate.of(2014, 6, 21);
//        E. LocalDate.of(2014, Calendar.JUNE, 21);
//        F. LocalDate.of(2014, Month.JUNE, 21);
//        29. What is the output of the following code?
//        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_
//        DATE);
//        date.plusDays(2);
//        date.plusHours(3);
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//        + date.getDayOfMonth());
//        A. 2018 APRIL 2
//        B. 2018 APRIL 30
//        C. 2018 MAY 2
//        D. The code does not compile.
//        E. A runtime exception is thrown.
//        30. What is the output of the following code?
//        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//        + date.getDayOfMonth());
//        A. 2018 APRIL 4
//        B. 2018 APRIL 30
//        C. 2018 MAY 10
//        D. Another date.
//        E. The code does not compile.
//        F. A runtime exception is thrown.
//        31. What is the output of the following code?
//        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
//        date.plusDays(2);
//        date.plusYears(3);
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//        + date.getDayOfMonth());
//        A. 2018 APRIL 2
//        B. 2018 APRIL 30
//        C. 2018 MAY 2
//        D. 2021 APRIL 2
//        Review Questions 163
//        E. 2021 APRIL 30
//        F. 2021 MAY 2
//        G. A runtime exception is thrown.
//        32. What is the output of the following code?
//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//        Period p = Period.of(1, 2, 3);
//        d = d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//        System.out.println(d.format(f));
//        A. 3/7/14 1 22 AM
//        B. 5/10/15 1 22 AM
//        C. 3/7/14
//        D. 5/10/15
//        E. 1 22 AM
//        F. The code does not compile.
//        G. A runtime exception is thrown.
//        33. What is the output of the following code?
//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//        Period p = Period.ofDays(1).ofYears(2);
//        d = d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
//        .SHORT);
//        System.out.println(f.format(d));
//        A. 5/9/13 1 22 AM
//        B. 5/10/13 1 22 AM
//        C. 5/9/14
//        D. 5/10/14
//        E. The code does not compile.
//        F. A runtime exception is thrown.