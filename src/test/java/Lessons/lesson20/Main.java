package Lessons.lesson20;

public class Main {

  public static void main(String[] args) {

    Music mc = Music.POP;
    System.out.println(mc);

    System.out.println(mc.name() + " " + mc.ordinal());

    System.out.println("===================");

    Music mc2 = Music.valueOf(Music.class,"ROCK");
    System.out.println(mc2);

    System.out.println("===================");

    for (Music element : Music.values()    )
    {
      System.out.println(element);
    }

    System.out.println("===================");




  }
}
