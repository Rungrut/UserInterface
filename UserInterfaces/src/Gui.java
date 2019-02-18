import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
	
	JLabel la1, la2, la3;
	JTextField t1, t2;
	JCheckBox ch1;
	JButton b1,b2,b3;
	JRadioButton rb1;
	
	public static void main(String[] args) {
		
		Gui frame = new Gui();
		frame.setVisible(true);
				
	}
public Gui() {
	
	// Window
	setLayout(null);
	setSize(800, 600);
	setTitle("User Interfaces");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setLocationRelativeTo(null);
	
	// First Label
	la1 = new JLabel("Name of Application...");
	la1.setOpaque(true);
	la1.setFont(new Font("Serif", Font.BOLD, 25));
	la1.setBounds(100, 10, 400, 30);
	la1.setForeground(Color.BLACK);
	add(la1);
	
	// First TextBox 
	t1 = new JTextField("");
	t1.setBounds(200, 70, 400, 20);
	add(t1);
	
	// Second Label
	la2 = new JLabel("Search File :");
	la2.setOpaque(true);
	la2.setFont(new Font("Serif", Font.PLAIN, 18));
	la2.setBounds(100, 62, 100, 30);
	la2.setForeground(Color.BLACK);
	add(la2);
	
	// Search Button
	b1 = new JButton("Search");
	b1.setBounds(150, 120, 100, 20);
	add(b1);
	
	rb1 = new JRadioButton("");
	
	//About Button
	b2 = new JButton("About us");
	b2.setBounds(300, 120, 100, 20);
	add(b2);
	b2.addActionListener(new Action());
	
	// Maintenance Button
	b3 = new JButton("Maintenance");
	b3.setBounds(450, 120, 130, 20);
	add(b3);
	b3.addActionListener(new action2());
	
}
	
}
