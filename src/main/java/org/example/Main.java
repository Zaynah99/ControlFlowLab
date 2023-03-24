package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        need a secret number
//        user needs to guess it - take input?
//        if too high or too low, let them know
//        if guessed correctly let them know
//        useful to write pseudocode to plan ahead
//        this is an example of how to turn integers into strings and vice versa (Parsing)
        int secretNumber = 9;
        System.out.println("Guess my favourite number");
        Scanner scanner = new Scanner(System.in);
//        need a scanner object to take input from user
        String guess = scanner.nextLine();
        System.out.println("Your guess was: " + guess);
//        use + to concatenate

        if(guess.equals(String.valueOf(secretNumber))){
            System.out.println("Nice, that is my favourite!");
        } else if (secretNumber < Integer.valueOf(guess)){
            System.out.println("Too high, guess again!");
        } else if (secretNumber > Integer.valueOf(guess)){
            System.out.println("Too low, guess again!");
        }


    }
}