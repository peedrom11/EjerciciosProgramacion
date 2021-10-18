package Bloque3_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio4_PositivosYnegativosHasta0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = -1;
		int numPos = 0, numNeg = 0;

		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));
			if (num > 0) {
				numPos += 1;
			}

			if (0 > num) {
				numNeg += 1;
			}
		}
		System.out.println("Se han introducido " + numPos + " positivos y " + numNeg + " negativos");
		
		
		
		
		
		
	}

}
