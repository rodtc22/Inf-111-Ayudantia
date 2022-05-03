import java.util.*;

class ej4{

    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args){
        
        int n = leer();
        int ar [] = new int [n];
        leerVector(ar,n);
        mostrarVector(ar,n);
        
        System.out.println("Respuesta: ");
        boolean sigueBuscando = true;
        for(int i= 0 ;i < n && sigueBuscando ;i++){
            int acu = 0;
            for(int j= i ; j < n && sigueBuscando;j++){
                acu = acu + ar[j];
                if(acu == 0){
                    sigueBuscando = false;
                    for(int k = i ; k <= j ;k++){
                        System.out.print(ar[k]+", ");
                    }
                    System.out.println();
                }
            }
        }
    }



    public static void mostrarVector(int ar[], int n){
        for(int i= 0 ;i < n;i++){
            System.out.print(ar[i]+", ");
        }
        System.out.println();
    }

    public static void leerVector(int ar[], int n){
        for(int i = 0 ;i < n; i++){
            ar[i] = sc.nextInt();
        }
    }

    public static int leer(){ // > 0
        int n; 
        do{
            n = sc.nextInt();
        }while(n <= 0);
        return n;
    }
}