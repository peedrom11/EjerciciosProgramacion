import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un n�mero: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce otro n�mero: ");
		float num2 = Float.parseFloat(cad);

		System.out.println("El primer n�mero es: " + num1);
		System.out.println("El segundo n�mero es: " + num2);

		float num3 = num1;
		num1 = num2;
		num2 = num3;

		System.out.println("Se han cambiado los n�mero");
		System.out.println("El primer n�mero es: " + num1);
		System.out.println("El segundo n�mero es: " + num2);
		
		
		
		
		
	}

}
