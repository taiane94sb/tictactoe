package br.com.taianesb.tictactoe;

import br.com.taianesb.tictactoe.core.Game;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Game game = new Game();

        game.play();
    }
}
