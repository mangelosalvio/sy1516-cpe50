import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MySecondFrame extends JFrame {
	JLabel displayLabel;
	JButton backButton;
	public MySecondFrame() {
		// TODO Auto-generated constructor stub		
		displayLabel = new JLabel("");
		backButton = new JButton("Back");
		
		this.setLayout(new FlowLayout());
		this.add(displayLabel);
		this.add(backButton);
		
		this.pack();
		this.setVisible(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
