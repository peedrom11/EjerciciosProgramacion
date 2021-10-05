package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio5_NumMayorYmenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str; 
	
		str = JOptionPane.showInputDialog("Introduce el primer número");
		int num1 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el segundo número");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el tercer número");
		int num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el cuarto número");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el quinto número");
		int num5 = Integer.parseInt(str);
		
		
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
					System.out.println("El número mayor es: " + num1);
			}

			if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
					System.out.println("El número mayor es: " + num2);
			}

			if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5) {
					System.out.println("El número mayor es: " + num3);
			}

			if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5) {
					System.out.println("El número mayor es: " + num4);
			}

			if (num5 > num2 && num5 > num3 && num5 > num4 && num5 > num1) {
					System.out.println("El número mayor es: " + num5);
			}

				
				
				
			if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
					System.out.println("El número menor es: " + num1);
			}

			if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
					System.out.println("El número menor es: " + num2);
			}

			if (num3 < num2 && num3 < num1 && num3 < num4 && num3 < num5) {
					System.out.println("El número menor es: " + num3);
			}

			if (num4 < num2 && num4 < num3 && num4 < num1 && num4 < num5) {
					System.out.println("El número menor es: " + num4);
			}

			if (num5 < num2 && num5 < num3 && num5 < num4 && num5 < num1) {
					System.out.println("El número menor es: " + num5);
			}

		}
		
	}

