package RockPaperScissorsLizardSpock;
import RockPaperScissorsLizardSpock.Variant;

import java.util.Scanner;

public class Player extends Variant {
    Scanner sc = new Scanner(System.in);

    public Player(){
        super();
    }

    public CHOICE getChoice() {
            System.out.println("Player turn:");
            System.out.println("ROCK, PAPER OR SCISSORS?\n" +
                    "R - ROCK,\n" +
                    "P - PAPER,\n" +
                    "S - SCISSORS\n");
            char playerChoice = sc.nextLine().toUpperCase().charAt(0);

            switch (playerChoice) {
                case 'R':
                    return CHOICE.ROCK;
                case 'P':
                    return CHOICE.PAPER;
                case 'S':
                    return CHOICE.SCISSORS;
            }
            System.out.println("Invalid input");
            return getChoice();
        }

}
