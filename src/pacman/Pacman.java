package pacman;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Pacman extends JFrame{

	public Pacman() {
		add(new Model());
	}
	
	
	public static void main(String[] args) {
		Pacman pac = new Pacman();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(500 ,550);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		pac.setIconImage(new ImageIcon("src\\images\\logo.png").getImage());
		
	}
}