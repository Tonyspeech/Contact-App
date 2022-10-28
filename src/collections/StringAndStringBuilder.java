package collections;

public class StringAndStringBuilder {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // basic String
    
    
    
    // String is immutable 
    
    String firstName = "Tony";
    String lastName = "Ortega";
    System.out.println(firstName + " " + lastName);
    
    
    String tripleHI = multiplyString("Hi", 3); // this goes the String method multiplyString.
    System.out.println(tripleHI);               // prints out the String num times you entered.
    
    
    System.out.println(firstName.concat(" " + lastName));          //using .concat = concatenation 
    firstName = firstName.concat(" " + lastName);
    System.out.println(firstName);
    
    // StringBuilder is mutable                // you fill in the parameters of the StringBuilder or leave blank
    StringBuilder fullName = new StringBuilder("Nyla ");  // a StringBUuilder allows you top build up a String, then you can call the .toString() to convert to a real String
    fullName.append("Reed");       // append is just like concat it will append to the end of values used. Basically add to the String
    System.out.println(fullName.toString());      // The .toString() basically concats the names together to make it a full String
//    StringBuilder allows you to build up and manipulate the parts of that String and convert it to a String without creating without creating multiple new Strings. (line14,line15)             
    
    
          /*        working with '.' methods                 */
    
    System.out.println(fullName.charAt(5)); // prints out R. That is the fifth character of Nyla Reed. Chars print out the letter in or number in front and start at 0.          
//    System.out.println(fullName.deleteCharAt(5)); // This will delete the fifth character in the value used. Nyla Reed the R will be deleted. = Nyla eed for ex.
//    System.out.println(fullName.delete(1, 5)); // deleted the characters of positions 1-5. = Need for ex. 
    System.out.println(fullName.indexOf("ed"));  // useful for finding the substring or character of that String exist at.
    System.out.println(fullName.replace(5, 9, "Brasi")); // replaces characters with substring. subString = "Ortega". Can also use variables for substring. Ex. lastName (line12)        
    System.out.println(fullName.reverse()); // Doesn't take any parameters it just reverses the String. prints it out backwards.
    
    
        /* Want to use a StringBuilder when want to change around Strings, and just String when want a constant. The return ''.toString() finalizes the printout (line64)         */              
    

  }

  
  // String
  
//  public static String multiplyString(String str, int num) {
//    String result = "";
//    
//    for(int i = 0; i < num; i++) {
//      result += str;
//    }
//    return result;
//  }
  
  // StringBuilder
  
  public static String multiplyString(String str, int num) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < num; i++) {
      result.append(str);
    }
    return result.toString();
  }                                          // Still prints out HiHiHi
  
  
  
  
  
  
  
  
}
