package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio1_NumMayor {

	public static void main(String[] args) {

		String str; 
		
		str = JOptionPane.showInputDialog("Introduce el primer número");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el segundo número");
		int num2 = Integer.parseInt(str);
		
		if (num1 > num2) {
			System.out.println("El numero mayor es " + num1);
		}
		else {
			System.out.println("El numero mayor es " + num2);
		}
	}
}
