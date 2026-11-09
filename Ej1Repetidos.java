import java.util.Scanner;

public class Ej1Repetidos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos el primer array de 15 números enteros
        int[] array1 = new int[15];

        //Solicitar al usuario que introduzca 15 números enteros
        for(int i = 0; i < array1.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        
        //Declaramos el segundo array de 15 números enteros (contador de repeticiones)
        int[] array2 = new int[15];
        int contador = 0;

        //Este for es para que vaya a array1 y solo copie los números no repetidos
        for(int i= 0; i < array1.length; i++) {
            boolean repetido = false;

            //Buscamos array1[i] entre los valores ya guardados en array2
            for(int j = 0; j < i; j++) {
                if(array1[i] == array1[j]) {
                    repetido = true;
                    break;
                }
            }

            //Si no estaba repetido, lo guardamos
            if(!repetido) {
                array2[contador] = array1[i];
                contador++;
            }
        }

        //Mostramos el resultado
        System.out.println("Los números no repetidos son: ");
        for(int i = 0; i < contador; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();  

        sc.close();
    }
}