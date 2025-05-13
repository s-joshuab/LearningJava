package learnjava;

import java.util.Scanner;

public class ForEachLoop {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        // String[] names = {"Taro", "Nagumo", "Shiba", "Shin"};

        // System.out.print("Search Name: ");
        // String search = s.nextLine();

        // boolean found = false;

        // for (String name : names) {
        //     if (name.equalsIgnoreCase(search)) {
        //         System.out.println("We found " + name);
        //         found = true;
        //         break;
        //     }
        // }

        // if (!found) {
        //     System.out.println("The Name is not Found");
        // }

        // s.close(); // Good practice to close the scanner


        int[] numbers = {12, 123, 4343, 123, 90};
        int sum = 0;

        for(int num:numbers){
            sum = sum + num;
        }
            System.out.print("The Sum is: " + sum);
    }
}
