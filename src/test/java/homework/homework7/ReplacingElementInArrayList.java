package homework.homework7;

import java.util.ArrayList;

//Task: Write a Java program to replace the second element of a ArrayList with the specified element
public class ReplacingElementInArrayList {
  public static void main(String[] args){

    ArrayList<String> createdArray = new ArrayList<>();

    //Addind elements to ArrayList
    createdArray.add("1.First");
    createdArray.add("2.Second");
    createdArray.add("3.Third");
    createdArray.add("4.Fourth");

    System.out.println("Array list before after creating: " + createdArray);
    System.out.println();
    String newSecondNumber = "Replaced";
    createdArray.set(1, newSecondNumber);

    int arraySize = createdArray.size();

    //Array with replace second element.
    System.out.println("Array with replace second element:");
    System.out.println();

    for(int i=0; i < arraySize; i++){

      System.out.println(createdArray.get(i));
    }
  }

}