package ru.geekbrains.java_one.lesson_07.online;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {
    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 270;
    private final Window window;
    private JRadioButton jrbHumVsAi;
    private JRadioButton jrbHumVsHum;
    private JSlider jsFieldSize;
    private JSlider jsWinLenght;
    private static final String FIELD_SIZE_PREFIX = "Field size is: ";
    private static final String WIN_LENGHT_PREFIX = "Winning lenght is: ";
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final int MIN_WIN_LENGHT = 3;

    Settings(Window window) {
        this.window = window;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle windowBounds = window.getBounds();
        int posX = (int) windowBounds.getCenterX() - WINDOW_WIDTH / 2;
        int posY = (int) windowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);
        setTitle("Create a new game");
        setLayout(new GridLayout(10, 1));
        addModeControls();
        addFieldControls();
        JButton btnStartGame = new JButton("Start a game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onBtnStartGameClick();
            }
        });
        add(btnStartGame);
    }
    private void addModeControls() {
        add(new JLabel("Choose game mode"));
        jrbHumVsAi = new JRadioButton("Human vs. AI", true);
        jrbHumVsHum = new JRadioButton("Human vs. HUman");
        ButtonGroup grpMode = new ButtonGroup();
        grpMode.add(jrbHumVsAi);
        grpMode.add(jrbHumVsHum);

        add(jrbHumVsAi);
        add(jrbHumVsHum);
    }

    private void addFieldControls() {
        JLabel jlFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        JLabel jlWinLenght = new JLabel(WIN_LENGHT_PREFIX + MIN_WIN_LENGHT);
        jsFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        jsWinLenght = new JSlider(MIN_WIN_LENGHT, MIN_FIELD_SIZE, MIN_FIELD_SIZE);

        jsFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = jsFieldSize.getValue();
                jlFieldSize.setText(FIELD_SIZE_PREFIX + currentValue);
                jsWinLenght.setMaximum(currentValue);
            }
        });
        jsWinLenght.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jlWinLenght.setText(WIN_LENGHT_PREFIX + jsWinLenght.getValue());
            }
        });

        add(new JLabel("Choose field size"));
        add(jlFieldSize);
        add(jsFieldSize);
        add(new JLabel("Choose winnig lenght"));
        add(jlWinLenght);
        add(jsWinLenght);

    }

    private void onBtnStartGameClick() {
        int gameMode = 0;
        if (jrbHumVsHum.isSelected()) {
            gameMode = Map.MODE_HVH;
        } else if (jrbHumVsAi.isSelected()) {
                gameMode = Map.MODE_HVA;
        }
        int fieldSize = jsFieldSize.getValue();
        int winLenght = jsWinLenght.getValue();
        window.startNewGame(gameMode, fieldSize, fieldSize, winLenght);
        //setVisible(false);
    }
}
