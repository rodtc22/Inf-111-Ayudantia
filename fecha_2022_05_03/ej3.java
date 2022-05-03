import java.util.*;

class ej3{

    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args){
        // dado un vector de tamanio n, con elementos dentro
        // eliminar los elementos capicua del vector
        
        int n = leer();
        int ar [] = new int [n];
        leerVector(ar,n);
        mostrarVector(ar,n);
        n = eliminarElementos(ar,n);     
        mostrarVector(ar,n);
    }

    public static int escapicua(int x){
        int nuevo = 0;
        int copia = x;

        while(copia > 0){
            int dig = copia % 10;
            copia = copia / 10;
            nuevo = nuevo * 10 + dig;
        }

        int sw = 0;
        if(nuevo == x){
            sw = 1;
        }
        return sw;
    }

    public static void desplazaizquierda(int ar[], int n, int pos){
        for(int i = pos ;i < n ;i++){
            ar[i-1] = ar[i];
        }
    }

    public static int eliminarElementos(int ar[], int n){
        for(int i= 0 ;i < n;i++){
            if(escapicua(ar[i]) == 1){
                desplazaizquierda(ar,n,i+1);
                n = n - 1;
                i--;
            }
        }
        return n;
    }

    public static void mostrarVector(int ar[], int n){
        for(int i= 0 ;i < n;i++){
            System.out.print(ar[i]+", ");
        }
        System.out.println();
    }

    public static void leerVector(int ar[], int n){
        for(int i = 0 ;i < n; i++){
            ar[i] = leer();
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