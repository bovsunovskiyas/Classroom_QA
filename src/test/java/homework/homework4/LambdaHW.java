package homework.homework4;

import java.util.Arrays;

public class LambdaHW {

  static String[] myArray = { "twenty-one", "a first", "one", "to", "on", "two", "three", "four", "five", "six", "seven", "eleven", "fourteen", "seventeen"};

  public static void main(String[] args) {

    LambdaHW lambdaHW = new LambdaHW();

    System.out.println("Array before sorting:");
    lambdaHW.printingArray();

    System.out.println("1) Sorted by Length:");
    lambdaHW.sortByLength();
    lambdaHW.printingArray();

    System.out.println("2) Sorted by Reversed Length:");
    lambdaHW.sortByReverseLength();
    lambdaHW.printingArray();

    System.out.println("3) Sorted by Alphabetic:");
    lambdaHW.sortByAlphabet();
    lambdaHW.printingArray();

    //Not implemented tasks from homework
    System.out.println("4) Sorted by Strings that contain “e” first, everything else second");
    System.out.println("Not implemented tasks from homework");

//    lambdaHW.sortWithSymbolE();
//    lambdaHW.printingArray();


    System.out.println("5) Sorted  Redo the previous problem, but use a static helper method");
    System.out.println("Not implemented tasks from homework");
//   lambdaHW.sortWithSymbolE_2();
//    lambdaHW.printingArray();


}

  public void sortByLength() {
    //sortByLength
    Arrays.sort(myArray, (a, b)->Integer.compare(a.length(), b.length()));
  }

  public void sortByReverseLength() {
    //sortByLength
    Arrays.sort(myArray, (b, a)->Integer.compare(a.length(), b.length()));
  }

  public void sortByAlphabet() {
    //sortByLength
    Arrays.sort(myArray, (a, b)->Integer.compare(a.charAt(0), b.charAt(0)));
  }

  // Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
  //(Hint: remember that the body of a lambda is allowed to have curly braces and a return statement. See the first two lambda examples in the notes.)
  public void sortWithSymbolE() {
    //sortByLength
    Arrays.sort(myArray, (c, d) -> Integer.compare(c.charAt(0), d.charAt(0)));

    //, Integer.valueOf("e")
  }

  //Redo the previous problem, but use a static helper method so that your lambda looks like this:
  public void sortWithSymbolE_2() {
    //sortByLength
    Arrays.sort(myArray, (a, b) -> Integer.compare(a.charAt(0), b.charAt(0)));

   // Arrays.sort(myArray, (s1,s2) -> Utils.yourMethod(s1,s2));
    //, Integer.valueOf("e")
  }


  public void printingArray() {
    for (String s : myArray) {
      System.out.println(s);

    }
    System.out.println();
    System.out.println("=======================");
    System.out.println();
}

}


