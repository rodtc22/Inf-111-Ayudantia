package fecha_2022_04_19;

import java.util.Scanner;

public class ej1 {
	
	

	public static void main(String[] args) {
		/*
		 DADA UN TEXTO B, REEMPLAZAR LA PALABRA X POR LA PALABRA Y
		 
		 b = "hola a todos como estan el dia de hoy hola "
			x = hola
			y = adios
		b = "adios a todos como estan el dia de hoy adios"
		 */
		
		Scanner sc = new Scanner(System.in);
		String texto,x,y;
		
		texto = sc.nextLine();
		x = sc.next(); //cadena a reemplazar
		y = sc.next(); //reemplazo
		
		String nuevotexto = reemplazarOcurrencia(x,y,texto);
		
		System.out.println(nuevotexto);
	}

	private static String reemplazarOcurrencia(String x, String y, String texto) {
		texto = texto + " ";
		int tam = texto.length();
		
		String nuevotexto = "";
		
		String palabra = "";
		for(int i = 0 ;i < tam ;i++) {
			char c = texto.charAt(i);
			if(c == ' ') {
				if(palabra.equals(x)) {
					nuevotexto = nuevotexto + y +" ";
				}else {
					nuevotexto = nuevotexto + palabra+" ";
				}
				palabra = "";
			}else {
				palabra = palabra + c;
			}
		}
		
		return nuevotexto;
	}

}
