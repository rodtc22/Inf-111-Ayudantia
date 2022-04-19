package fecha_2022_04_19;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		/*
		 DADA UN TEXTO B, BUSCAR LA PALABRA X, ELIMININARLA E INSERTARLA POR DELANTE Y POR ATRAS DEL TEXTO
		 
		 b = "abc aaa dg a aaa ff bbb aaa df xgs aaa f"
			x = aaa
		b = "aaa abc dg a ff bbb df xgs f aaa"
		 */
		
		Scanner sc = new Scanner(System.in);
		String texto,x,y;
		
		texto = sc.nextLine();
		x = sc.next(); //cadena a eliminar
		
		String nuevotexto = eliminaTodasOcurrencias(x,texto);
		
		nuevotexto = x + " " + nuevotexto + x;
		System.out.println(nuevotexto);
		

	}
	
	public static String eliminaTodasOcurrencias(String x, String texto) {
		texto = texto + " ";
		int tam = texto.length();
		
		String nuevotexto = "";
		String palabra = "";
		for(int i= 0 ;i < tam ;i++) {
			char c = texto.charAt(i);
			
			if(c == ' ') {
				if(!palabra.equals(x)){
					nuevotexto = nuevotexto + palabra +" ";
				 }
				palabra = "";
			}else {
				palabra = palabra + c;
			}
		}
		return nuevotexto;
	}

}
