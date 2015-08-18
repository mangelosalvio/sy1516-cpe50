import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MyFirstFrame extends JFrame {
	
	public JLabel nameLabel;
	public JTextField nameField;
	public JButton saveButton;
	
	public MyFirstFrame() {
		// TODO Auto-generated constructor stub
		init();
		addComponents();
		
		this.setVisible(true);
		this.pack();
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
	}
	
	private void init(){		
		this.nameLabel = new JLabel("Name");		
		this.nameField = new JTextField(10);
		this.saveButton = new JButton("Save");
	}
	
	private void addComponents(){
		this.setLayout(new FlowLayout());
		this.add(nameLabel);
		this.add(nameField);
		this.add(saveButton);
	}
}
