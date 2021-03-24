package be.kuleuven.groept;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        initUI();
    }

    private void initUI() {
        JLabel statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);

        add(new Board(statusbar));

        //False: Not being able to resize the window
        setResizable(false);
        pack();

        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new Main();
            ex.setVisible(true);
        });
    }
}
