public class QuickSort
{

    public static void quickSort(int[] array, int low, int high)
    {
        if ((array.length==0) || (low>=high))
            return;// Если длина массива 0,если уже нечего делить, остановить.

        int mid =low + (high - low)/2;
        int pivot = array[mid]; // Выбираем опорный элемент(пивот) как серединный, хоть, как я слышал, есть усовершенствованная версия;

        int i = low, j = high;

        while (i<j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        quickSort(array, low, mid);
        quickSort(array,mid+1, high);

    }

    public static void main(String[] args) {

//        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
//        System.out.println(Arrays.toString(x));
//
//        int low = 0;
//        int high = x.length - 1;
//
//        quickSort(x, low, high);
//
//        System.out.println(Arrays.toString(x));
        test1();
    }


    private static void test1() {
        int testLen = 10000000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];

        System.out.println("\n-----Случайный массив------");

        for (int i = 0; i < testLen; i++) {
            arr2[i] = arr1[i] = (int)Math.round(Math.random() * 10000);
        }
        

        System.out.println("Быстрая сортировка:");
        measureTime(() -> quickSort(arr1, 0, testLen - 1));
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }

}
