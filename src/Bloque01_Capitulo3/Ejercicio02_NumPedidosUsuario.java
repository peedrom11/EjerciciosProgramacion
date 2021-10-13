package Bloque01_Capitulo3;

import javax.swing.JOptionPane;

public class Ejercicio02_NumPedidosUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int suma = 0;
	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quieres que se introduzcan" ));
		
		for (int i = 0; i < num1; i++) {
			
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
			
			if (num > 10) {
				
				suma += num;
		
				System.out.println(suma);
			}
			
		}
		

	}

}
