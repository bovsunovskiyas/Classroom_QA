package Homework1;

public class Homework1 {

  public static void main(String[] args) {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
    System.out.println("Fib: " + fib(10));
  }

  public static int fib(int Fn) {

    int first = 0;
    int second = 1;
    int next;

//    int F2 = F1 + F0;  //= 1 + 0 = 1;
//    int F3 = F2 + F1;  //= 1 + 1 = 2;
//    int F4 = F3 + F2; //= 2 + 1 = 3;
//    int F5 = F4 + F3; //= 3 + 2 = 5;
//    int F6 = F5 + F4; //= 5 + 3 = 8;
//    int F7 = F6 + F5; //= 8 + 5 = 13;
//    int F8 = F7 + F6; //= 13 + 8 = 21;
//    int F9 = F8 + F7; //= 21 + 13 = 34;
//    int F10 = F9 + F8; //= 34 + 21 = 55;
//    int F11 = F10 + F9; //= 55 + 34 = 89;

    if (Fn < 0) {
      System.out.println("Please insert valid value >= 0");
    }
    else {

      for (int n = 0; n < Fn; n++) {
        next = second + first;
        second = first;
        first = next;

        //System.out.println(F1);
      }

    }
    return first;

  }
}



//Ввод функции для ряда фибоначи

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

