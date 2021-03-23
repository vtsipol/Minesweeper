import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.*;

public class Board extends JPanel {

    private final int NUM_IMAGES = 13;
    private final int CELL_SIZE = 15;

    private final int COVER_FOR_CELL = 10;
    private final int MARK_FOR_CELL = 10;
    private final int EMPTY_CELL = 0;
    private final int MINE_CELL = 9;

    private final int COVERED_MINE_CELL = MINE_CELL + COVER_FOR_CELL;
    private final int MARKED_MINE_CELL = COVERED_MINE_CELL + MARK_FOR_CELL;

    private final int DRAW_MINE = 9;
    private final int DRAW_COVER = 10;
    private final int DRAW_MARK = 11;
    private final int DRAW_WRONG_MARK = 12;

    //Beginner = 8x8 (10 mines), Intermediate = 16x16 (40 mines), Expert = 16x30 (99 mines)
    private final int N_MINES = 40;
    private final int N_ROWS = 16;
    private final int N_COLS = 16;

    //Width + height of board
    private final int BOARD_WIDTH = N_COLS * CELL_SIZE + 1;
    private final int BOARD_HEIGHT = N_ROWS * CELL_SIZE + 1;

    private int[] field;
    private boolean inGame;
    private int minesLeft;
    private Image[] img;

    private int allCells;
    private final JLabel statusbar;

    public Board(JLabel statubar) {
        this.statusbar = statubar;
        initBoard();
    }

    private initBoard() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        img = new Image[NUM_IMAGES];

        for (int i = 0; i < NUM_IMAGES; i++) {
            var path = 'src/resources/' + i + '.png';
            img[i] = (new ImageIcon(path).getImage());
        }
        addMouseListener(new MinesAdapter());
        newGame();
    })

    private void newGame () {
        int cell;
        var random = new Random();
        inGame = true;
        minesLeft = N_MINES;
        allCells = N_ROWS * N_COLS;
        field = new int[allCells];

        for (int i = 0; i < allCells; i++) {
            field[i] = COVER_FOR_CELL;
        }

        statusbar.setText(Integer.toString(minesLeft));

        int i = 0;
        while (i < N_MINES) {
            int position = (int) (allCells * random.nextDouble());
            if ((position < allCells) && (field[position] != COVERED_MINE_CELL)) {
                int current_col = position % N_COLS;
                field[position] = COVERED_MINE_CELL;
                i++;
            }
    }

    private void find_empty_cells(int j) {
        //to be added
    }

    @Override
    public void paintComponent(Graphics g) {
        //to be added
    }

    private class MinesAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            //to be added
        }
    }
}
























}
