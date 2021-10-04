package edu.wofford;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


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
	
	public void actionPerformed(ActionEvent event) {

	}
    
	public GuiMain() {
	    setTitle("Tic Tac Toe");
	    result = new JLabel();
	    result.setName("result");
	    location00 = new JButton();
	    location00.setName("location00");
	    location01 = new JButton();
	    location01.setName("location01");
	    location02 = new JButton();
	    location02.setName("location02");
	    location10 = new JButton();
	    location10.setName("location10");
	    location11 = new JButton();
	    location11.setName("location11");
	    location12 = new JButton();
	    location12.setName("location12");
	    location20 = new JButton();
	    location20.setName("location20");
	    location21 = new JButton();
	    location21.setName("location21");
	    location22 = new JButton();
	    location22.setName("location22");
	}
	
	public static void main(String[] args) {
		GuiMain window = new GuiMain();
		window.setVisible(true);
	}
}
