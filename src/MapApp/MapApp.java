package MapApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapApp {

  static Scanner scan = new Scanner(System.in);
  static Map<String, String> phoneBook = new HashMap<String, String>();
  
  
  public static void main(String[] args) {
    
    /**
     * start with methods feel might need
     */
    
    int choice = 0;
    
    
    while (choice != 4) {
      
      printMunu();
      choice = getUserChoice();
      
      if (choice == 1) {
        addContacts();
      } 
      else if (choice == 2) {
        displayPhoneBook();
      }
      else if (choice == 3) {
        deleteContact();
      }
      else if (choice == 4) {
        System.out.println("Goodbye!");
      }
      else {
        System.out.println("Please pick a valid option" + "\n");
      }
    }
  }


      public static void printMunu() {
        System.out.println("1) Add concact");
        System.out.println("2) Display Phone book");
        System.out.println("3) Delete contact");
        System.out.println("-------------------------");
      } 
      
      
      
      public static int getUserChoice() {
//        System.out.println("\n");
        return scan.nextInt();
      }
      
      
      public static void addContacts() {
        System.out.print("\nEnter phone number: ");
        String phoneNumber = scan.next();
        System.out.print("What would you like to name new contact: ");
        String name = scan.next();
        phoneBook.put(phoneNumber, name); // Put phone as the key, name as the value
        System.out.println("Contact added: " + "\n");
        System.out.println("Number: " + phoneNumber + "\tName: " + name);
        System.out.println("");
      }
        
        
        
      public static void displayPhoneBook() {
        System.out.println("");
        Set<String> phoneNumbers = phoneBook.keySet();
        
        if (phoneNumbers.size() <= 1) {
          System.out.println("Contact:");
        } 
        else {
          System.out.println("Contacts:");
        }
        
        for (String phoneNumber : phoneNumbers) {
          System.out.println(phoneNumber + ": " + phoneBook.get(phoneNumber));
        }
        System.out.println("\n");
      }
      
      
      public static void deleteContact() {
        System.out.println("");
        System.out.print("Enter name you wish to delete: ");
        String phoneNumber = scan.next();
        System.out.println("\nRemoved " + phoneNumber + ": " + phoneBook.remove(phoneNumber));
        System.out.println();
      }
      
      
      
      
      
      
      
}
