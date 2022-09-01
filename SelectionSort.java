import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = { 12, 67, 32, 82, 10, 2, 7, 23, 78, 90, 56, 12, 24, 76, 78, 56 };
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(min_id(arr));

    }

    public static int[] sort(int[] array)
    {
        int N = array.length;
        for (int i = 0; i < N; i++)
        {
            int m = i + min_id(Arrays.copyOfRange(array,i,N-1));
            int temp = array[i];
            array[i] = array[m];
            array[m] = temp;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    public static int min_id(int[] array)
    {
        if (array.length == 0)
            return -1;
        int id = 0;
        for (int i = 1; i < array.length; i++)
        {
            if(array[i] < array[id])
                id = i;
        }
        return id;
    }

}
