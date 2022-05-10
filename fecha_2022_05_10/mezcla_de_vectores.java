import java.util.*;

class ej5{

	public static void mostrarVector(int ar[], int n){
		for(int i = 0 ;  i < n ; i++)
			System.out.print(ar[i] + ", ");
		System.out.println();
	}

	public static void main(String[] args){
		int izq [] = {50,42,35,30,27,21,18,2};
		int tami = 8;

		int der [] = {75,30,11,9,3};
		int tamd = 5;

		mostrarVector(izq,tami);
		mostrarVector(der,tamd);

		int tamr = tami + tamd;
		int resp [] = new int[tamr];

		int i = 0, j = 0;
		for(int k = 0 ;k < tamr; k++){
			if(j == tamd){
				resp[k] = izq[i];
				i++;
			}else if(i == tami){
				resp[k] = der[j];
				j++;
			}else{
				if(izq[i] > der[j]){
					resp[k] = izq[i];
					i++;
				}else{
					resp[k] = der[j];
					j++;
				}
			}
		}

		mostrarVector(resp,tamr);
	}
}