package Bloque01_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio01_SumNumMayor10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;
		
		for (int i = 0; i < 4; i++) {
			
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
			
			if (num > 10) {
				
				suma += num;
		
				System.out.println(suma);
			}
			
		}
		
	}

}
