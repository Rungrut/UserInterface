import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class action2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		window.setTitle("Maintenance");
		window.setVisible(true);
		window.setLayout(null);
		window.setSize(600, 400);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		JLabel name = new JLabel("The name of files :");
		name.setOpaque(true);
		name.setFont(new Font("Serif", Font.BOLD, 20));
		name.setBounds(50, 10, 200, 30);
		name.setForeground(Color.BLACK);
		window.add(name);
		
		JTextField field = new JTextField(" ");
		field.setBounds(250, 20, 300, 300);
		window.add(field);
		
		JButton b1 = new JButton("Adding"); 
		b1.setBounds(60, 50, 100, 20);
		window.add(b1);
		
		JButton b2 = new JButton("Removing"); 
		b2.setBounds(60, 80, 100, 20);
		window.add(b2);
		
		JButton b3 = new JButton("Updating"); 
		b3.setBounds(60, 110, 100, 20);
		window.add(b3);
	}

}
