package fecha_2022_04_26;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// dado un vector de tamanio n, contar la cantidad de elementos, que son numeros primos
		// pueden usar funciones y procedimientos
		// la lectura de dados es por teclado
		
		Scanner sc = new Scanner(System.in);
		
		// leer tamanio del vector
		int tam = sc.nextInt();
		
		// leer el vector
		int vec [] = new int[tam];
		leerVector(vec,tam);
		

		int respuesta = cuantosPrimos(vec,tam);
		
		//mostrar el resultado
		System.out.println(respuesta);
		mostrarPrimos(vec,tam);
	}
	
	
	
	private static void mostrarPrimos(int[] vec, int tam) {
		for(int i= tam-1; i >= 0; i--) {
			if(esPrimo(vec[i]) == 1) {
				System.out.print(vec[i]+", ");
			}
		}
		System.out.println();
	}



	//int: 1/0, booleanos:True/False
	public static int cuantosPrimos(int vec[], int tam) {
		int conta = 0;
		for(int i= 0 ;i < tam ;i++) {
			if(esPrimo(vec[i]) == 1) {
				conta = conta + 1;
			}
		}
		return conta;
	}
	
	private static int esPrimo(int x) {
		int divi = 0,i = 1;
		while(i <= x) {
			if(x%i == 0) {
				divi = divi + 1;
			}
			i = i + 1;
		}
		
		int resp = 0;
		if(divi == 2) {
			resp = 1;
		}else {
			resp = 0;
		}
		
		return resp;
	}



	public static void leerVector(int vec[], int tam) {
		Scanner sc = new Scanner(System.in);
		for(int i= 0 ;i < tam; i++) {
			vec[i] = sc.nextInt();
		}
	}
	
	public static void mostrarVector(int vec[], int tam) {
		for(int i= 0 ;i < tam ;i++) {
			System.out.print(vec[i]+" ");
		}
		System.out.println();
	}
}
