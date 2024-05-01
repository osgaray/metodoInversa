// Oscar Octavio Garay Jarquín
// 2024-1349U

import java.util.Scanner;

public class App {
    // variables globales
    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {
            try {

                System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();
                // si el tamaño mayor o igual a 2 y menor o igual a 16, evaluar en la condición de salida del bucle
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;
            // imprimir la excepcion si escribe un valor no entero o un numero negativo
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Escribe un numero entero positivo");
                leer.nextLine();
            }
        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

        System.out.println("Array invertida");
        Inversa(array);

    }

    // arreglo para llenar el array
    public static int[] llenado() {
        int[] arreglo = new int[tamv];
        // recorrer el arreglo para que ingrese el valor en cada indice
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valor de [" + i + "]");
            arreglo[i] = leer.nextInt();
        }
        return arreglo;
    }

    // metodo para mostrar el array
    public static void Mostrar(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    //Aqui va el metodo de inverso
    public  static void Inversa(int[] a) {
        /* inicializar en la longitud del array - 1, mientras i sea menor o igual a la longitud del array e i
        sea mayor o igual a cero, decrementamos i para recorrer el array desde atras el ultimo indice*/
        for (int i=a.length-1; i<=a.length &&  i>=0 ; i--){
            System.out.println(a[i]);
        }
    }

}
