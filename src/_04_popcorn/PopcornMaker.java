package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		String flavour = JOptionPane.showInputDialog("enter flavour for opocorn: ");
		Popcorn pop = new Popcorn(flavour);
		int timeToBeCooked = Integer.parseInt(JOptionPane.showInputDialog("enter time to be coooked: "));
		Microwave wave = new Microwave();
		wave.putInMicrowave(pop);
		wave.setTime(timeToBeCooked);
		wave.startMicrowave();

	}

}
