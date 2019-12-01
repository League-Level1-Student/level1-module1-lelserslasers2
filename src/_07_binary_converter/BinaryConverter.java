package _07_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryConverter implements ActionListener{
	JTextField txtFil = new JTextField(20);
	JLabel labe = new JLabel();
	JFrame frame = new JFrame();
	JPanel pane = new JPanel();
	JButton butto = new JButton();
	public void run() {
	
		butto.setText("Convert");
		frame.setVisible(true);
		pane.add(txtFil);
		pane.add(butto);
		labe.setText("Output");
		pane.add(labe);
		frame.add(pane);
		frame.pack();
		
		butto.addActionListener(this);
		

		
	}
	
	public void actionPerformed(ActionEvent e) {
		labe.setText(convert(txtFil.getText()));
		frame.pack();
		
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             
             return String.valueOf(asciiValue);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
}


