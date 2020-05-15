package Chapter1.T19;

//  19. Suppose we have a class named Rabbit. Which of the following statements are true? (Choose all that apply)
public class Rabbit {

public static void main(String[] args) {
  Rabbit one = new Rabbit();
  Rabbit two = new Rabbit();
  Rabbit three = one;
      one = null;
  Rabbit four = one;
      three = null;
      two = null;
      two = new Rabbit();
      System.gc();
      } }



//  A. The Rabbit object from line 3 is first eligible for garbage collection immediately
//  following line 6.
//  B. The Rabbit object from line 3 is first eligible for garbage collection immediately
//  following line 8.
//  C. The Rabbit object from line 3 is first eligible for garbage collection immediately
//  following line 12.
//  D. The Rabbit object from line 4 is first eligible for garbage collection immediately
//  following line 9.
//  E. The Rabbit object from line 4 is first eligible for garbage collection immediately
//  following line 11.
//  F. The Rabbit object from line 4 is first eligible for garbage collection immediately
//  following line 12.