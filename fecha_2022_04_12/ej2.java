package fecha_2022_04_12;

import java.util.*;

public class ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int lim = 1,nro = 0,cnt = 0;
		int prim = 1;
		boolean sw = true;
		
		int mostrar = 0;
		
		for(int i = 1;i <= n;i++) {
			if(sw == true) {
				mostrar = nro;
				cnt++;
				if(lim == cnt) {
					sw = false;
					lim++;
					cnt = 0;
					nro++;
				}
			}else {
				boolean esprimo = false;
				while(esprimo == false) {
					//prueba de primalidad
					int c = 0;
					for(int j = 1;j <= prim ;j++) {
						if(prim %j == 0) {
							c++;
						}
					}
					if(c == 2) {
						mostrar = prim;
						sw = true;
						esprimo = true;
					}
					prim++;
				}
			}
			if(i == n) {
				System.out.println(mostrar);
			}else {
				System.out.print(mostrar+", ");
			}
		}
	}

}
