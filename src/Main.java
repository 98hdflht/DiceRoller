// Quincy Yarbrough
// 7/1/2024

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variable declaration
        int die1, die2, total = 0;
        String snake = "Snake Eyes!";
        String box = "Box Cars!";
        Scanner sc = new Scanner(System.in);
        // start of program
        System.out.println("Dice Roller");
        System.out.println("Roll the dice (y/n): ");
        String reroll = sc.nextLine();

        if (reroll.equalsIgnoreCase("y")) { // check for initial y/n
            do {
                die1 = (int) (Math.random() * 6) + 1; // generate random rolls
                die2 = (int) (Math.random() * 6) + 1;
                total = die1 + die2;
                System.out.println("Die 1: " + die1); // output of rolls
                System.out.println("Die 2: " + die2);
                System.out.println("Total: " + total);
                if (die1 == 1 && die2 == 1) { // decide if double 1 or double 6
                    System.out.println(snake);
                } else if (die1 == 6 && die2 == 6) {
                    System.out.println(box);
                }
                System.out.print("Roll Again? (y/n): "); // ask if continuation is needed
                reroll = sc.nextLine();

            } while (reroll.equalsIgnoreCase("y"));
        }
    }
}