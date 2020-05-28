package homework.homework1;

public class Homework1 {

  public static void main(String[] args) {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
    System.out.println("Fib: " + fib(10));
  }

  public static int fib(int fibIndex) {

    int first = 0;
    int second = 1;
    int next;


    if (fibIndex < 0) {
      System.out.println("Please insert valid value >= 0");
    } else {

      for (int n = 0; n < fibIndex; n++) {
        next = second + first;
        second = first;
        first = next;

        //System.out.println(F1);
      }

    }
    return first;

  }
}


//        0 = 0
//        1 = 1
//        a[i] = a[i-1] + a[i - 2]


//fib(10);
//55

//Fibonacci:
//        a[0] = 0;
//        a[1] = 1;
//        a[i] = a[i - 1] + a[i - 2];
//
//        Example:
//        fib(3): returned 2;
//
//        a[2] = 1 + 0;
//        a[3] = a[2] + 1;
//        a[3] = 2;

