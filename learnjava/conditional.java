package learnjava;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

         System.out.print("Data: ");
         float Data = s.nextFloat();

         System.out.println("Capstone: ");
         float Capstone = s.nextFloat();

         System.out.println("Analytics: ");
         float Analytics = s.nextFloat();

         System.out.println("Communication: ");
         float Communication = s.nextFloat();

         float average = (Data + Capstone + Analytics + Communication) / 4;
         int roundedAverage = Math.round(average);
        
         String remark = switch (roundedAverage) {
            case 100 -> "Hmm suspicious";
            case 98, 99 -> "With Highest Honor";
            case 95, 96, 97 -> "With High Honor";
            case 90, 91, 92, 93, 94 -> "With Honor";
            default -> {
                if (roundedAverage >= 75) yield "Passed";
                else yield "Failed";
            }
        };

        System.out.println("Your Average is " + average);
        System.out.println("Your Remark is " + remark);

}

}