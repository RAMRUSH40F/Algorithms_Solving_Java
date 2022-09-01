import java.io.*;
import java.util.*;

class Some_solutions
{
    // прохожу задания с курса Java core,"
    // решаю в основном только задачи уровня B

    public static void main(String[] args)
    {

    }
    static void both_neighbor_less()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int res = 0;
        for (int i = 1; i <n-1 ; i++) {
            if (array[i]>array[i-1] && array[i] > array[i+1])
                res++;
        }
        System.out.println(res);
    }
    static void print_matrix(int[][] matrix)
    {
        int m = matrix[0].length;

        for (int[] ints : matrix) {
            for (int j = 0; j < m; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    static void turn_matrix()
    {
        // Получаю два числа - размерности матрицы.
        // Далее - матрицу. Надо вывести повернутую.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix  = new int[n][m];

        // Создание матрицы n на m
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m ; j++)
                matrix[i][j] = sc.nextInt();

        // Создание матрицы m на n
        int[][] turned_matrix  = new int[m][n];



        // Поворот массива на 90 градусов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                turned_matrix[j][n-1-i] = matrix[i][j];
            }


        }
        // Вывод маccива.
        print_matrix(matrix);
        print_matrix(turned_matrix);
    }

    static void create_diag_matrix()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // Создание матрицы n на n, у которой на диагонали 1, под диагональю 2;
        int[][] matrix  = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {

                if (i==j) matrix[i][i] = 1;
                else if (j<i) matrix[i][j] = 2;
                else matrix[i][j] = 0;
            }
        }
        print_matrix(matrix);
    }
    static void difficult_array()
    {
        /*
        Вводится натуральное число n. На следующей строчке вводятся n целых чисел.
        Напишите код, который создаст массив с именем array на n элементов,
        в котором буду храниться введённые числа (элемент массива равен соответствующему
        числу в во второй строке). На следующей строке вводится число t - Количество
        запросов к вашей программе. Каждый запрос состоит из пары целых чисел и записывается
        на отдельной строке. Каждая пара чисел - индексы элементов, сумму которых вам надо найти.

        Выведите на экран сумму этих двух элементов для каждого запроса на каждой строке по отдельности.
        Если вдруг индекс индекс оказался вне пределов диапазона от 0 до n - 1, то выведите на экран слово Error.
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }

        int num_requests = sc.nextInt();

        for (int i = 0; i < num_requests; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((a > n-1)|| (b>n-1) )
            {
                System.out.println("Error");
                continue;
            }

            System.out.println(array[a]+array[b]);

        }

    }

    static void create_coherent_array()
    {
        Scanner sc = new Scanner(System.in);
        // ваш код
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        for (int j : array) System.out.print(j + " ");
    }

    static void which_numbers_more(){
        /*
        Маша занималась обработкой больших и не очень больших данных. На её компьютер время от времени приходили числа и она хотела понять, каких больше: кратных 3, или отрицательных. Помогите Маше с её вопросом.

        Вводятся целые числа до тех пор, пока не будет введён 0.

        Если больше чисел, кратных 3, то выведите "333", если больше отрицательных чисел, то выведите "negative", если их одинаковое количество, то выведите "Equal".
         */

        boolean status = true;
        short three = 0;
        short negative = 0;
        int x;


        while (status)
        {
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();

            if (x%3==0)
                three++;
            if (x<0)
                negative++;
            if (x==0)
                status = false;
        }

        if (negative == three)
            System.out.println("Equal");

        System.out.println((negative>three)?"negative":"333");

    }

    static void find_code_mistake_test(){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean pin_code_coincided = true;

        while (true){
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            counter++;

            if(correct.equals(vasya)){
                System.out.println("CORRECT");
                break;
            }

            System.out.println("INCORRECT " + counter);

            if (counter >= 5){
                System.out.println("Error");
            }
        }

    }

    static void numbers_via_one()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(b>=a)
        {
            System.out.println(b);
            b -=2;
        }
    }

    static void point_in_area()
    {
        //Вводятся два действительных числа: координаты точки на плоскости. Определите, принадлежит ли эта точка закрашенной области.
        // Выведите ответ на задачу в формате "Yes"/"No".
        // y = x/2, y = x^2-2x-3

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (((x/2)>y) && (x*x-2*x-3)<y)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

    void sum_of_digits()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;


        while (a != 0){

            sum += a%10;
            a /= 10;

        }

        System.out.println(sum);
        sc.close();
    }
    static void staff_stats()
    {
        /*
        Вводится число n. Затем 2*n строк. Каждая пара строк -
        имя человека и его профессия. Определите, сотрудников
        какой профессии больше всего. Выведите на экран это
        количество, профессию и их имена на экран в том же
        порядке, в котором они вводились. Гарантируется, что
        будет введено не более 100 сотрудников.
         */
        Scanner sc = new Scanner(System.in);
        Short n = sc.nextShort();

        HashMap<String, ArrayList<String>> stats = new HashMap<>();

        String debug = sc.nextLine(); //nextline reads first line it hasnt read before, so number n goes into name. FIXED
        for (int i = 1; i < n+1; i++)
        {
            String name = sc.nextLine();

            String job = sc.nextLine();

            if (!stats.containsKey(job))
            {
//                System.out.printf(" NEW JOB %s !| ADDING INTO %s\n", job, name);
                ArrayList<String> temp_list = new ArrayList<>();
                temp_list.add(name);
                stats.put(job,temp_list);
            }
            else stats.get(job).add(name);
        }

        int max = 0;
        String max_job_name = "";


        for (String job_name: stats.keySet())
        {
            if (stats.get(job_name).size() > max)
            {
                max = stats.get(job_name).size();
                max_job_name = job_name;
            }
        }
//        System.out.println(stats.size());
//        System.out.println(stats.keySet());
//        System.out.println(stats.values());

        System.out.println(max);
        System.out.println(max_job_name);
        for (String employee_name: stats.get(max_job_name))
            System.out.println(employee_name);


    }

    static void occurrencesCount()
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine().toLowerCase();
        String symbol = sc.nextLine().toLowerCase();
        int count = x.split(symbol).length;

        if (x.endsWith(symbol)) count++;
        if (x.startsWith(symbol)) count++;
        System.out.println(count-1);


    }

