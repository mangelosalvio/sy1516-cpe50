import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BasicCalcApp extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
	JTextField field;
	
	public BasicCalcApp(){

		init();

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(4, 3,2,2));
		buttonsPanel.add(b1);
		buttonsPanel.add(b2);
		buttonsPanel.add(b3);
		buttonsPanel.add(b4);
		buttonsPanel.add(b5);
		buttonsPanel.add(b6);
		buttonsPanel.add(b7);
		buttonsPanel.add(b8);
		buttonsPanel.add(b9);
		buttonsPanel.add(new JPanel());
		buttonsPanel.add(new JButton("."));
		buttonsPanel.add(b0);

		buttonsPanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 2));
		this.setLayout(new BorderLayout());
		this.add(buttonsPanel, BorderLayout.CENTER);
		this.add(field, BorderLayout.NORTH);
		
		JPanel operationsPanel = new JPanel();
		operationsPanel.setLayout(new GridLayout(4,1,2,2));
		operationsPanel.add(new JButton("+"));
		operationsPanel.add(new JButton("-"));
		operationsPanel.add(new JButton("/"));
		operationsPanel.add(new JButton("x"));
		operationsPanel.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 8));
		
		
		
		this.add(operationsPanel, BorderLayout.EAST);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	private void init(){
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		field = new JTextField(10);
		field.setHorizontalAlignment(SwingConstants.RIGHT);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		field.setText(field.getText()+ ((JButton)arg0.getSource()).getText() ) ;
	}
	
	public static void main(String[] args) {
		new BasicCalcApp();
	}


	
}
