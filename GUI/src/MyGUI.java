import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MyGUI {
	public JFrame frame;
	public JLabel nameLabel;
	public JTextField nameField;
	public JButton saveButton;
	
	public JFrame frame2;
	public JLabel frameLabel;
	public JButton backButton;
	
	public MyGUI(){
		//Instantiate all components
		initFrame1();
		initFrame2();
	}
	
	private void initFrame1(){
		this.frame = new JFrame();
		this.nameLabel = new JLabel("Name");
		
		this.nameField = new JTextField(10);
		this.saveButton = new JButton("Save");
		
		this.frame.setLayout(new FlowLayout());
		this.frame.add(nameLabel);
		this.frame.add(nameField);
		this.frame.add(saveButton);
		
		this.frame.setVisible(true);
		//this.frame.setSize(300,80);
		this.frame.pack();
		this.frame.setResizable(false);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.nameField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				if (arg0.getKeyChar() == '\n' ){
					saveMethod();
				}
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saveMethod();
			}
		});
	}
	
	private void initFrame2(){
		this.frame2 = new JFrame();
		this.frameLabel = new JLabel();
		this.backButton = new JButton("Back");
		
		frame2.setLayout(new FlowLayout());
		frame2.add(frameLabel);
		frame2.add(backButton);
		
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame2.setVisible(false);
				frame.setVisible(true);
				nameField.setText("");
			}
		});
	}
	private void saveMethod(){
		frame.setVisible(false);
		frame2.setVisible(true);
		frameLabel.setText("Your name is " + nameField.getText());
		frame2.pack();
	}

}
