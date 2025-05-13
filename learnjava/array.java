package learnjava;

import java.util.Scanner;

public class array {
   public static void main(String[] args) {
    
   //  Scanner s = new Scanner(System.in);
   //  String subjects[] = new String[10];

    
   //  System.out.println("Enter the subject: ");
   //  subjects[1] = s.nextLine();

   //  System.out.println("The new subject/s is: " + subjects[1]);

   String[] subjects = {"Capstone", "Data Structures", "History of Rizal"};
   int[] grades = {90, 85, 95};
   boolean[] isPass = {true, true, true};

   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter the index (0 to " + (subjects.length - 1) + "): ");
   int index = scanner.nextInt();

   if (index >= 0 && index < subjects.length) {
       System.out.println("Subject: " + subjects[index]);
       System.out.println("Grade: " + grades[index]);
       System.out.println("Passed: " + isPass[index]);
   } else {
       System.out.println("Invalid index!");
   }

    } 
}
