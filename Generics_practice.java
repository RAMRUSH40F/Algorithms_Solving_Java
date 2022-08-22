

public class Generics_practice{

    public static void main(String[] args)
    {

//        Account<String> acc1 = new Account<String>("1235rwr", 5000);
//        Account<String> acc2 = new Account<String>("2373", 4300);
//        System.out.println(acc1.getId());
//        System.out.println(acc2.getId());

        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};

        // Before GENERICS-METHOD they apply a certain type.
        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }
}
interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account<T> implements Accountable<T>{

    private T id;
    private int sum;

    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

class Printer{

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}