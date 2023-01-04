import java.util.Scanner;

/**
 * Author: Ajinkya Bhushan
 * Language: Java
 * Platform: Java 14
 */

/**   Main class has the main function which is the entry point*/
public class Main {
    public static void main(String[] args) {
        int consumedMins  = 0;
        Scanner scan = new Scanner(System.in);     // To take the input from the console
        System.out.print("Enter the minutes to check the pricing: ");
        try {
            consumedMins = scan.nextInt();
            Pricing pricing = new Pricing();    //creating a new instance of Pricing
        if (pricing.checkInput(consumedMins)){  // To check if the input is negative or not
            System.out.println("The input seems to be 'Negative' Integer. Minutues must be entered as 'Positive' Integer");
        }
        else {
            System.out.println(consumedMins + " minutues = £" + pricing.getPrice(consumedMins));    // Calling the getPrice Method
        }
        }catch (Exception e){       // To check type of the input.
            System.out.println("It seems like the input type is not 'Integer'. Minutues must be entered as 'Positive' Integer");
        }
    }
}
