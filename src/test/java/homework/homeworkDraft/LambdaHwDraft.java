package homework.homeworkDraft;

import com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaHwDraft {

  static String[] myArray = { "twenty-one", "a first", "one", "to", "on", "two", "three", "four", "five", "six", "seven", "eleven", "fourteen", "seventeen"};
  List<String> myList = Lists.newArrayList("BobyorBob", "Annetentkgs", "Catmydogtom");


  public static void main(String[] args) {

    LambdaHwDraft lambdaHW = new LambdaHwDraft();

    System.out.println("Array before sorting:");
    lambdaHW.printingArray();


    //Not implemented tasks from homework
    //System.out.println("4) Sorted by Strings that contain “e” first, everything else second");
    //System.out.println("Not implemented tasks from homework");

    lambdaHW.findLetterE("text");

    lambdaHW.sortWithSymbolE();
    lambdaHW.printingArray();






    //System.out.println("5) Sorted  Redo the previous problem, but use a static helper method");
    //System.out.println("Not implemented tasks from homework");
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


    Arrays.sort(myArray, (a, b) -> Integer.compare(a.charAt(0), b.charAt(0)));


  }

  public boolean findLetterE(String text) {
    for (int i=0; i < text.length(); i++) {
      Character character = text.charAt(i);
      if (String.valueOf(character).equals("e")) {
        return true;
      }
      return false;
    }
    return false;
  }



    //sortByLength
//    Arrays.sort(myArray, (c, d) -> {
//      return Integer.compare(c.charAt(0), d.charAt(0), Integer.compare(c.charAt(0), d.charAt(0));
//
//
//    } ) ;

    //Arrays.asList(myArray).stream().filter( Arrays.asList("e")::contains).count();
    //Arrays.stream(myArray).filter(Arrays.asList("e")::contains).sorted(Arrays.sort(myArray, (a, b)->Integer.compare(a.charAt(0), b.charAt(0)));


   // Arrays.sort(myArray, (a, b)->Integer.compare(a.charAt(0), b.charAt(0)));
    //Arrays.sort(myArray, (String s1, String s2) -> { Integer.compare(s1.contains("e".charAt(0), s2.charAt(0)), s1.equals("e") ; };


    //static String[] myArray = { "twenty-one", "a first", "one", "to", "on", "two", "three", "four", "five", "six", "seven", "eleven", "fourteen", "seventeen"};

    //List<String> letters = Lists.newArrayList("Bob", "Annet", "Cat");
    //List<String> sortedLetters = letters.stream().sorted().collect(Collectors.toList());
    //System.out.println(sortedLetters.toString());


    //Arrays.asList(myArray).stream().filter( (a -> a.equals("e") || a.equals("e")) ).sorted((a, b)->Integer.compare(a.charAt(0), b.charAt(0)));

    //Integer.compare(a.charAt(0), b.charAt(0))

    // Sort players by last letter using lambda expression
    //Comparator<String> sortByEnteredLetter = (String s1, String s2) -> Integer.compare(s1.charAt(s1.charAt(s1.charAt(0))), s2.charAt(0));
    //Comparator<String> sortByLastLetter = (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
    //Integer.compare
    //Arrays.sort(myArray, sortByLastLetter);
// or this
//    Arrays.sort(myArray, (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));

    //, Integer.valueOf("e")


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





