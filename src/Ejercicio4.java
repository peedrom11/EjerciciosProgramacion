import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad; 
		
		cad = JOptionPane.showInputDialog("Introduce el primer número");
		float num1 = Float.parseFloat(cad);
			
		cad = JOptionPane.showInputDialog("Introduce el primer número");
		float num2 = Float.parseFloat(cad);
		
		cad = JOptionPane.showInputDialog("Introduce el primer número");
		float num3 = Float.parseFloat(cad);
		
		float suma = num1 + num2 + num3;
		
		float division = suma / 3; 
		
		System.out.println("La media de los tres numeros es: " + division);
	}

}
