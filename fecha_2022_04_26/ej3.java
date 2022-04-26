package fecha_2022_04_26;

public class ej3 {

	public static void main(String[] args) {
		int tam = 12;
		int vec[] = {2,-4,96,4,1,8,-64,0,6,4,6,4};
		
		int ocu[] = new int[1000];
		
		//encontrar el elemento mas pequenio
		int mini = -64;
		
		//cargar los datos al vector de ocurrencias
		for(int i= 0 ;i < tam ;i++) {
			int x = vec[i] - mini;
			ocu[x]++;
		}
		
		//mostrando los datos ordenados
		for(int i= 0;i < 1000 ;i++) {
			for(int j= 1 ;j<= ocu[i]; j++) {
				System.out.print((i+mini)+" ");
			}
		}
		System.out.println();
	}

}
