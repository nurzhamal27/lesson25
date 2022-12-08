import RockPaperScissors.Game;
import RockPaperScissorsLizardSpock.Game2;

import java.util.Scanner;

public class ChooseGames {

    public void run(){
        Game game = new Game();
        Game2 game2 = new Game2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose which game you want to play: \n" +
                "1 - Rock Paper or Scissors\n" +
                "2 - Rock Paper Scissors Lizard or Spock\n");
        int choose = sc.nextInt();
        if(choose == 1){
            game.play();
        }if(choose == 2){
            game2.play2();
        }
    }
}
