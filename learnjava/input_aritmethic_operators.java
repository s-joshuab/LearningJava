package learnjava;

// import java.util.*;
import java.util.Scanner;

public class input_aritmethic_operators {
    public static void main(String[] args) {
        // Input Operators
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // float name = scan.nextFloat();
        // System.out.println("Your GPA is " + name + "!");


        // Arithmetic Operators

        float num1;
        float num2;
        float results;
        char Operators;

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter Number 1: ");
        num1 = scan.nextFloat();

        System.out.println("Enter Number 2: ");
        num2= scan.nextFloat();

        System.out.println("Choose an operation (+, -, *, /, %): ");
        Operators = scan.next().charAt(0);

        switch (Operators) {
            case '+':
                results = num1 + num2;
                break;
            case '-':
                results = num1 - num2;
                break;
            case '*':
                results = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    results = num1 / num2;
                }else{
                    System.out.println("Bonak di pwede i divide sa zero!");
                    return;
                }
                break;
            case '%':
                results = num1 % num2;
                break;   
            default:
                System.out.println("Wala yan sa Choices kupal");
                return;
        }

        System.err.println("Results: " + results);
    }    
}
