package RockPaperScissorsLizardSpock;

public class Game extends Variant {
    private Player player;
    private Computer computer;
    private CHOICE playerChoice;
    private CHOICE computerChoice;
    private RESULT result;
    private int userScore;
    private int computerScore;
    private int totalGame;
    private int tie;


    public Game() {
        super();
        player = new Player();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        totalGame = 0;
    }

    public void startGame() {
        System.out.println("========START GAME=======");
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResult();
        displayResults();
        stats();

    }

    private void stats(){
        if(result == RESULT.WIN){
            userScore++;
        }else if (result == RESULT.LOSE){
            computerScore++;
        }else {
            tie++;
        }
        totalGame++;
    }


    private void displayResults(){
        switch (result){
            case WIN:
                System.out.println(playerChoice + " beats " + computerChoice + " Player win!");
                break;
            case LOSE:
                System.out.println(playerChoice + " loses to " + computerChoice + " Computer win!");
                break;
            case TIE:
                System.out.println(playerChoice + " equals to " + computerChoice + " It is a tie!");
                break;
        }
    }

    public RESULT getResult() {
        if (playerChoice == computerChoice)
            return RESULT.TIE;
            switch (playerChoice) {
                case ROCK:
                    return (computerChoice == CHOICE.SCISSORS ? RESULT.WIN : RESULT.LOSE);
                case PAPER:
                    return (computerChoice == CHOICE.ROCK ? RESULT.WIN : RESULT.LOSE);
                case SCISSORS:
                    return (computerChoice == CHOICE.PAPER ? RESULT.WIN : RESULT.LOSE);
            }
            return RESULT.LOSE;
        }

    public void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = totalGame - userScore - computerScore;
        double winRate = (wins + ((double) ties) / 2) / totalGame;

        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "WINS", "LOSSES", "TIES", "TOTAL GAMES", "WIN RATE");

        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");


        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, totalGame, winRate * 100);


        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
}


