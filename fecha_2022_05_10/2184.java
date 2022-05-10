import java.util.*;

class ej3{

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

	public static void resolver(int ar[], int n){
		for(int i= 0 ;i < n;i++){
			int cnt = 0;

			for(int j= 0 ;j < n; j++){
				if(ar[i] == ar[j]){
					cnt++;
				}
			}
			if(cnt == 1){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args){
		
		int t;

		t = sc.nextInt();

		while(t > 0){
			//cada caso de prueba
			int n = sc.nextInt();
			int ar[] = new int[n];

			leerVector(ar,n);

			resolver(ar,n);

			// mostrarVector(ar,n);

			t--;
		}
	}
}