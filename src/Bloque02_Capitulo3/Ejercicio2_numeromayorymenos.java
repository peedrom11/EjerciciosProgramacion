package Bloque02_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio2_numeromayorymenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mayor = 0, menor = 0;
		int val = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos valores se van a introducir: "));

		for (int i = 0; i < val; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));

			if (i == 0) {
				mayor = num;
				menor = num;
			} else {
				if (num > mayor) {
					mayor = num;
				}
				if (num < menor) {
					menor = num;
				}
			}

		}
		System.out.println("El número mayor de los introducidos es: " + mayor + " y el menor: " + menor);
		
	}

}
