import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numEntero;
		numEntero = JOptionPane.showInputDialog("Introduce un número entero: ");
		String numFlotante;
		numFlotante = JOptionPane.showInputDialog("Introduce un número flotante: ");
		String numDouble;
		numDouble = JOptionPane.showInputDialog("Introduce un número double: ");

		System.out.println("El numero entero es : " + numEntero + " El numero flotante es : " + numFlotante
				+ " El numero double es : " + numDouble);
	}

}
