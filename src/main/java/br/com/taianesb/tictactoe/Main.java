package br.com.taianesb.tictactoe;

import br.com.taianesb.tictactoe.core.Game;

public class Main {

    public static void main(String[] args) {
        System.out.println("Jogo da Velha");

        Game game = new Game();
        game.play();
    }
}
