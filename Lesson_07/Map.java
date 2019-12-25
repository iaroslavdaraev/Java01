package ru.geekbrains.java_one.lesson_07.online;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;
    Map() {
        setBackground(Color.GREEN);
    }
    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLenght) {
        System.out.printf("mode = %d\nfsX = %d\nwin = %d", gameMode, fieldSizeX, winLenght);
    }
}
