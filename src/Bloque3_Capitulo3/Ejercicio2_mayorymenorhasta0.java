package Bloque3_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio2_mayorymenorhasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int mayor = 0;
	
		do {
	
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));	
		
		if (num > mayor) {
			
			mayor = num;
			
		}

				
		} while (num!=0);
		
		System.out.println("El numero mayor es " +mayor);
		
	}

}
