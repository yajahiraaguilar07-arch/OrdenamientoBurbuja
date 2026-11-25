package Metodos_de_Ordenamiento;

/**
 * Clase que implementa el algoritmo de ordenamiento Burbuja.
 */
public class Burbuja {

    /**
     * Ordena un arreglo de enteros de forma ascendente.
     */
    public static void ordenar(int[] arr) {
        int n = arr.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    intercambiado = true;
                }
            }

            if (!intercambiado) {
                break;
            }
        }
    }

    /**
     * Imprime los elementos del arreglo.
     */
    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }

        System.out.println("]");
    }
}
