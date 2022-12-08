package RockPaperScissorsLizardSpock;

import java.util.Scanner;

public class Player2 extends Variant2 {
    Scanner sc = new Scanner(System.in);

    public Player2(){
        super();
    }

    public CHOICE getChoice() {
            System.out.println("Player turn:");
            System.out.println("ROCK, PAPER OR SCISSORS?\n" +
                    "R - ROCK,\n" +
                    "P - PAPER,\n" +
                    "S - SCISSORS\n"+
                    "L - LIZARD\n" +
                    "K - SPOCK");
            char playerChoice = sc.nextLine().toUpperCase().charAt(0);

            switch (playerChoice) {
                case 'R':
                    return CHOICE.ROCK;
                case 'P':
                    return CHOICE.PAPER;
                case 'S':
                    return CHOICE.SCISSORS;
                case 'L':
                    return CHOICE.LIZARD;
                case 'K':
                    return CHOICE.SPOCK;
            }
            System.out.println("Invalid input");
            return getChoice();
        }

}
