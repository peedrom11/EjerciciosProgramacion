package Bloque01_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio03_NumPositivosNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numpos = 0;
		int numneg = 0;
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quieres que se introduzcan"));
		
		for (int i = 0; i < num; i++) {
			
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			
			if (num1 > 0) {
			
				numpos += 1;
				
			}
				else {
					
					numneg += 1;
					
				}
		}
	
		System.out.println("El numero de postivos es : " + numpos + " Y el numero de negativos es : " + numneg);
	}

}
