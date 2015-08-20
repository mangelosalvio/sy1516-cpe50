import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.SpringLayout.Constraints;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;


public class FormApp extends JFrame {
	/**
	 * declare all components here...
	 */
	JLabel firstNameLabel, lastNameLabel, addressLabel;
	JTextField firstNameField, lastNameField;
	JTextArea addressField;
	JButton saveButton;
	StudentModel model;
	
	GridBagLayout layout;
	GridBagConstraints c;
	
	JTable studentTable;
	
	public FormApp() {
		// TODO Auto-generated constructor stub
		init();
		addComponents();			
		
		
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void init(){
		/**
		 * initialize your components
		 */
		firstNameLabel = new JLabel("First Name");
		firstNameField = new JTextField(10);
		
		lastNameLabel = new JLabel("Last Name");
		lastNameField = new JTextField(10);
		
		addressLabel = new JLabel("Address");
		addressField = new JTextArea(5,10);
		
		saveButton = new JButton("Add");
		
		/*String[][] data = {
				{ "Foo", "Bar" , "Bacolod" },
				{ "Foo", "Bar" , "Bacolod" },
				{ "Foo", "Bar" , "Bacolod" },
				{ "Foo", "Bar" , "Bacolod" },
		};
		String[] columns = { "First Name", "Last Name", "Address"};*/
		model = new StudentModel();
		studentTable = new JTable(model);
		
		layout = new GridBagLayout();
		c = new GridBagConstraints();		
		this.setLayout(layout);			
	}
	private void addComponents(){	
		c.insets  = new Insets(3, 3, 3, 3);
		c.gridx =  0;
		c.gridy = 0;
		this.add(firstNameLabel,c);
		
		c.gridx =  1;
		c.gridy = 0;
		this.add(firstNameField,c);
		
		c.gridx =  2;
		c.gridy = 0;
		this.add(lastNameLabel,c);
		
		c.gridx =  3;
		c.gridy = 0;
		this.add(lastNameField,c);
		
		c.gridx = 0;
		c.gridy = 1;
		this.add(addressLabel,c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 3;
		c.fill = GridBagConstraints.HORIZONTAL;
		this.add(new JScrollPane(addressField),c);
		
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.LINE_START;
		this.add(saveButton,c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 4;
		c.fill = GridBagConstraints.HORIZONTAL;
		this.add(new JScrollPane(studentTable), c);
		
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				model.getStudents().add(new Student(firstNameField.getText(), lastNameField.getText(), addressField.getText()));
				model.fireTableDataChanged();
				firstNameField.setText("");
				lastNameField.setText("");
				addressField.setText("");
			}
		});

	}
	
	public static void main(String[] args) {
		new FormApp();
	}
}
