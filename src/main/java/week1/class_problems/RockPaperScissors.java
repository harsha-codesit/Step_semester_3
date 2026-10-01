package week1.class_problems;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove))
            return "Draw";

        if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
            (playerMove.equals("paper") && computerMove.equals("rock")) ||
            (playerMove.equals("scissors") && computerMove.equals("paper")))
            return "Win";

        return "Loss";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"rock", "paper", "scissors"};

        int wins = 0, losses = 0, draws = 0;
        int rounds = 5;

        for (int i = 1; i <= rounds; i++) {

            System.out.print("Enter rock, paper or scissors: ");
            String player = sc.nextLine().toLowerCase();

            String computer = moves[random.nextInt(3)];

            String result = playRound(player, computer);

            System.out.println("Computer: " + computer);
            System.out.println("Result: " + result);

            if (result.equals("Win"))
                wins++;
            else if (result.equals("Loss"))
                losses++;
            else
                draws++;
        }

        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("\n--- Summary ---");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage: %.2f%%\n", winPercentage);

        sc.close();
    }
}