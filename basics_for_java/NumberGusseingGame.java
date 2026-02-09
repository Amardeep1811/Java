
import java.util.Scanner;

public class NumberGusseingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number = 1 + (int)(100 * Math.random());
        int k = 5; 
        int count = 0;
        // System.out.println(number);

        for(int i = 0 ; i < k ; i++){
            System.out.print("Enter the guess that you have between 1 - 100 : ");
            int guessNumber = input.nextInt();

            if(guessNumber > number ){
                System.out.println("The acutal number is smaller than your guess number");
            } else if (guessNumber < number){
                System.out.println("The actual number is greater than the number you gussed");
            } else if (guessNumber == number){
                System.out.println("Congrats you have guessed the correct number !! ");
                count = 1;
            }
        }

        if(count != 1) System.out.println("Sorry but you have exhausted your all the attempts , the real number was " + number);

        
    }
}
