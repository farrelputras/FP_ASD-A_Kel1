/**
 * ES234317-Algorithm and Data Structures
 * Semester Ganjil, 2023/2024
 * Group Capstone Project
 * Group #1
 * 1 - 5026221035 - Mufidhatul Nafisa
 * 2 - 5026221120 - M. Shalahuddin Arif Laksono
 * 3 - 5026221102 - Fernandio Farrel Putra S.
 */

package TTTGraphicOOP;

import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 * The TTT_Tutorial.Cell class models each individual cell of the game board.
 */
public class Cell {
    // Define named constants for drawing
    public static final int SIZE = 120; // cell width/height (square)
    // Symbols (cross/nought) are displayed inside a cell, with padding from border
    public static final int PADDING = SIZE / 5;
    public static final int SEED_SIZE = SIZE - PADDING * 2;
    public static final int SEED_STROKE_WIDTH = 8; // pen's stroke width

    private BufferedImage crossImage;  // Gambar untuk ikon X
    private BufferedImage noughtImage; // Gambar untuk ikon O

    // Define properties (package-visible)
    /** Content of this cell (TTT_Tutorial.Seed.EMPTY, TTT_Tutorial.Seed.CROSS, or TTT_Tutorial.Seed.NOUGHT) */
    Seed content;
    /** Row and column of this cell */
    int row, col;

    /** Constructor to initialize this cell with the specified row and col */
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        content = Seed.NO_SEED;
        
        // Load gambar X dan O di sini (pastikan pathnya sesuai)
        try {
            crossImage = ImageIO.read(new File("treenatal.png"));
            noughtImage = ImageIO.read(new File("boxnatal.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Reset this cell's content to EMPTY, ready for new game */
    public void newGame() {
        content = Seed.NO_SEED;
    }

    /** Paint itself on the graphics canvas, given the Graphics context */
    public void paint(Graphics g) {
        int x1 = col * SIZE + PADDING;
        int y1 = row * SIZE + PADDING;

        if (content == Seed.CROSS) {
            g.drawImage(crossImage, x1, y1, SEED_SIZE, SEED_SIZE, null);
        } else if (content == Seed.NOUGHT) {
            g.drawImage(noughtImage, x1, y1, SEED_SIZE, SEED_SIZE, null);
        }
    }
}
