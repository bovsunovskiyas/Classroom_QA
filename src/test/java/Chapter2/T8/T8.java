package Chapter2.T8;


//        8. What is the output of the following code snippet?

//        B. true, 20, false
public class T8 {

  public static void main(String[] args) {
    boolean x = true, z = true;
    int y = 20;
    x = (y != 10) ^ (z = false);
    System.out.println(x + ", " + y + ", " + z);
  }
}






//        A. true, 10, true
//        C. false, 20, true
//        D. false, 20, false
//        E. false, 20, true
//        F. The code will not compile because of line 5.