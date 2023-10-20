package lesson2;

public class SortUtils {


    /**
     * Сортировка выбором
     *
     * 5 4 1 0 1
     * 0 4 1 5 1
     *
     */
    public static void directSort(int[] array){
        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }

            if (i != min){
                int buf = array[i];
                array[i] = array[min];
                array[min] = buf;
            }

        }
    }

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end){
        int left = start;
        int right = end;
        int middle = array[(start + end) / 2]; // Значение опорного элемента

        do {
            while (array[left] < middle){
                left++;
            }

            while (array[right] > middle){
                right--;
            }

            if (left <= right){
                if (left < right) {
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        }
        while (left <= right);

        if (left < end)
            quickSort(array, left, end);

        if (start < right){
            quickSort(array, start, right);
        }

    }

}
