
package ship;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class main {
	private static funcionalty functionality = new funcionalty();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Place your ships on the left");
        System.out.println("Strike your enemies on the right");
        int[][] larray = new int[10][10];
        int[][] rarray = new int[10][10];
        gui(sc, larray, rarray);
    }

    // Window 1
    private static void gui(Scanner scanner, int[][] larray, int[][] rarray) {
        JFrame frame = new JFrame("Window Start");
        JButton button = new JButton("START");
        frame.setLayout(null);

        // Background of window 1
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("C:/Users/DanielMorenoAlonso/Desktop/img.jpg");

        JLabel background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 200, 1920, 780);
        frame.setSize(1920, 780);
        frame.add(background);
        frame.setLocationRelativeTo(null);

        // Start button
        button.setBounds(700, 200, 500, 200);
        button.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(button);

        // Function of the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openNewWindow(scanner, larray, rarray);
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    // Window 2
    private static void openNewWindow(Scanner scanner, int[][] larray, int[][] rarray) {
        JFrame newFrame = new JFrame("Window 2");
        newFrame.setSize(1920, 780);

        // Create a panel to hold components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2, 10, 0)); // Set layout to 1 row, 2 columns with horizontal gap

        // Create grids (each with a size of 11x11 to accommodate row and column labels)
        JPanel gridPanel1 = createGridPanel(true, scanner.nextInt(), scanner.nextInt());
        JPanel gridPanel2 = createGridPanel(false, 0, 0);

        mainPanel.add(gridPanel1);
        mainPanel.add(gridPanel2);

        // Add an empty border with top and right gap to gridPanel1
        gridPanel1.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(25, 0, 0, 50),
                BorderFactory.createEmptyBorder(50, 0, 0, 50)
        ));

        // Add an empty border with top and left gap to gridPanel2
        gridPanel2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(25, 5, 0, 0),
                BorderFactory.createEmptyBorder(50, 0, 0, 50)
        ));

        newFrame.add(mainPanel);
        newFrame.setLocationRelativeTo(null);
        newFrame.setVisible(true);
    }

    private static void ships() {
        // Assuming this method is meant to draw ships or handle ship-related functionality
    }

    private static JPanel createGridPanel(boolean isFirstGrid, int s1a, int s1b) {
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(11, 11));

        // Add row and column labels to the gridPanel
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == 0 && j == 0) {
                    JLabel emptyLabel = new JLabel();
                    gridPanel.add(emptyLabel);
                } else if (i == 0) {
                    JLabel label = new JLabel(String.valueOf(j), SwingConstants.CENTER);
                    gridPanel.add(label);
                } else if (j == 0) {
                    JLabel label = new JLabel(String.valueOf((char) ('1' + i - 1)), SwingConstants.CENTER);
                    gridPanel.add(label);
                } else {
                    JLabel cellLabel = new JLabel();
                    cellLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                    // Add a red square at the specified position for the first grid
                    if (isFirstGrid && i == s1a && j == s1b) {
                        cellLabel.setBackground(Color.RED);
                        cellLabel.setOpaque(true);
                    }
                    if (isFirstGrid && i == 2 && j == 1) {
                        cellLabel.setBackground(Color.RED);
                        cellLabel.setOpaque(true);
                    }

                    gridPanel.add(cellLabel);
                }
            }
        }

        return gridPanel;
    }
}
