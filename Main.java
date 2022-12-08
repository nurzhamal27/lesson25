import RockPaperScissorsLizardSpock.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game game = new Game();

        char quit = ' ';

        while (quit != 'N'){
            game.startGame();
            System.out.println("Play again? Press any key to continue, or 'N' to quit");
            quit = sc.nextLine().toUpperCase().charAt(0);
        }
        sc.close();
        game.printGameStats();

    }
}