class Functions {
    public static void main(String[] args) throws Exception
    {

    }

    static void read_txt(String path) throws Exception {

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();


    }
    static void first_steps_dict()
    {

        HashMap <String, String> human = new HashMap<>();
        human.put("name", "Wlad");
        human.put("secondName", "Kowalew");
        human.put("age", "25");
        human.put("proffesion", "teacher");

        System.out.println("-----------------------------");
        System.out.println("Size: " + human.size());
        System.out.println(human.getOrDefault("age", "None"));
        System.out.println(human.getOrDefault("Rge", "None"));
        System.out.println("-----------------------------");

        for (String key: human.keySet()){
            System.out.println(key + ": " + human.get(key));
        }
        human.remove("name");
        System.out.println("-----------------------------");
        for (String key: human.keySet()){
            System.out.println(key + ": " + human.get(key));
        }
    }
    static void write_odd_numbers_txt(int upper_limit) throws Exception {


        try {
            File myfile = new File("D:OneDrive\\\\Git\\\\Java\\\\Learning\\\\Beginning\\\\src\\\\file1.txt");

            FileWriter fw = new FileWriter(myfile, true);

            StringBuilder text = new StringBuilder();

            for (int i = 0; i < upper_limit; i++)
            {
                text.append("\n");
                text.append(i);
            }

            fw.write(text.toString());
            fw.append("end");

//          fw.flush();
            fw.close();

        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    static double pow(double a, int n) {

        if (n % 2 == 0) {
            return pow(a * a, n / 2);
        }
        else if (n==1) return a;
        else {
            return a*pow(a * a, (n - 1) / 2);
        }

    }
    static void first_list()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hey");
        list.add("That");
        list.add("Is");
        list.add("Incredible");
        for (String elem : list)
        {
            System.out.printf("%s\s", elem);
        }
    }
    static void favourite_word_counter()
    {
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        char y = sc.nextLine().charAt(0);

        int count_1 = 0;
        int count_2 = 0;
        String text =sc.nextLine();
        String[] array = text.split(" ");
        for (String s : array) {
            char first =  s.toLowerCase().charAt(0);
            char last =  s.toLowerCase().charAt(s.length()-1);

            if ((first == x) && (last == y)) count_1++ ;
            if ((first == y) && (last == x)) count_2++ ;


        }
        System.out.println(count_1);
        System.out.println(count_2);
    }
    }


}


