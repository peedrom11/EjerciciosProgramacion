package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio6_ParEimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		int num1;
		int resto;
		
		str = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(str);
		resto = num1 % 2;

		if (resto == 0) {
			System.out.println("El número es par");
		} 
		
		else {
			System.out.println("El número es impar");
		}
		
	}

}
