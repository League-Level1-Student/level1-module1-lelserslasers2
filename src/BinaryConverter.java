import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {

	public static void main(String[] args) {
		JFrame fram = new JFrame();
		JPanel pane = new JPanel();
		JLabel labe = new JLabel();
		JTextField txtFel = new JTextField(20);
		JButton butto = new JButton();
		
		pane.add(labe);
		pane.add(txtFel);
		pane.add(butto);
		fram.add(pane);
		fram.pack();

	}

}
