package Bloque02_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio3_multiploshasta100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor el cual se calcularan sus multiplos hasta el 100"));
		for (int i = 0; i < 100; i++) {
			if (i % var == 0) {
				System.out.println(i);
			}
		}
		
	}

}
