package fecha_2022_04_12;

import java.util.Scanner;

public class funciones1 {

	public static void main(String[] args) {
		
		int n = leerNumeroValido(1);
		
		for(int i= 1 ;i <= n; i++) {
			int x = leerNumeroValido(2);
			boolean sw = verificacionPrimalidad(x);
			if(sw == true) {
				System.out.println("es primo");
			}else {
				System.out.println("no es primo");
			}
		}
	}
	
	public static boolean verificacionPrimalidad(int x) {
		int cont = 0;
		for(int i = 1;i <= x; i++) {
			if(x % i == 0) {
				cont++;
			}
		}
		if(cont == 2) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int leerNumeroValido(int opcion) {
		
		Scanner sc = new Scanner(System.in);
		int x = -1;
		do {
			if(opcion == 1) {
				System.out.print("ingresa el numero de terminos: ");
			}else {
				System.out.print("ingresa x: ");
			}
			
			x = sc.nextInt();
		}while(x <= 0);
		
		return x;
	}

}
