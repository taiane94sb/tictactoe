package br.com.taianesb.tictactoe.ui;

import java.util.Scanner;

public class UI {

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printTextWithNoNewLine(String text) {
        System.out.print(text);
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void printGameTitle() {
        printText("=================");
        printText("| JOGA DA VELHA |");
        printText("=================");
        printNewLine();
    }

    public static String readInput(String text) {
        printTextWithNoNewLine(text + " ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

}
