package lottery;


import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.util.Scanner;
import java.util.Random;

public class LotoAndrei {
    public static void main(String[] args) {
        int[] numbers = new int[49];
        int[] winningNumbers = new int[6]; //array holding 6 random numbers
        int[] userNumber = new int[6]; //array holding the input
        Scanner theNumbers = new Scanner(System.in);
        int guesses;
        int counter = 0;

        //generate 6 random numbers
        for (int i = 0; i < winningNumbers.length; i++) {
            int randomNums = 0;
            boolean found = true;
            do {
                found = true;
                randomNums = new Random().nextInt(49);
                for (int j = 0; j < i - 1; j++) {
                    if (winningNumbers[j] == randomNums) {
                        found = false;
                        for (int k = 0; k < i - 1; k++) {
                            System.out.print(winningNumbers[k] + " ");
                        }
                        System.out.println("Found: " + randomNums + " as duplicated number");
                    }
                }
            } while (!found);
            winningNumbers[i] = randomNums + 1;
        }

        System.out.println("All winning numbers: ");
        for (int k = 0; k < winningNumbers.length; k++) {
            System.out.print(winningNumbers[k] + " ");
        }
        System.out.println("");

        System.out.println("Enter the 6 numbers:");
        for (int i = 0; i < userNumber.length; i++) {
            guesses = theNumbers.nextInt();
            while ((guesses>49) || (guesses<1)){
                System.out.println("Reinsert number:");
                guesses = theNumbers.nextInt();
            }
            userNumber[i] = guesses;
            System.out.println("Number inserted: " + userNumber[i]);

        }

        for (int i = 0; i < userNumber.length; i++) {
            for (int j = 0; j < winningNumbers.length; j++) {
                if (winningNumbers[j] == userNumber[i]) {
                    counter += 1;
                }

            }
        }

        if (counter == 6) {
            System.out.println("you won!! Congratulations!");
        } else
            System.out.println("you lose! You guest only: " + counter);
    }
}