package solucionario;

import java.util.Scanner;

/*

15 5 30
8 21 4 30 0 17 9 3 7 15 30 2 23 11 5

 * */

public class ej3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n,k,x;
		n = sc.nextInt();
		k = sc.nextInt();
		x = sc.nextInt();
		
		int vec[] = new int[n];
		leerVector(vec,n);
		dividirensectores(vec,n,k,x);
//		mostrarVector(vec,n);

	}
	
	
	private static void dividirensectores(int[] vec, int n, int k, int x) {
		int p = 0;
		boolean sw = false;
		int nrosector = 1;
		for(int i = 0 ;i < n;i++) {
			p++;
			if(vec[i] == x) {
				sw = true;
			}
			if(p == k) {
				if(sw == true) {
					System.out.println(x+" EXISTE EN EL SECTOR "+nrosector);
				}else {
					System.out.println(x+" NO EXISTE EN EL SECTOR "+nrosector);
				}
				sw = false;
				nrosector++;
				p = 0;
			}
		}
		
	}


	private static void mostrarVector(int[] vec, int n) {
		for(int i= 0 ;i < n;i++)
			System.out.print(vec[i]+" ");
		System.out.println();
		
	}
	private static void leerVector(int[] vec, int n) {
		for(int i= 0  ;i < n;i++)
			vec[i] = sc.nextInt();
	}
	
	
}
