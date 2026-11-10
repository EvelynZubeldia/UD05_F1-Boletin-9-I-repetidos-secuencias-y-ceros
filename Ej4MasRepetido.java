import java.util.Scanner;

public class Ej4MasRepetido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaro el array de 30 numeros enteros
        int[] array = new int[30];

        //Solicitar al usuario que introduzca 30 números enteros
        for(int i = 0; i < array.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + " (del 1 al 10): ");
            array[i] = sc.nextInt();
        }

        //array de 11 posiciones para contar 
        //cuantas veces aparece cada numero del 1 al 10
        int[] conteo = new int[11]; 

        //Mostramos el array para comprobar lo que se ha guardado
        System.out.print("Array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //recorremos el array y contamos cuantas veces aparece cada numero
        //usamos el valor de array[i] como posicion en conteo y sumamos 1
        for(int i = 0; i < array.length; i++) {
            conteo[array[i]]++;
        }

        //Ahora tenemos que buscar el numeros más grande
        int numeroGanador = 1; //el números que mas aparece
        int vecesGanador = conteo[1]; //cuantas veces aparece

        //recorremos los numeros del 2 al 10 comparando
        for(int i = 2; i < conteo.length; i++) {
            //Usamos > (y no >=) para que, si hay empate,
            //se quede el menor porque vamos por los numeros de menor a mayor
            if(conteo[i] > vecesGanador) {
                vecesGanador = conteo[i];
                numeroGanador = i;
            }
        }

        //Mostramos el resultado
        System.out.println("El numero que mas veces aparece es: " + numeroGanador);
        System.out.println("Aparece " + vecesGanador + " veces");

        //Recorremos el array y enseñamos la posicion i cada que aparece el numero ganador
        System.out.print("Posiciones: ");
        for(int i = 0; i < array.length; i++) {
            if(array[i] == numeroGanador) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}