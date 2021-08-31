package br.com.taianesb.tictactoe.core;

import br.com.taianesb.tictactoe.Constants;
import br.com.taianesb.tictactoe.ui.UI;

public class Game {

    private Board board = new Board();
    private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
    private int currentPlayerIndex = -1;

    public void play() {
        UI.printGameTitle();

        for (int i = 0; i < players.length; i++) {
            players[i] = createPlayer(i);
        }

        boolean gameEnded = false;
        Player currentPlayer = nextPlayer();
        Player winner = null;

        while (!gameEnded) {
            board.print();

            boolean sequenceFound = currentPlayer.play();

            if(sequenceFound) {
                gameEnded = true;
                winner = currentPlayer;
            } else if(board.isFull()) {
                gameEnded = true;
            } else {
                currentPlayer = nextPlayer();
            }
        }

        if(winner == null) {
            UI.printText("O jogo terminou empatado!");
        } else {
            UI.printText("O jogador '" + winner.getName() + "' venceu o jogo!");
        }

        board.print();
        UI.printText("Fim de jogo!");
    }

    public Player createPlayer(int index) {
        String name = UI.readInput("Jogador " + (index + 1) + " = > ");
        char symbol = Constants.SYMBOL_PLAYERS[index];
        Player player = new Player(name, board, symbol);

        UI.printText("O jogador + '" + name + "' vai usar o símbolo '" + symbol + "'");

        return player;
    }

    private Player nextPlayer() {
        /* Outra forma de trazer o próximo jogador
        currentPlayerIndex++;

        if(currentPlayerIndex >= players.length) {
            currentPlayerIndex = 0;
        }

        return players[currentPlayerIndex];
         */

        currentPlayerIndex = ((currentPlayerIndex + 1) % players.length);
        return players[currentPlayerIndex];
    }
}
