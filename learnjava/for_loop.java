package learnjava;

import java.util.*;

public class for_loop{

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        // String[] cars = {"Honda Civic", "Jeep Wrangler", "Ferrari", "Montero Sport"};

        // System.out.print("Search your car: ");
        // String search = s.nextLine();

        // for(int i = 0; i < cars.length; i++){
        //     if(cars[i].equalsIgnoreCase(search)){
        //         System.out.println("We Found " + cars[i]);
        //         break;
        //     }else{
        //         System.out.println(cars[i]);
        //     }
        // }

        String[] username = {"Admin", "Staff", "Clients"};
        String[] password = {"Pa$$w0rd!", "$t@ff", "password"};

        System.out.print("Username: ");
        String inputusername = s.nextLine();

        System.out.print("Password: ");
        String inputpassword = s.nextLine();

        boolean isExist = false;

        for(int i = 0; i < username.length; i++){
            if(inputusername.equals(username[i]) && inputpassword.equals(password[i])){
                System.out.print("Login Succesful Welcome! " + username[i]);
                break;
            }else{
                System.out.println("Invalid Username or Password!");
                break;
            }

            }
        }

    


//     String[] username = {"Admin", "Staff", "Clients"};
//     String[] password = {"Pa$$w0rd!", "$t@ff", "password"};

//     boolean loginSuccessful = false;

//     while (!loginSuccessful) {
//         System.out.print("Username: ");
//         String inputusername = s.nextLine();

//         System.out.print("Password: ");
//         String inputpassword = s.nextLine();

//         boolean matched = false;
//         for (int i = 0; i < username.length; i++) {
//             if (inputusername.equals(username[i]) && inputpassword.equals(password[i])) {
//                 System.out.println("✅ Login Successful! Welcome, " + username[i] + "!");
//                 matched = true;
//                 loginSuccessful = true;
//                 break;
//             }
//         }

//         if (!matched) {
//             System.out.println("❌ Invalid Username or Password.");
//             System.out.print("Do you want to try again? (Y/N): ");
//             String choice = s.nextLine();
//             if (!choice.equalsIgnoreCase("Y")) {
//                 System.out.println("🔒 Exiting program. Goodbye!");
//                 break;
//             }
//         }
//     }
// }
}









