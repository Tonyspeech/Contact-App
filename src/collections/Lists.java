package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    
   String[] cars = new String[3];
   cars[0] = "Hyundai";
   cars[1] = "Kia";
   cars[2] = "Corvertte";
   // the array is limited to just three elements in the index
   
  
  
   /*        LIST ARE INTERFACE      */
   
   
   
   
//   List<E> list of E where E is the generic that will be replaced with the type
//   List<String> Reads as 'list of Strings'
   
    /*      EXAMPLE     */
                            // Need to add what method using to the list, in this case ArrayList  // But we always start with just 'List'
   List<String> sports = new ArrayList<String>();
  // have to import java.util from the list. Also have to import java.util for the ArrayList
   sports.add("Basketball"); // [0]   // can just keep adding to the list with no set amount of times
   sports.add("Football"); // [1]     // Don't have to keep track of the order it will keep adding to the list for you
   sports.add("Golf");   // [2] 
   sports.remove(1);  // '.removes' index from the list
   
   for ( int i = 0; i < sports.size(); i++) {  // List use '.size' because it is a method. Arrays use '.length' because it is a property 
     System.out.println(sports.get(i));  // For List we use '.get(i)' in the method() unlike an array where we use just [i] to access the elements
   }
    /*     ENHANCED FOR LOOP     */
   for (String sport : sports) {
     System.out.println(sport);      
   }
    
   
//   List<int> numbers = new ArrayList<int>(); // cannot use a primitive data type. 
   List<Integer> numbers = new ArrayList<Integer>(); // each primitive has a corresponding object/class    // int = Integer
      System.out.println(numbers.isEmpty());  // '.isEmpty()' will return a boolean if any elements are in the List with checking the size
   
   

  }

}
