package Bloque3_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio3_TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));
		if (num != 0) {
			for (int i = 0; i < 11; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			
		}
	
		
	}

}
