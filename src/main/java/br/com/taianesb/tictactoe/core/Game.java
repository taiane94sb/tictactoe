package br.com.taianesb.tictactoe.core;

import br.com.taianesb.tictactoe.Constants;
import br.com.taianesb.tictactoe.ui.UI;

public class Game {

    Board board = new Board();
    Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];

    public void play() {
//        System.out.println("Jogando...");
        UI.printGameTitle();

        UI.readInput("Nome do Jogador: ");
    }
}
