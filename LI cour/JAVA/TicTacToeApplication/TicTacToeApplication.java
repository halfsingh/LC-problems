package TicTacToeApplication;

import java.util.*;

public class TicTacToeApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doyouwanttoplay = true;
        while (doyouwanttoplay) {
            System.out.println("Welcome to Tic Tac Toe\n Pick your fighter\n");
            System.out.println();
            System.out.println("Enter a single character that will represent you");
            char playerToken = sc.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent");
            char opponentToken = sc.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            // set up the game\
            System.out.println();
            System.out.println(
                    "Now we can staret the game. Top play enter a number and your token shall be put in its place\n");

            System.out.println("The numbers go from 1-9 left to right \n");

            TicTacToe.printIndexBoard();
            System.out.println();

            while (game.gameover().equals("notover")) {
                if (game.currentMarker == game.userMarker) {

                    System.out.println("It is your turn! Enter a spot for your token");
                    int spot = sc.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again that spot is invalid");
                        spot = sc.nextInt();
                    }

                    System.out.println("You picked " + spot + "!");

                    // game.currentMarker = game.aimarker;
                } else {

                    System.out.println("It's my turn");

                    int aispot = ai.pickSpot(game);
                    game.playTurn(aispot);
                    System.out.println("I picked my spot!");

                }

                System.out.println();
                game.printBoard();
            }

            System.out.println(game.gameover());

            System.out.println();

            System.out.println("Do you want to play again?");

            System.out.println();
            System.out.println("Enter Y if you do, N if you don't");

            System.out.println();
            char response = sc.next().charAt(0);
            doyouwanttoplay = (response == 'Y');

            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}