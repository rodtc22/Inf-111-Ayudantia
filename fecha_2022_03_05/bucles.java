package fecha_2022_03_05;

import java.util.Scanner;

public class bucles {

	public static void main(String[] args) {
		
//generar la serie de fibonacci, para N terminos
		
		Scanner sc =new Scanner(System.in);
		
//		do-while
		int n;
		do {
			System.out.println("ingresa un valor:");
			n = sc.nextInt();
		} while (n<=0);
		
		
//		for
		int a = -1, b = 1, c = 0;
		for (int i = 1; i <= n; i=i+1) {
			System.out.print(c+", ");
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println();
			
		
//		while
		a = -1; b = 1; c = 0;
		int i = 1;
		while(i <= n) {
			System.out.print(c+" ");
			a = b;
			b = c;
			c = a + b;
			i = i + 1;
		}
		System.out.println();
	}

}
