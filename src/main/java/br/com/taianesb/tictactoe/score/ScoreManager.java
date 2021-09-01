package br.com.taianesb.tictactoe.score;

import br.com.taianesb.tictactoe.core.Player;

import java.io.IOException;

public interface ScoreManager {

    public Integer getScore(Player player);

    public void saveScore(Player player) throws IOException;
}
