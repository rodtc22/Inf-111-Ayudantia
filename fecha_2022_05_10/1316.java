import java.util.*;

class ej4{

	static Scanner sc =new Scanner (System.in);

	public static void leerVector (int vec[], int n){
		for(int i = 0 ;i < n; i++)
			vec[i] = sc.nextInt();
	}

	public static void mostrarVector(int ar[], int n){
		for(int i = 0 ;  i < n ; i++)
			System.out.print(ar[i] + ", ");
		System.out.println();
	}

	public static void ordenoDes(int vec[], int n){
		for(int i = 0 ;i < n; i++){
			for(int j= 0 ;j < n; j++){
				if(vec[i] > vec[j]){
					int aux = vec[i];
					vec[i] = vec[j];
					vec[j] = aux;
				}
			}
		}
	}

	public static void ordenoAsc(int vec[], int n){
		for(int i = 0 ;i < n; i++){
			for(int j= 0 ;j < n; j++){
				if(vec[i] < vec[j]){
					int aux = vec[i];
					vec[i] = vec[j];
					vec[j] = aux;
				}
			}
		}
	}



	public static void resolver(int a[],int b[], int n){
		ordenoAsc(a,n);
		ordenoDes(b,n);

		// mostrarVector(a,n);
		// mostrarVector(b,n);

		int suma = 0;
		for(int i= 0 ;i < n;i++){
			suma = suma + a[i]*b[i];
		}
		System.out.println(suma);

	}

	public static void main(String[] args){
		while(sc.hasNext()){
			int n = sc.nextInt();

			int a[] = new int[n];
			int b[] = new int[n];

			leerVector(a,n);
			leerVector(b,n);

			resolver(a,b,n);

		}
	}
}