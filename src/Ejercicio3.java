import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad; 
		
		cad = JOptionPane.showInputDialog("Introduce el primer n�mero");
		float num1 = Float.parseFloat(cad);
		
		
		cad = JOptionPane.showInputDialog("Introduce el segundo n�mero");
		float num2 = Float.parseFloat(cad);
		
		
		cad = JOptionPane.showInputDialog("Introduce el tercer n�mero");
		float num3 = Float.parseFloat(cad);
		
		float suma = num1 + num2 + num3;
		
		System.out.println("La suma de los tres numeros es: " + suma);
	}

}
