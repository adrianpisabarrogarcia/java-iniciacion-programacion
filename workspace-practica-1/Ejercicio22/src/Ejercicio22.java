import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, a;
		a = 0;
		System.out.println("Introducir numero para hallar hasta n-numeros primos");
		num = entrada.nextInt();
		
		if (num ==1) {
			System.out.println("Primo: "+num);
		}else {
			for (int i = 1; i < (num+1); i++) {
				for (int j = 1; j < (i+1); j++) {
					if (i % j == 0) {
						a++;
					}
				}
				if (a == 2) {
					System.out.print("Primo: "+i + "     ");
				}
				a = 0;
				
			}
		}
	}

}
