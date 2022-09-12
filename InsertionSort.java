import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args)
    {
        int[] arr = { 12, 67, 32, 82, 10, 2, 7, 23, 78, 90, 56, 12, 24, 76, 78, 56 };
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort2_reviewed(arr)));

    }

    public static int[] sort(int[] array) {
        // i - индекс элемента, которому мы сейчас ищем место, количество упорядоченных элементов.
        int N = array.length;
        for (int i = 0; i < N; i++) {
            int t = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > t) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = t;

        }
        return array;
    }

    public static  int[] sort2_reviewed(int[] array)
    {
        int N = array.length;

        for (int i = 1; i < N; i++) {

            int k = i-1;

            while (array[k] > array[k+1])
            {
                int temp = array[k];
                array[k] = array[k+1];
                array[k+1] = temp;
                --k;
            }

        }
    return array;
    }
}



