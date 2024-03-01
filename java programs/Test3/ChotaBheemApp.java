
import java.util.Scanner;
public class ChotaBheemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int laddusOnPlate = 21;

        System.out.println("Welcome to the Chota Bheem Game!");

        while (true) {
           
            int userPick = getUserPick( laddusOnPlate);
            laddusOnPlate -= userPick;
            
          
            if (laddusOnPlate == 0) {
                System.out.println("Congratulations! You picked the last laddu. Chota Bheem wins!");
                break;
            }

           
            int bheemPick = getBheemPick(laddusOnPlate);
            System.out.println("Chota Bheem picks " + bheemPick + " laddus.");
            laddusOnPlate -= bheemPick;

         
            if (laddusOnPlate == 0) {
                System.out.println("Chota Bheem picked the last laddu. You lose!");
                break;
            }

            System.out.println("Laddus remaining on the plate: " + laddusOnPlate);
        }

        sc.close();
    }

    private static int getUserPick( int remainingLaddus) {
        int userPick;
        do {
        	Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of laddus you want to pick (1-4): ");
            userPick = sc.nextInt();
        } while (userPick < 1 || userPick > 4 || userPick > remainingLaddus);

        return userPick;
    }

    private static int getBheemPick(int remainingLaddus) {
       
        int bheemPick = (remainingLaddus % 5 == 0) ? 4 : remainingLaddus % 5;
        return bheemPick;
    }
}
