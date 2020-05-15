package Chapter1.T21;

//21. What does the following code output?
//        A. 0

public class Salmon {

  int count;

  public void Salmon() {
    count = 4;
  }

  public static void main(String[] args) {
    Salmon s = new Salmon();
    System.out.println(s.count);
  }
}