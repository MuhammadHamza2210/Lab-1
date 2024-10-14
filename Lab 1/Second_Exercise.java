
package encap;  // Declares the package name 'encap' which helps in organizing the code

import java.util.Scanner;  // Imports the Scanner class from the 'java.util' package for user input

public class Second_Exercise {  // Declares a public class named 'Second_Exercise'
    public static void main(String[] args){  // Main method, the entry point of the Java program
        Scanner sc = new Scanner(System.in);  // Creates a new Scanner object to read input from the user
        
        // Prompts the user to enter their name and stores it in the 'name' variable
        System.out.println("Enter your Name");  
        String name = sc.nextLine();  // Reads the user's input as a String and assigns it to the variable 'name'
        
        // Prompts the user to enter their enrollment number and stores it in the 'enr' variable
        System.out.println("Enter your Enrollment No");  
        String enr = sc.nextLine();  // Reads the user's input as a String and assigns it to the variable 'enr'
        
        // Prompts the user to enter their subject name and stores it in the 'sub' variable
        System.out.println("Enter your Subject Name");  
        String sub = sc.nextLine();  // Reads the user's input as a String and assigns it to the variable 'sub'
        
        // Prompts the user to enter their instructor's name and stores it in the 'inst' variable
        System.out.println("Enter your Instructor name");  
        String inst = sc.nextLine();  // Reads the user's input as a String and assigns it to the variable 'inst'
        
        // Prompts the user to enter their semester and stores it in the 'sem' variable
        System.out.println("Enter your Semester");  
        String sem = sc.nextLine();  // Reads the user's input as a String and assigns it to the variable 'sem'
        
        // Prints the user's name
        System.out.println("NAME:" + name);  
        
        // Prints the user's enrollment number
        System.out.println("ENROLLMENT NO:" + enr);  
        
        // Prints the user's subject name
        System.out.println("SUBJECT NAME:" + sub);  
        
        // Prints the instructor's name
        System.out.println("Instructor NAME:" + inst);  
        
        // Prints the user's semester
        System.out.println("SEMESTER NAME:" + sem);  
    }
}
