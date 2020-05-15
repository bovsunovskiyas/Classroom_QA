package Chapter2.T25;

public class ZX {
}


//        9. How many times will the following code print "Hello World"?
//        3: for(int i=0; i<10 ; ) {
//        4: i = i++;
//        5: System.out.println("Hello World");
//        6: }
//        A. 9
//        B. 10
//        C. 11
//        D. The code will not compile because of line 3.
//        E. The code will not compile because of line 5.
//        F. The code contains an infinite loop and does not terminate.
//        10. What is the output of the following code?
//        3: byte a = 40, b = 50;
//        4: byte sum = (byte) a + b;
//        5: System.out.println(sum);
//        Review Questions 97
//        A. 40
//        B. 50
//        C. 90
//        D. The code will not compile because of line 4.
//        E. An undefined value.
//        11. What is the output of the following code?
//        1: public class ArithmeticSample {
//2: public static void main(String[] args) {
//    3: int x = 5 * 4 % 3;
//    4: System.out.println(x);
//    5: }}
//A. 2
//        B. 3
//        C. 5
//        D. 6
//        E. The code will not compile because of line 3.
//        12. What is the output of the following code snippet?
//        3: int x = 0;
//        4: String s = null;
//        5: if(x == s) System.out.println("Success");
//        6: else System.out.println("Failure");
//        A. Success
//        B. Failure
//        C. The code will not compile because of line 4.
//        D. The code will not compile because of line 5.
//        13. What is the output of the following code snippet?
//        3: int x1 = 50, x2 = 75;
//        4: boolean b = x1 >= x2;
//        5: if(b = true) System.out.println("Success");
//        6: else System.out.println("Failure");
//        A. Success
//        B. Failure
//        C. The code will not compile because of line 4.
//        D. The code will not compile because of line 5.
//        14. What is the output of the following code snippet?
//        3: int c = 7;
//        4: int result = 4;
//        98 Chapter 2 ■ Operators and Statements
//        5: result += ++c;
//        6: System.out.println(result);
//        A. 8
//        B. 11
//        C. 12
//        D. 15
//        E. 16
//        F. The code will not compile because of line 5.
//        15. What is the output of the following code snippet?
//        3: int x = 1, y = 15;
//        4: while x < 10
//        5: y––;
//        6: x++;
//        7: System.out.println(x+", "+y);
//        A. 10, 5
//        B. 10, 6
//        C. 11, 5
//        D. The code will not compile because of line 3.
//        E. The code will not compile because of line 4.
//        F. The code contains an infinite loop and does not terminate.
//        16. What is the output of the following code snippet?
//        3: do {
//        4: int y = 1;
//        5: System.out.print(y++ + " ");
//        6: } while(y <= 10);
//        A. 1 2 3 4 5 6 7 8 9
//        B. 1 2 3 4 5 6 7 8 9 10
//        C. 1 2 3 4 5 6 7 8 9 10 11
//        D. The code will not compile because of line 6.
//        E. The code contains an infinite loop and does not terminate.
//        17. What is the output of the following code snippet?
//        3: boolean keepGoing = true;
//        4: int result = 15, i = 10;
//        5: do {
//        6: i--;
//        7: if(i==8) keepGoing = false;
//        8: result -= 2;
//        9: } while(keepGoing);
//        Review Questions 99
//        10: System.out.println(result);
//        A. 7
//        B. 9
//        C. 10
//        D. 11
//        E. 15
//        F. The code will not compile because of line 8.
//        18. What is the output of the following code snippet?
//        3: int count = 0;
//        4: ROW_LOOP: for(int row = 1; row <=3; row++)
//        5: for(int col = 1; col <=2 ; col++) {
//        6: if(row * col % 2 == 0) continue ROW_LOOP;
//        7: count++;
//        8: }
//        9: System.out.println(count);
//        A. 1
//        B. 2
//        C. 3
//        D. 4
//        E. 6
//        F. The code will not compile because of line 6.
//        19. What is the result of the following code snippet?
//        3: int m = 9, n = 1, x = 0;
//        4: while(m > n) {
//        5: m--;
//        6: n += 2;
//        7: x += m + n;
//        8: }
//        9: System.out.println(x);
//        A. 11
//        B. 13
//        C. 23
//        D. 36
//        E. 50
//        F. The code will not compile because of line 7.
//        20. What is the result of the following code snippet?
//        3: final char a = 'A', d = 'D';
//        4: char grade = 'B';
//        100 Chapter 2 ■ Operators and Statements
//        5: switch(grade) {
//        6: case a:
//        7: case 'B': System.out.print("great");
//        8: case 'C': System.out.print("good"); break;
//        9: case d:
//        10: case 'F': System.out.print("not good");
//        11: }
//        A. great
//        B. greatgood
//        C. The code will not compile because of line 3.
//        D. The code will not compile because of line 6.
//        E. The code will not compile because of lines 6 and 9.