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

        // False: not being able to resize the window
        setResizable(true);
        // The pack() method is defined in Window class in Java
        // and it sizes the frame so that all its contents are at
        // or above their preferred sizes.
        pack();

        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // It posts an event (your Runnable)
        // at the end of Swings event list and
        // is processed after all previous GUI
        // events are processed.
        EventQueue.invokeLater(() -> {
            var ex = new Main();
            ex.setVisible(true);
        });
    }
}
