package lottery;


import java.util.Scanner;
import java.util.Random;

public class LotoAndrei {
    public static void main(String[] args) {
        int[] numbers = new int[40];
        int[] winningNumbers = new int[5]; //array holding 6 random numbers
        int[] userNumber = new int[5]; //array holding the input
        Scanner theNumbers = new Scanner(System.in);
        int guesses;
        int counter = 0;

        //generate 6 random numbers
        for (int i = 0; i < winningNumbers.length; i++) {
            int randomNums = new Random().nextInt(40);
            winningNumbers[i] = randomNums+1;
            System.out.print(winningNumbers[i]+" ");
        }

        System.out.println("");

        System.out.println("Enter the 5 numbers:");
        for (int i = 0; i < userNumber.length; i++) {
            guesses = theNumbers.nextInt();
            userNumber[i] = guesses;
            System.out.println("Number inserted: "+userNumber[i]);

        }

        for (int i = 0; i<userNumber.length; i++){
            for (int j=0; j<winningNumbers.length; j++){
                if (winningNumbers[j] == userNumber[i]) {
                    counter += 1;
                }

            }
        }

        if (counter == 5) {
            System.out.println("you won!! Congratulations!");
        } else
            System.out.println("you lose! You guest only: "+counter);
    }
}