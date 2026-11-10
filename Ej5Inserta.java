import java.util.Scanner;

public class Ej5Inserta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaro el array de 10 numeros enteros
        //(solo rellenaremos 9 al principio)
        int[] array = new int[10];

        //Solicitar al usuario que introduzca 9 números enteros
        for(int i = 0; i < array.length - 1; i++) {
            System.out.print("Introduce el numero " + (i + 1) + " (ordenado de menor a mayor): ");
            array[i] = sc.nextInt();
        }

        //Pedimos el numero nuevos que vamos a insertar
        System.out.print("Introduce el numero que quieres insertar: ");
        int nuevo = sc.nextInt();

        //Vamos a buscar la posicion del numero nuevo
        //vamos a empezar en el 9(si el numero es mayor que todos ira en la ultima casilla)
        int posicion = 9;

        //pasamos por los 9 numeros y paramos en el primero que sea mayor que el nuevo
        for(int i = 0; i < 9; i++) {
            if(array[i] > nuevo) {
                posicion = i;
                break; 
            }
        }

        //vamos a "hacer hueco" para el nuevo numero, moviendo todos los numeros a la derecha
        for(int i = 9; i > posicion; i--) {
            array[i] = array[i - 1];
        }
        //insertamos el nuevo numero en su sitio
        array[posicion] = nuevo;

        //Mostramos el array para comprobar lo que se ha guardado
        System.out.print("Array final: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}