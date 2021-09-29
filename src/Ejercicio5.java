import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce otro número: ");
		float num2 = Float.parseFloat(cad);

		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);

		float num3 = num1;
		num1 = num2;
		num2 = num3;

		System.out.println("Se han cambiado los número");
		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);
		
		
		
		
		
	}

}
