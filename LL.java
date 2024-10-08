
package ll;

import java.util.Scanner;

public class LL {

  
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPares = 0;
        int sumaImpares = 0;
        int countPares = 0;
        int countImpares = 0;
        int sumaPosicionesPares = 0;
        int sumaPosicionesimpares = 0;
        System.out.println("Ingrese 20 numeros enteros:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
                countPares++;
            } else {
                sumaImpares += numeros[i];
                countImpares++;
            }

            if (i % 2 == 0) {
                sumaPosicionesPares += numeros[i];
            } else {
                sumaPosicionesimpares += numeros[i];
            }
        }
        double promedioPares = countPares > 0 ? (double) sumaPares / countPares : 0;
        double promedioImpares = countImpares > 0 ? (double) sumaImpares / countImpares : 0;

        // Mostrar resultados
        System.out.println("Promedio de numeros pares: " + promedioPares);
        System.out.println("Promedio de numeros impares: " + promedioImpares);
        System.out.println("promedio de los elementos que ocupan la posiciones pares en el arreglo :" + sumaPosicionesPares);
        System.out.println("promedio de los elementos que ocupan la posiciones impares en el arreglo :" + sumaPosicionesimpares);
    }
    
}
