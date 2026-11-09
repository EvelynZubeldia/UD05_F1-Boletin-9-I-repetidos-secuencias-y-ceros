import java.util.Scanner;

public class Ej3Ceros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaro el array de 12 numeros enteros
        int[] array = new int[12];

        //Solicitar al usuario que introduzca 15 números enteros
        for(int i = 0; i < array.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        //Mostramos el array para comprobar lo que se ha guardado
        System.out.print("Array antes: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Empieza en 0 porque la primera casilla libre es la casilla del array
        int posicion = 0;

        //recorremos el array de izuierda a derecha 
        for (int i = 0; i < array.length; i++) {

            //si el numero no es 0, lo movemos a la siguiente posicion libre
            if(array[i] != 0) {
                array[posicion] = array[i];
                posicion++;
            }
            //si es 0 no hacemos nada, lo saltamos
        }

        //Ahora todos los números distintos de 0 están al principio, en orden
        //Las casillas desde posicion hasta el final se rellenan con ceros
        for(int i = posicion; i < array.length; i++) {
            array[i] = 0;
        }

        //Enseñamos el array despues de modificarlo
        System.out.print("Array despues: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}