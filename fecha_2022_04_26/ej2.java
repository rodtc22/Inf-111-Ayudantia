package fecha_2022_04_26;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cad = sc.next();
		
		int letra[] = new int[26];
		
		int tam = cad.length();
		for(int i = 0 ;i < tam ;i++) {
			char c = cad.charAt(i);
			int ascci = c - 97;
			letra[ascci]++;
		}
		
		for(int i= 0 ;i < 26 ;i++) 
			System.out.print(letra[i]+" ");
		System.out.println();
		
		String ans = "";
		for(int i = 0 ;i < 26 ;i++) {
			for(int j= 1 ;j<= letra[i] ; j++) {
				char c = (char)(i+97);
				ans = ans + c;
			}
		}
		System.out.println(ans);
	}

}
