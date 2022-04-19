package fecha_2022_03_05;

import java.util.Scanner;

public class secuenciales {

	public static void main(String[] args) {
		
//		Para leer datos desde teclado
		Scanner sc = new Scanner(System.in);

//		leer dos numeros por teclado y mostrar + , -, *, /
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
				
		System.out.println("suma: "+(a+b));
		System.out.println("resta: "+(a-b));
		System.out.println("multiplicacion: "+(a*b));
		System.out.println("division entera: "+(a/b));
		System.out.println("division real: "+(1.0*a/b));
		

//		leyendo DATOS
		int entero = sc.nextInt();
		double decimal = sc.nextDouble();
		float flotante = sc.nextFloat();
		String cadena = sc.next();
		
		String aux = sc.nextLine();
		String cadenaEspacios = sc.nextLine();
		
		System.out.println(entero);
		System.out.println(decimal);
		System.out.println(flotante);
		System.out.println(cadena);
		System.out.println(cadenaEspacios);
		
//		boolean sw = sc.nextBoolean();  NO EXISTE
//		char caracter = sc.nextChar(); NO EXISTE
		
	}

}
