package learnjava;

import java.util.Scanner;
public class while_doloop {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        // String[] names = {"java", "php", "python"};
        // int i = 0;

        // while (i < names.length) {
        //     System.out.println(names[i]);
        //     i++;
        // }

        // int i = 0;
        // do{

        //     System.out.println(i);
        //     i++;
        // }while(i<5);    

        int lives = 3;
        String answer;

        while(lives > 0){
            System.out.println("What is the element of Potassim?");
            System.out.print("Answer: ");
            answer = s.nextLine();

            if(answer.equalsIgnoreCase("K")){
                break;
            } else {
                lives--;
                if (lives > 0) {
                    System.out.println("Incorrect! You still have " + lives + " chance(s) left.\n");
                }
            }
        }

        if(lives > 0){
            System.out.print("You won!");
        }else{
            System.out.print("Better luck next time!");
        }
        
    }
}
