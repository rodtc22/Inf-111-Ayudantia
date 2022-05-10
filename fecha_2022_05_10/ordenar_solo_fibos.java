import java.util.*;

class ej2{

	public static void mostrarVector(int ar[], int n){
		for(int i = 0 ;  i < n ; i++)
			System.out.print(ar[i] + ", ");
		System.out.println();
	}

	public static boolean esfibo(int x){
		boolean sw = false;
		int a = -1, b = 1, c = 0;
		while(c<=x){
			if(c == x) sw = true;
			a = b ; b = c; c = a + b;
		}
		return sw;
	}

	public static void ordena_fibo(int ar[], int n){
		for(int i= 0 ;i < n; i++){
			for(int j = 0 ;j < n; j++){
				if(ar[i] > ar[j] && esfibo(ar[i]) && esfibo(ar[j])){
					int aux = ar[i];
					ar[i] = ar[j];
					ar[j] = aux;
				}
			}
		}
	}
	
	public static void main(String[] args){
		// dado un vector de elementos, ordenar solamente los numeros fibonacci de manera ascendente

		int vec [] = {4,24,5,3,12,0};
		int n = 6;

		ordena_fibo(vec,n);
		mostrarVector(vec,n);
	}
}