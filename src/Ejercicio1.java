import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numEntero;
		numEntero = JOptionPane.showInputDialog("Introduce un n�mero entero: ");
		String numFlotante;
		numFlotante = JOptionPane.showInputDialog("Introduce un n�mero flotante: ");
		String numDouble;
		numDouble = JOptionPane.showInputDialog("Introduce un n�mero double: ");

		System.out.println("El numero entero es : " + numEntero + " El numero flotante es : " + numFlotante
				+ " El numero double es : " + numDouble);
	}

}
