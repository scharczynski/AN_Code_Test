//I was a little uncertain about the directions of this question
//I completed the problems assuming the goal was to perform the operations using various Collections implementations

import java.util.*;

public class CollectionTest{
  public static void main (String[] args) {
    //First part----------------------------------------------------------------
    //I chose a HashSet here as all we wanted here was an unordered set of the integers
    HashSet<Integer> set1 = new HashSet<Integer>();
    HashSet<Integer> set2 = new HashSet<Integer>();

    //fill the HashSets in
    for (int i = 0; i < 10; i++){
      set1.add(i + 1);
      set2.add(i + 6);
    }

    //print toString representation of both HashSets
    System.out.println(set1.toString());
    System.out.println(set2.toString());

    //print size of both
    System.out.println(set1.size());
    System.out.println(set2.size());

    //Second part-----------------------------------------------------------------
    //I chose an ArrayList here because we need to sort the elements and be able to access them by index
    ArrayList<Integer> list1 = new ArrayList<Integer>();

    //I chose to iterate through both sets at the same time and add them to our new list
    //Additionally, I chose to insert the elements in order, as opposed to just sorting after all values were inserted
    Iterator<Integer> it = set1.iterator();
    Iterator<Integer> it2 = set2.iterator();

    while (it.hasNext() || it2.hasNext()){
      Integer next = it.next();
      Integer next2 = it2.next();
      
      //if the element is in the list, it will let us know to not add it, if it is not this method will return the index where that element "would" be, then we can insert it there
      int pos = Collections.binarySearch(list1, next);
      if (pos < 0) {
        list1.add(-pos-1, next);
      }

      int pos2 = Collections.binarySearch(list1, next2);
      if (pos2 < 0) {
        list1.add(-pos2-1, next2);
      }
    }

    //removing the middle entry
    list1.remove(list1.size() / 2);
    //reversing and printing the list
    Collections.reverse(list1);
    System.out.println(list1.toString());
    //printing the list's size
    System.out.println(list1.size());

    //Third part---------------------------------------------------------------------------
    //I chose a HashMap here in order to store the key-value pairs
    //There is no need to use any other Map implementation as we don't care about order
    HashMap<String, Integer> map1 = new HashMap<String, Integer>();
    //manually adding 5 key value pairs
    map1.put("Dog", 100);
    map1.put("Cat", 75);
    map1.put("Parrot", 200);
    map1.put("Lizard", 20);
    map1.put("Turtle", 15);

    //unsure if i am meant to first put in the dupplicate value, or just do the check to start with
    map1.put("Turtle", 1500000);
    String dupe = "Cat";
    if (map1.containsKey(dupe)){
      System.out.println(dupe + ", " + map1.get(dupe));
    }
    else {
      map1.put(dupe, 2000000);
    }

    //iterating through the keyset and printing key-value pairs
    for(String key: map1.keySet()) {
      System.out.println(key + ", " + map1.get(key));
    }

    //printing the map's size
    System.out.println(map1.size());


  }
}
