package Bloque02_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio4_multiplosconlimitesusuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce un maximo: "));
		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor el cual se calcularan sus multiplos hasta el " + max));
		
		for (int i = 0; i < max; i++) {
			if (i % var == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
	}

}
