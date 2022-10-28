package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    
        /*
         * List
         * 
         * Allow duplicates
         * Keeps ordered by index of insertion
         * Allows null values
         * Common implementations: ArrayList, LinkedList, Vector
         */
    
    
    
    List<String> students = new ArrayList<String>();
    students.add("Tony");  // [0]
    students.add("Tony");  // [1]
    students.add("Nyla");  // [2]   // Stays in the order you insert them in
    students.add("Hope");
    students.add(null);    // it also allows for 'null' values
    
    for (String student : students) {
      System.out.println(student);   // We see it allows duplicates 'Tony Tony'
    }
    
    
    
    
        /*
         * Set
         * 
         * No duplicates
         * Prints random index order 
         * Does allow null
         * Common implementations: HashSet, LinkedHashSet, TreeSet
         */
      
    
    
    
    Set<String> states = new HashSet<String>();  // Have to import java.util
    states.add("Arizona");  // '.add' 
    states.add("Arizona");
    states.add("Florida"); // Will show size of 2, and print 'Arizona' and 'Florida' because are not duplicates
    // lets add more
    states.add("Virginia");
    states.add("Texas");
    states.add("New York");
    states.add(null);  // Doesn't allow duplicates so can only allow one null
    
    if  (states.contains("New York")) {
      states.remove("New York");
    }
      
    
    
    System.out.println(states.size()); // Will only show 1 due to no duplicates
    System.out.println("Did you mention Washington: " + states.contains("Washington"));  // Does not contain Washington so prints out false
    System.out.println("Did you mention Arizona: " + states.contains("Arizona"));  // True because contains "Arizona" 
    
    
    for ( String state : states) {
      System.out.println(state);  // Only prints out Arizona 1 time // reason being does not allow duplicates
    }
    
    
    
    
        /*
         * Map
         * 
         * Map<K, V> // K=key // V = Value
         * 
         * Key value pairs (like a dictionary) Key is a word, whatever word you're looking up, it shows you the value of that word
         * values can be duplicates, but not keys  // Ex: can't have same phone # for multiple people, but 1 person can have multiple phone #'s
         * Common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable - t is not capitalized for Hashtable
         */
    
    
    
    
    
    // It has two types. // one for a key // one for a value
    Map<Integer, String> racerPlacements = new HashMap<Integer, String>();  // Have to import java.util
    racerPlacements.put(1, "Tony");  // '.put' used for Map and allows to add a new entry to Map
    racerPlacements.put(2, "Nyla");  // Looks like a list for this ex. but useful when don't want a specific order
    racerPlacements.put(3, "Hope");  // 1,2,3, are the keys, Strings are the value
    
    System.out.println(racerPlacements.get(1)); // '.get' doesn't work the same as List because you don't pass in an index, instead an object. Ex: '1' on (line74)  
    
    
    System.out.println(racerPlacements.remove(1)); // This removed the key (1) and the Value
  
    
    Set<Integer> racerKeys = racerPlacements.keySet(); // '.keySet' grabs the collections of all the keys. Ex. 1,2,3 (line74-line76)
    for (Integer key : racerKeys) {
//      System.out.println(key);     // if want to just see the Keys
      System.out.println(key + ": " + racerPlacements.get(key)); // if want to see the keys and the values
    }
    
    Collection<String> racers = racerPlacements.values(); // '.Values' shows just the Values // Collection will need to be imported
    for ( String racer : racers) {
      System.out.println(racer);
    }
    
    // IF WANT ONLY keys = .keySet()
    // IF WANT ONLY Values = .values()
    
    
      /*     Example on how Key and Values work       */
    
    Map<String, String> dictionary = new HashMap<String, String>();
    dictionary.put("Augment", "make (something) greater by adding to it; increase.");
    dictionary.put("Diminish", "make or become less.");
    dictionary.put("ostentatious", "characterized by vulgar or pretentious display; designed to impress or attract notice.");
    
    
    
    

  }

}
