package Chapter1.T20;

//  20. What is true about the following code? (Choose all that apply)

//B. finalize() might or might not be called
//E. Garbage collection might or might not run.

public class Bear {

  protected void finalize() {
    System.out.println("Roar!");
  }

  public static void main(String[] args) {
    Bear bear = new Bear();
    bear = null;
    System.gc();
  }
}