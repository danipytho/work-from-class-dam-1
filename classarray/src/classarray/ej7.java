package classarray;

public class ej7 {
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            // Obtener el índice del pivote
            int pi = partition(arr, low, high);

            // Ordenar los elementos antes y después del pivote
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;

                // Intercambia arr[i] y arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambia arr[i+1] y arr[high] (o el pivote)
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}


