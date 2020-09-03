package homework.homework8;

import java.util.TreeSet;

//Task: Write a Java program to retrieve and remove the last element of a tree set.
public class RemovingElementFromTreeSet {

  public static void main(String[] args){

    // Adding TreeSet
    TreeSet<Integer> treeSet = new TreeSet<>();

    // Add numbers to the tree
    treeSet.add(15);
    treeSet.add(31);
    treeSet.add(26);
    treeSet.add(55);
    treeSet.add(11);
    treeSet.add(62);
    treeSet.add(7);
    treeSet.add(9);
    treeSet.add(199);
    treeSet.add(89);
    treeSet.add(5);

    System.out.println("Size before removing: " + treeSet.size());
    System.out.println("Created TreeSet: \n" + treeSet);

    System.out.println();

    System.out.println("The last element which should be removed: " + treeSet.pollLast());
    System.out.println();
    System.out.println("New size after removing: " + treeSet.size());
    System.out.println("Tree set after removing last element: \n" + treeSet);
  }
}
