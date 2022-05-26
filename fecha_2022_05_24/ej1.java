package solucionario;

import java.util.Scanner;

public class ej1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String texto = sc.nextLine();
		resolver(texto);
	}
	
	public static void muestrasincomas(String s) {
		String t = "";
		int a = 'a', z = 'z'; // [97,122]
		for(int i= 0 ;i < s.length() ;i++) {
			int ascci = s.charAt(i);
			if(a <= ascci && ascci <= z) {
				t = t + s.charAt(i);
			}
		}
		System.out.println(t);
	}
	
	public static void muestrasicumple(String s) {
		boolean sw = false;
		for(int i = 0 ;i < s.length();i++) {
			char c = s.charAt(i);
			if(c == 'o') {
				sw = true;
			}
		}
		if(sw == true) {
			muestrasincomas(s);
		}
	}
	
	public static void resolver(String texto) {
		String cp = texto + " ";
		
		String word = "";
		for(int i = 0 ;i < cp.length() ;i++) {
			char c = cp.charAt(i);
			if(c == ' ') {
				if(word.length() >= 1) {
					muestrasicumple(word);
				}
				word = "";
			}else {
				word = word + c;
			}
		}
	}

}
//hola    como         estas,    bienvenido    hola  
