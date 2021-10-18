package Bloque3_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio1_num0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;
		int cont = 0;
		int num;
		int media; 
	
		
		do {
	
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));	
			
		suma += num;
		cont += 1;
		media = suma/cont; 
				
		} while (num!=0);
		
		System.out.println("La suma de todos los numeros es: " +suma);
		System.out.println("La media de todos los numeros es: " +media);
		
		
	}

}
