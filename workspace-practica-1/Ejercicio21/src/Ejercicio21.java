import javax.swing.JOptionPane;

public class Ejercicio21 {

	public static void main(String[] args) {
		int num, contador;
		boolean primo = true;
		int a = 0;
		
		JOptionPane.showMessageDialog(null, "Vamos a ver si un número introducido es primo o no.");
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insertar un número"));
			contador = 1;
			
			if (num == 0) {
				throw new numero0();
				
			}else {
				while (contador<(num+1)) {
					
					if (num % contador == 0) {
						a ++;
					}	
					contador ++;
				}
			}
			
			if (a == 2) {
				JOptionPane.showMessageDialog(null, "El numero "+num+" ES un número primo");
			}else {
				JOptionPane.showMessageDialog(null, "El numero "+num+" NO ES un número primo");
			}

		} catch (numero0 e) {
			JOptionPane.showMessageDialog(null, "Error. El 0 no es un número natural.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error. No has introducido un número natural.");
		} finally {
			JOptionPane.showMessageDialog(null, "Proceso terminado");
		}
		
	}
}


		

