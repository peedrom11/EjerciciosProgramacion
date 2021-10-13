package Bloque02_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio1_MediaNumeroIntroducidos {

	public static void main(String[] args) {


		int var;
		var = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos valores se van a introducir: "));
		int total = 0;
		for (int i = 0; i < var; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor "));
			total += num;
	
	}

		System.out.println("La media de los números introducidos es: " + total / var);
}
}