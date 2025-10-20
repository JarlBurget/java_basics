package week9.Ex17;

import week9.Ex17.logic.ApplicationLogic;
import week9.Ex17.ui.UserInterface;
import week9.Ex17.ui.TextUserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}