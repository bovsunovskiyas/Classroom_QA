package Chapter2.T5;

//        5. What is the output of the following code snippet?

//        C. 10,
public class T5 {

  public static void main(String[] args) {

    java.util.List<Integer> list = new java.util.ArrayList<Integer>();
    list.add(10);
    list.add(14);
    for (int x : list) {
      System.out.print(x + ", ");
      break;
    }



    }
  }





//        A. 10, 14,
//        B. 10, 14

//        D. The code will not compile because of line 7.
//        E. The code will not compile because of line 8.
//        F. The code contains an infinite loop and does not terminate.

//
//        java.util.List<String> values = new java.util.ArrayList<String>();
//        values.add("Lisa");
//        values.add("Kevin");
//        values.add("Roger");
//        for (String value : values) {
//        System.out.print(value + ", ");