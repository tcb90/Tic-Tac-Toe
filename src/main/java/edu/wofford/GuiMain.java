import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class GuiMain extends JFrame implements ActionListener {
    private JLabel result;
    private JButton location00;
    private JButton location01;
    private JButton location02;
    private JButton location10;
    private JButton location11;
    private JButton location12;
    private JButton location20;
    private JButton location21;
    private JButton location22;
    boolean xTurn;

    public void actionPerformed(ActionEvent event) {
        if (xTurn) {
            if (event.getSource() == location00) {
                location00.setText("X");
                xTurn = false;
            } else if (event.getSource() == location01) {
                location01.setText("X");
                xTurn = false;
            } else if (event.getSource() == location02) {
                location02.setText("X");
                xTurn = false;
            } else if (event.getSource() == location10) {
                location10.setText("X");
                xTurn = false;
            } else if (event.getSource() == location11) {
                location11.setText("X");
                xTurn = false;
            } else if (event.getSource() == location12) {
                location12.setText("X");
                xTurn = false;
            } else if (event.getSource() == location20) {
                location20.setText("X");
                xTurn = false;
            } else if (event.getSource() == location21) {
                location21.setText("X");
                xTurn = false;
            } else if (event.getSource() == location22) {
                location22.setText("X");
                xTurn = false;
            }
        } else {
            if (event.getSource() == location00) {
                location00.setText("O");
                xTurn = true;
            } else if (event.getSource() == location01) {
                location01.setText("O");
                xTurn = true;
            } else if (event.getSource() == location02) {
                location02.setText("O");
                xTurn = true;
            } else if (event.getSource() == location10) {
                location10.setText("O");
                xTurn = true;
            } else if (event.getSource() == location11) {
                location11.setText("O");
                xTurn = true;
            } else if (event.getSource() == location12) {
                location12.setText("O");
                xTurn = true;
            } else if (event.getSource() == location20) {
                location20.setText("O");
                xTurn = true;
            } else if (event.getSource() == location21) {
                location21.setText("O");
                xTurn = true;
            } else if (event.getSource() == location22) {
                location22.setText("O");
                xTurn = true;
            }
        }
    }

    public GuiMain() {
        xTurn = true;
        setLayout(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        setTitle("Tic Tac Toe");
        result = new JLabel();
        result.setName("result");
        result.setPreferredSize(new Dimension(300, 100));
        result.setVerticalAlignment(SwingConstants.CENTER);
        result.setBorder(border);
        add(result, BorderLayout.NORTH);
        location00 = new JButton();
        location00.setName("location00");
        location00.setPreferredSize(new Dimension(100, 100));
        location00.addActionListener(this);
        location01 = new JButton();
        location01.setName("location01");
        location01.setPreferredSize(new Dimension(100, 100));
        location01.addActionListener(this);
        location02 = new JButton();
        location02.setName("location02");
        location02.setPreferredSize(new Dimension(100, 100));
        location02.addActionListener(this);
        location10 = new JButton();
        location10.setName("location10");
        location10.setPreferredSize(new Dimension(100, 100));
        location10.addActionListener(this);
        location11 = new JButton();
        location11.setName("location11");
        location11.setPreferredSize(new Dimension(100, 100));
        location11.addActionListener(this);
        location12 = new JButton();
        location12.setName("location12");
        location12.setPreferredSize(new Dimension(100, 100));
        location12.addActionListener(this);
        location20 = new JButton();
        location20.setName("location20");
        location20.setPreferredSize(new Dimension(100, 100));
        location20.addActionListener(this);
        location21 = new JButton();
        location21.setName("location21");
        location21.setPreferredSize(new Dimension(100, 100));
        location21.addActionListener(this);
        location22 = new JButton();
        location22.setName("location22");
        location22.setPreferredSize(new Dimension(100, 100));
        location22.addActionListener(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.add(location00);
        buttonPanel.add(location01);
        buttonPanel.add(location02);
        buttonPanel.add(location10);
        buttonPanel.add(location11);
        buttonPanel.add(location12);
        buttonPanel.add(location20);
        buttonPanel.add(location21);
        buttonPanel.add(location22);
        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        GuiMain window = new GuiMain();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 500);
    }
}
