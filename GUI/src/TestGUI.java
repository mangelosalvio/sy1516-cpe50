import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TestGUI {
	public static void main(String[] args) {
		final MyFirstFrame mainFrame= new MyFirstFrame();
		final MySecondFrame displayFrame = new MySecondFrame();
		
		mainFrame.saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				saveMethod(mainFrame, displayFrame);
			}
		});

		mainFrame.nameField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				if ( e.getKeyChar() == '\n' ) {
					saveMethod(mainFrame, displayFrame);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}
		});


		
		displayFrame.backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				backButtonMethod(mainFrame, displayFrame);
			}
		});

		displayFrame.backButton.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				backButtonMethod(mainFrame, displayFrame);
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}
		});
	}

	public static void saveMethod( MyFirstFrame mainFrame, MySecondFrame displayFrame )
	{
		mainFrame.setVisible(false);
		displayFrame.setVisible(true);
		String text = mainFrame.nameField.getText();
		displayFrame.displayLabel.setText("Your name is " + text);
		displayFrame.pack();
	}

	public static void backButtonMethod( MyFirstFrame mainFrame, MySecondFrame displayFrame )
	{
		mainFrame.setVisible(true);
		displayFrame.setVisible(false);
		mainFrame.nameField.setText("");
	}
}
