public class MaxSubArraySum
{
//    Task:
//   Для заданного целочисленного массива
//   найдите подмассив максимальной длины, имеющий заданную сумму.
    public static void main(String[] args)
    {
        short[] nums = { 5,4,-1,7,8 };
        int target = 8;

        Kadane(nums);
        getMaxSubArrWithSum(nums, target);
    }

    static void Kadane(short[] arr)
    {
         /*
         Kadane : Мы считаем суммы подмасивов, заканчивающихся на arr[i]. Важно понимать, что подмассив с
         макс. суммой, заканчивающийся на arr[i+1], будет либо предыдущая сумма S, либо S+arr[i+1]
          */
        int max_sum = arr[0];

        int temp_sum = arr[0];

        for (int k = 1; k < arr.length; ++k)
        {
            temp_sum = Math.max(temp_sum + arr[k], arr[k]);
            if(temp_sum > max_sum)
                max_sum = temp_sum;
        }
        System.out.println(max_sum);
    }


    static void getMaxSubArrWithSum(short[] arr, int sum)
    {
        int length_m = 0;
        int temp_sum, j;

        for (int i = 0; i < arr.length; i++) {

            temp_sum = 0;
            j =0;

            while(temp_sum <= 8)
            {
                temp_sum += arr[i+j];
                ++j;
                if (temp_sum==8 && ( j+1 > length_m))
                {
                    length_m = j;
                    break;
                }
                else if (i+j > arr.length-1)
                    break;


            }

        }
        System.out.println(length_m);
    }
}
