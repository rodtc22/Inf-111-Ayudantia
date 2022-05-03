import java.util.*;

class ej2{

    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args){
        // dado un vector de tamanio n, con elementos dentro
        // agregar un -1 despues de cada numero fibonacci, sin usar vectores auxiliares
        
        int n = leer();
        int ar [] = new int [2*n];
        leerVector(ar,n);
        mostrarVector(ar,n);
        n = agregaElementos(ar,n);
        mostrarVector(ar,n);

    }

    public static boolean esfibo(int x){
        int a = -1, b = 1, c = 0;
        boolean sw = false;

        while (c <= x) {
            c = a + b;
            a = b; b = c;
            if(c == x && x > 0){
                sw = true;
            }
        }
        return sw;
    }

    public static void desplazarderecha(int ar[], int n, int pos){
        for(int i = n-1 ; i >= pos ;i --){
            ar[i+1] = ar[i];
        }
    }

    public static int agregaElementos(int ar[], int n){
        for(int i= 0 ;i < n; i++){
            if (esfibo(ar[i])){
                desplazarderecha(ar,n,i);
                ar[i] = -1;
                n = n + 1;
                i++;
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