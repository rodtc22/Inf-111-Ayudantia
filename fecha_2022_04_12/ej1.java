package fecha_2022_04_12;

import java.util.*;

public class ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long nuevo = 0;
		int noprimos = 0;
		for(int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			
			//obtenemos el primer digito
			int cp = x;
			int dig = 0;
			while(cp > 0) {
				dig = cp % 10;
				cp = cp / 10;
			}
			
			if(dig == 2 || dig == 3 || dig == 5 || dig == 7) {
				nuevo = nuevo * 10 + dig;
			}else {
				nuevo = nuevo * 10;
				noprimos++;
			}
		}
		
		System.out.println("Numero resultante: "+nuevo);
		System.out.println("Se leyeron "+noprimos+" numeros que no tenian primer digito primo");
	}

}
