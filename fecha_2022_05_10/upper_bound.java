import java.util.*;

class ej1{

	public static int devuelveMayor(int ar[], int n, int x){
		int l = 0, r = n-1, m = 0;
		while(l <= r){
			m = (l+r)/2;
			if(ar[m] <= x){
				l = m + 1;
			}else{
				r = m - 1;
			}
		}
		if(l == n){
			l = -1;
		}
		return l;
	}

	public static void main(String[] args){
		// devolver el indice del elemento mas grande que x
		int n = 10;
		int ar[] = {-8,-1,2,5,8,20,44,56,61,70};

		System.out.println(devuelveMayor(ar,n,-1000));
		System.out.println(devuelveMayor(ar,n,-8));
		System.out.println(devuelveMayor(ar,n,5));
		System.out.println(devuelveMayor(ar,n,45));
		System.out.println(devuelveMayor(ar,n,70));

		
	}
}