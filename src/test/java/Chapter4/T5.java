package Chapter4;


//        5. Given the following method, which of the method calls return 2? (Choose all that apply)


//        D. howMany(true, true, true);
//        G. howMany(true, new boolean[2]);

public class T5 {

  public static void main(String[] args) {
    T5 t5 = new T5();
    System.out.println(t5.howMany(true, true, true));

  }

  public int howMany(boolean b, boolean... b2) {
        return b2.length;
        }
}
