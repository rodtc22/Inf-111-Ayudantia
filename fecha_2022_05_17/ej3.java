import java.util.*;

class ej3{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		// dado un vector de tamanio n, y sectores de tamanio k, ordenar cada sector ascendentemente

		int vec[] = {7,-2,5,4,-1,4,3,10,2,5,1,-2,1,-4,6};
		int n = 15, k = 6;

		resolver(vec,n,k);	

		for(int i= 0 ;i < n ;i++)
			System.out.print(vec[i]+" ");
		System.out.println();

	}

	public static void resolver(int vec[], int n, int k){
		for(int i = 0 ;i < n; i = i + k){
			int j = i+k-1;
			if(j >= n){
				j =n-1;
			}
			burbuja(vec,i,j);
		}
	}

	public static void burbuja(int ar[],int l , int r){
		for(int i= l ;i <= r ;i++){
			for(int j = l ;j <= r ; j++){
				if(ar[i] > ar[j]){
					int temp =ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
}