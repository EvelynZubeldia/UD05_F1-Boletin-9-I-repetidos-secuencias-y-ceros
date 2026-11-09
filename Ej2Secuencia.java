import java.util.Scanner;

public class Ej2Secuencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaro el array de 20 numeros enteros
        int[] array = new int[20];

        //Solicitar al usuario que introduzca 20 numeros enteros entre 0 y 5
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + " (del 0 al 5): ");
            array[i] = sc.nextInt();
        }

        //Mostramos el array para comprobar lo que se ha guardado
        System.out.print("Array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //variables de la racha que estamos contando
        
        //la primera posicion ya cuenta con una racha de 1
        int rachaActual = 1;
        int inicioActual = 0;

        //aqui guardamos la racha mas larga que hemos visto hasta ahora
        int mejorRacha = 1;
        int mejorInicio = 0;
        int mejorNumero = array[0];

        //recorremos el array empezando en la pisocion 1 (no en la 0)
        for (int i = 1; i < array.length; i++) {

            //si el numero actual es igual que el anterior se le suma uno a la racha actual
            if(array[i] == array[i - 1]){
                rachaActual++;
            }
            //si el numero actual es distinto al anterior se ha cortado la racha y se empieza una nueva
            else {
                rachaActual = 1; //la racha vuelve a valer 1
                inicioActual = i; // la nueva racha empieza en i
            }

            //Despues de actualizar la racha actual, comprobamos si ha superado al record
            //Usamos > (y no >=) para que, si hay empate, se quede la primera racha encontrada
            if (rachaActual > mejorRacha) {
                mejorRacha = rachaActual; //nuevo record de longitud
                mejorInicio = inicioActual; //donde empezo el nuevo record
                mejorNumero = array[i]; //que numero forma el nuevo record
            }
        }

        //Mostramos el resultado
        System.out.println("El numero que mas veces aparece seguido es: " + mejorNumero);
        System.out.println("Aparece " + mejorRacha + " veces seguidas");
        System.out.println("La secuencia empieza en la posicion: " + mejorInicio);

        sc.close();
    }
}