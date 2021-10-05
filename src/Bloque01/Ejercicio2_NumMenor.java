package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio2_NumMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str; 
		
		str = JOptionPane.showInputDialog("Introduce el primer número");
		float num1 = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el segundo número");
		float num2 = Float.parseFloat(str);
		
		if (num1 < num2) {
			System.out.println("El numero menor es " + num1);
		}
		else {
			System.out.println("El numero menor es " + num2);
		}
	}
		
		
		
	
}

