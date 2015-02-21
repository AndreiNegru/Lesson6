package lottery;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class LotoAndrei {
    public static void main(String[] args) {
        int[] numbers = new int[49];
        //int[] numbers = new int[49];
        int[] winningNumbers = new int[6]; //array holding 6 random numbers
        int[] userNumber = new int[6]; //array holding the input
        Scanner theNumbers = new Scanner(System.in);
        int guesses;
        int counter=0;
        int i;
    /*
    for(i = 0; i < numbers.length; i++){
    numbers[i] = i + 1;
    out.println(numbers[i]);
    }
    */
        //generate 6 random numbers
        for(i = 0; i < winningNumbers.length; i++ ){
            int randomNums = new Random().nextInt(49);
            winningNumbers[i] = randomNums;
        }
        out.println("Enter the 6 numbers");
        for(i = 0; i < userNumber.length; i++){
            guesses = theNumbers.nextInt();
            userNumber[i] = guesses;
            out.println(userNumber[i]);
            if(winningNumbers[i] == userNumber[i] ){
                counter+=1;
            }
        }
        if (counter == 6){
            out.println("you won!! COngratulations!");
        }
        else
            out.println("you lose!");
    }
}