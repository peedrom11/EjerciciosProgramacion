package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio4_NumMenorDe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str; 
		
		str = JOptionPane.showInputDialog("Introduce el segundo n�mero");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el segundo n�mero");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el tercer n�mero");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el cuarto n�mero");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el quinto n�mero");
		int num5 = Integer.parseInt(str);
		
		
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("El n�mero menor es: " + num1);
		}

		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("El n�mero menor es: " + num2);
		}

		if (num3 < num2 && num3 < num1 && num3 < num4 && num3 < num5) {
			System.out.println("El n�mero menor es: " + num3);
		}

		if (num4 < num2 && num4 < num3 && num4 < num1 && num4 < num5) {
			System.out.println("El n�mero menor es: " + num4);
		}

		if (num5 < num2 && num5 < num3 && num5 < num4 && num5 < num1) {
			System.out.println("El n�mero menor es: " + num5);
		}
	}

}
