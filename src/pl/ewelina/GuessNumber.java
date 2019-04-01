package pl.ewelina;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int counter = 0;
    private int randomNumber;

    public void getNumberRange() {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Podaj minimum:");
        int minNumber = inputNumber.nextInt();
        System.out.println("Podaj maximum:");
        int maxNumber = inputNumber.nextInt();
        setRandomNumber(minNumber, maxNumber);
        play();


    }

    public void setRandomNumber(int minNumber, int maxNumber) {
        Random shuffledNumber = new Random();
        randomNumber = (int) (shuffledNumber.nextDouble() * maxNumber + minNumber);
    }

    public void play() {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Zgaduj liczbę");

        while (true) {
            counter++;
            int userNumber = inputNumber.nextInt();
            if(randomNumber > userNumber) {
                System.out.println("Za mało");
            } else if (randomNumber < userNumber) {
                System.out.println("Za dużo");
            } else {
                System.out.println("Trafiłeś: " + randomNumber);
                System.out.println("ilość prób: " + counter);
                break;
            }
        }
    }
}
