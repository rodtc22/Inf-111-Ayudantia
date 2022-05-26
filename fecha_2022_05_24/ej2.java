
package solucionario;
import java.util.*;

public class ej2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 
		int n = sc.nextInt();
		
		int vec[] = new int[n];
		int p = 0;
		
		while(p != n) {
			int x = sc.nextInt();
			if(esprimo(x)) {
				vec[p] = x;
				p++;
			}
		}
		
		ordenar(vec,n);
		mostrarVector(vec,n);
		
	}
	public static void mostrarVector(int vec[], int n) {
		for(int i= 0 ;i < n; i++) {
			System.out.print(vec[i]+" ");
		}
		System.out.println();
	}
	
	public static void ordenar(int v[], int n) {
		for(int i= 0 ;i <n ;i++) {
			for(int j = 0 ;j < n ;j++) {
				if(v[i]< v[j]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
	}
	
	public static boolean esprimo(int x) {
		int cnt = 0;
		for(int i= 1 ;i <= x;i++) {
			if(x%i == 0) {
				cnt++;
			}
		}
		boolean sw = false;
		if(cnt == 2) {
			sw = true;
		}
		return sw;
	}

}
