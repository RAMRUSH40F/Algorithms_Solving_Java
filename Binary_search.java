import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Binary_search 
{
    static int bin_search(int list[], int num){

        int l = 0;
        int r = list.length - 1;
        int middle_id;


        while (l != 1)
        {
            middle_id = l + (r - l)/2;

            if (list[middle_id] == num)
                return middle_id;

            else if (list[middle_id]<num)
                l = middle_id + 1;
            else
                r = middle_id - 1;

        }

        return -1;

    }
    public static void main(String[] argz){
        int list[] = {1,2,3,4,5,6,7,8,9,10,22,222,2222,22222,222222};
        int id = bin_search(list, 22);

        System.out.println(Integer.toString(id));
    }
}
