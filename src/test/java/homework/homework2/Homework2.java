package homework.homework2;

public class Homework2 {

  public static void main(String[] args) {

  // Enter some int vales to array
    int[] array = new int[]{144, 21, 377, 8, 13, 34, 55, 89, 233, 610, 987};


    System.out.println("Before 'Bubble sorting': ");

    for (int elements : array) {
      System.out.print(elements + " ");
    }

    Homework2 hw2 = new Homework2();
    hw2.bubbleSorting(array);

    System.out.println(" ");
    System.out.println("------------------------");

    System.out.println("After 'Bubble sorting': ");

    for (int elements : array) {
      System.out.print(elements + " ");
    }
    System.out.println(" ");

  }


  public void bubbleSorting(int[] array) {
    boolean sorted = false;
    int temp;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          sorted = false;
        }
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


}
