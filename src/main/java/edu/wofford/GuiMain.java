package edu.wofford;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;

public class GuiMain extends JFrame implements ActionListener {
    private JLabel result;
    JButton[][] buttons = new JButton[3][3];
    boolean xTurn;
    boolean gameEnd;
    int count;

    private void checkEnd(int x, int y) {
        if (!xTurn) {
            //X win start
            //X horizontal
            for (int i = 0; i <= 2; i++) {
                if (!Objects.equals(buttons[x][i].getText(), "X")) {
                    break;
                }
                if (i == 2) {
                    gameEnd = true;
                    result.setText("X Wins");
                    return;
                }
            }
            //X Vertical
            for (int i = 0; i <= 2; i++) {
                if (!Objects.equals(buttons[i][y].getText(), "X")) {
                    break;
                }
                if (i == 2) {
                    gameEnd = true;
                    result.setText("X Wins");
                    return;
                }
            }
            //X Diagonal
            if (x == y) {
                for (int i = 0; i <= 2; i++) {
                    if (!Objects.equals(buttons[i][i].getText(), "X")) {
                        break;
                    }
                    if (i == 2) {
                        gameEnd = true;
                        result.setText("X Wins");
                        return;
                    }
                }
            }
            //X other Diagonal
            if (x + y == 2) {
                for (int i = 0; i <= 2; i++) {
                    if (!Objects.equals(buttons[i][2 - i].getText(), "X")) {
                        break;
                    }
                    if (i == 2) {
                        gameEnd = true;
                        result.setText("X Wins");
                        return;
                    }
                }
            }
            //Tie check
            if (count == 9) {
                gameEnd = true;
                result.setText("Tie");
            }
            //X win end
        } else if (xTurn) {
            //O win start
            //O horizontal
            for (int i = 0; i <= 2; i++) {
                if (!Objects.equals(buttons[x][i].getText(), "O")) {
                    break;
                }
                if (i == 2) {
                    gameEnd = true;
                    result.setText("O Wins");
                    return;
                }
            }
            //O Vertical
            for (int i = 0; i <= 2; i++) {
                if (!Objects.equals(buttons[i][y].getText(), "O")) {
                    break;
                }
                if (i == 2) {
                    gameEnd = true;
                    result.setText("O Wins");
                    return;
                }
            }
            //O Diagonal
            if (x == y) {
                for (int i = 0; i <= 2; i++) {
                    if (!Objects.equals(buttons[i][i].getText(), "O")) {
                        break;
                    }
                    if (i == 2) {
                        gameEnd = true;
                        result.setText("O Wins");
                        return;
                    }
                }
            }
            //O other Diagonal
            if (x + y == 2) {
                for (int i = 0; i <= 2; i++) {
                    if (!Objects.equals(buttons[i][2 - i].getText(), "O")) {
                        break;
                    }
                    if (i == 2) {
                        gameEnd = true;
                        result.setText("O Wins");
                        return;
                    }
                }
            }
            //Tie check
            if (count == 9) {
                gameEnd = true;
                result.setText("Tie");
            }
            //O win end
        }
    }

    private void setX(JButton b, int x, int y) {
        if (b.getText().equals("") && !gameEnd) {
            b.setText("X");
            xTurn = false;
            count++;
        }
        checkEnd(x, y);
    }
    private void setO(JButton b, int x, int y) {
        if (b.getText().equals("") && !gameEnd) {
            b.setText("O");
            xTurn = true;
            count++;
        }
        checkEnd(x, y);
    }

    public void actionPerformed(ActionEvent event) {
        if (xTurn) {
            if (event.getSource() == buttons[0][0]) {
                int x = 0;
                int y = 0;
                setX((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[0][1]) {
                int x = 0;
                int y = 1;
                setX((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[0][2]) {
                int x = 0;
                int y = 2;
                setX((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[1][0]) {
                int x = 1;
                int y = 0;
                setX((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[1][1]) {
                int x = 1;
                int y = 1;
                setX((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[1][2]) {
                int x = 1;
                int y = 2;
                setX((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[2][0]) {
                int x = 2;
                int y = 0;
                setX((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[2][1]) {
                int x = 2;
                int y = 1;
                setX((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[2][2]) {
                int x = 2;
                int y = 2;
                setX((JButton)event.getSource(), x, y);
            }
        } else {
            if (event.getSource() == buttons[0][0]) {
                int x = 0;
                int y = 0;
                setO((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[0][1]) {
                int x = 0;
                int y = 1;
                setO((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[0][2]) {
                int x = 0;
                int y = 2;
                setO((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[1][0]) {
                int x = 1;
                int y = 0;
                setO((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[1][1]) {
                int x = 1;
                int y = 1;
                setO((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[1][2]) {
                int x = 1;
                int y = 2;
                setO((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[2][0]) {
                int x = 2;
                int y = 0;
                setO((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[2][1]) {
                int x = 2;
                int y = 1;
                setO((JButton)event.getSource(), x, y);
            } else if (event.getSource() == buttons[2][2]) {
                int x = 2;
                int y = 2;
                setO((JButton)event.getSource(), x, y);
            }
        }
    }

    public GuiMain() {
        count = 0;
        xTurn = true;
        gameEnd = false;
        setLayout(new BorderLayout());
        setTitle("Tic Tac Toe");
        result = new JLabel();
        result.setName("result");
        result.setPreferredSize(new Dimension(300, 100));
        result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setVerticalAlignment(SwingConstants.CENTER);
        add(result, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));
        for (int k = 0; k <= 2; k++) {
            for (int i = 0; i <= 2; i++) {
                buttons[k][i] = new JButton();
                buttons[k][i].setName("location" + String.valueOf(k) + String.valueOf(i));
                buttons[k][i].setPreferredSize(new Dimension(100, 100));
                buttons[k][i].addActionListener(this);
                buttonPanel.add(buttons[k][i]);
            }
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        GuiMain window = new GuiMain();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 500);
    }
}
