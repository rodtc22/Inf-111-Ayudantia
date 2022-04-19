package fecha_2022_04_19;

public class ej3 {

	public static void main(String[] args) {

		// DADO UN STRING DE LONGITUD N, MOSTRAR TODOS LOS SUBSTRING QUE SON PALINDROMES
		
		//s = "abacaba"
		/*
		 a b a c a b a
		 aba   aca  aba
		 bacab
		 abacaba
		 */
		
		String s = "abacaba";
		int n = s.length();
		
		for(int i = 0 ; i <= n-1 ;i++) {
			String aux = "";
			for(int j = i ;j <= n-1; j++) {
				aux = aux + s.charAt(j);
				if(esPalindrome(aux)) {
					System.out.println(aux);
				}
			}
		}
	}
	
	public static boolean esPalindrome(String s) {
		String aux = "";
		int n = s.length()-1;
		
		for(int i = n; i>= 0 ;i--) {
			aux = aux + s.charAt(i);
		}
		
		
			return aux.equals(s);
		
	}

}
