import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIUniqueChar extends JFrame {

	private Container contentPane;

	private JLabel labelObj;
	private JTextField textFieldObj;
	private JButton buttonObj;
	private JLabel labelOutPut;
	private UniqueChar uniqueChar;

	public GUIUniqueChar() {
		super("Unique Charachter");

		setSize(160, 200);

		contentPane = getContentPane();
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.BLUE);
		contentPane.add(mainPanel);

		labelObj = new JLabel("Enter your word");
		labelObj.setFont(new Font("Enter your word", Font.ITALIC, 18));
		mainPanel.add(labelObj);

		textFieldObj = new JTextField(8);
		mainPanel.add(textFieldObj);

		buttonObj = new JButton("Am I Unique?");
		buttonObj.addActionListener(new ButtonListener());
		mainPanel.add(buttonObj);

		labelOutPut = new JLabel();
		labelOutPut.setFont(new Font("", Font.ITALIC, 30));
		mainPanel.add(labelOutPut);

		uniqueChar = new UniqueChar();

		/*
		 * ??for EACH GUI component: a) construct the component, b)customize it, if
		 * necessary, c) add it to the main panel d) add a listener, if necessary
		 */

		/* ??? Initialize any other object or primitive variables you declare */
	}

	/*
	 * Listener classes this is a shell that can be copied as many times as needed.
	 * you will need to change the class name for each class
	 */

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String s = textFieldObj.getText();
			boolean test = uniqueChar.uniqueChar256(s);
			if (!test) {
				labelOutPut.setForeground(Color.red);

			}
			String str = String.valueOf(test);

			labelOutPut.setText(str);
		}
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				// create an object of your class
				GUIUniqueChar frame = new GUIUniqueChar();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}
