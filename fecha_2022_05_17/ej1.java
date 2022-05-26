import java.util.*;

class ej1{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		// dado un vector de k segmentos, verificar si existen al menos 2 nros primos por sector

		int vec[] = {1,2,4,4,1,2,3,1,2,3,5,7,1,4,6};
		int n = 15, k = 2;

		resolver(vec,n,k);		
	}

	public static void resolver(int vec[], int n, int k){
		int c = 0, contprimos = 0,sec = 0;
		for(int i  = 0 ;i < n; i++){
			if(esprimo(vec[i])==1){
				contprimos++;
			}
			c++;
			if(c == k || i == n-1){
				sec++;
				if(contprimos == 2){
					System.out.println("El sector "+ sec +" si cumple");
				}else{
					System.out.println("El sector "+ sec +" no cumple");
				}
				contprimos = 0;
				c = 0;
			}
		}
	}

	public static int esprimo(int x){
		int divi = 0;
		for(int i = 1;i <= x; i++){
			if(x%i == 0){
				divi++;
			}
		}

		int ans = 0;
		if(divi == 2){
			ans = 1;
		}
		return ans;
	}
}