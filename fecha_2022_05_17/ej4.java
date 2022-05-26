import java.util.*;

class ej4{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		//dado un texto, capturar las palabras palindromes, agregarlos a un vector y luego ordenarlas ascendentemente

		String texto;
		texto = sc.nextLine();

		int tam = nroPalabrasPalindromes(texto);
		String vec [] = new String[tam];
		rellenarDePalindromes(vec,texto);
		
		mostrar(vec,tam);
		ordenar(vec,tam);
		mostrar(vec,tam);
	}

	public static void mostrar(String ar[], int tam){
		for(int i= 0 ;i < tam ;i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}

	public static void ordenar(String ar[], int tam){
		for(int i= 0 ;i < tam ;i++){
			for(int j = 0 ;j < tam ;j++){
				if(ar[i].compareTo(ar[j]) < 0){
					String tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
	}

	public static void rellenarDePalindromes(String vec[] , String s){
		String cp = s + " ";
		String word = "";
		int tam = cp.length();
		int j = 0;
		for(int i = 0 ;i < tam ;i++){
			char c = cp.charAt(i);
			if(c == ' '){
				if(word.length() > 0){
					if(espalindromo(word)){
						vec[j] = word;
						j++;		
					}
				}
				word = "";
			}else{
				word = word + c;
			}
		}
	}

	public static boolean espalindromo(String s){
		String t = "";
		for(int i = 0 ;i < s.length() ;i++){
			char c = s.charAt(i);
			t = c + t;
		}

		boolean sw = false;
		if(s.equals(t)){
			sw = true;
		}
		return sw;
	}

	public static int nroPalabrasPalindromes(String s){
		int nropalindromes = 0;
		
		String cp = s + " ";
		String word = "";
		int tam = cp.length();
		for(int i = 0 ;i < tam ;i++){
			char c = cp.charAt(i);
			if(c == ' '){
				if(word.length() > 0){
					if(espalindromo(word)){
						nropalindromes++;				
					}
				}
				word = "";
			}else{
				word = word + c;
			}
		}

		return nropalindromes;
	}
}