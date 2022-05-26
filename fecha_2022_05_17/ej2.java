import java.util.*;

class ej2{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		// dado un texto, mostrar las palabras que tienen almenos una minuscula y almenos una mayuscula

		// hOla como estan TODOSS en EsTa  ClAsE
		
		String s;
		s = sc.nextLine();

		String cp = s + " ";
		int tam = cp.length();

		String word = "";
		for(int i = 0 ; i <= tam-1 ;i++){
			char c = cp.charAt(i);
			if(c == ' '){
				if(word.length() > 0){
					mostrarSiCumple(word);
				}
				word = "";
			}else{
				word = word + c;
			}
		}
		// System.out.println(tam);
	}

	public static void mostrarSiCumple(String s){
		int minu = 0, mayu = 0;
		int tam = s.length();
		for(int i = 0 ;i < tam ;i++){
			char c = s.charAt(i);
			if(esminu(c)){ //islower, isupper
				minu++;
			}else{
				mayu++;
			}
		}

		if(minu >= 1  && mayu >= 1){
			System.out.println(s);
		}
	}

	public static boolean esminu(char c){
		int ascci = c;
		int a = 'a', z = 'z';

		boolean sw = false;
		if(a <= ascci && ascci <= z){
			sw = true;
		}
		return sw;
	}
}

  // hOla   como   estan TODOSS   en   EsTa ClAsE   