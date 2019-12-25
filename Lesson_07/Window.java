package ru.geekbrains.java_one.lesson_07.online;

import com.sun.source.tree.UsesTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 605;
    private static final int WIN_POSY = 250;
    private final Map map;
    Window() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setResizable(false);
        setTitle("Tic Tac Toe");
        JButton btnStart = new JButton("<html><body><b>Start</></body></html>");
        JButton btnExit = new JButton("<html><body><b>Exit</></body></html>");
        JPanel panelBottom = new JPanel(new GridLayout(1, 2));
        map = new Map();
        Settings settings = new Settings(this);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        add(map, BorderLayout.CENTER);
        panelBottom.add(btnStart);
        panelBottom.add(btnExit);
        add(panelBottom, BorderLayout.NORTH);
        setVisible(true);
    }
    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLen) {
        map.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLen);
    }
}
