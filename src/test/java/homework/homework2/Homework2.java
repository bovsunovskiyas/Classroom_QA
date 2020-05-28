package homework.homework2;

public class Homework2 {

  public static void main(String[] args) {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987
    //System.out.println("Fib: " + fib(10));




    int [] array = new int[] {144, 21, 377, 8, 13,  34, 55, 89,  233,  610, 987};
for (int element: array){
  while (true){

  }

}

  }


//процедура бульбашка( A : список елементів придатних для сортування )
//  повторювати
//          переставлені = хиба
//  для i = 1 включно до довжина(A) - 1 робити:
//  /* якщо ця двійка невпорядкована */
//  якщо A[i-1] > A[i] тоді
//    /* поміняти місцями і запам'ятати, що щось змінилось */
//  переставити( A[i-1], A[i] )
//  переставлені = істина
//  кінець якщо
//  кінець для
//  доки не переставлені
//  кінець процедури

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
