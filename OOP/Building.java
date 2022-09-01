package OOP;

abstract public class Building
{
    int age;
    String adress, creator, name;
    boolean isHeritage;
    boolean is_closed = false;

    void close()
    {
        if (is_closed) System.out.println("already closed");
        is_closed = true;
        System.out.println("Closed");
    }
    void open()
    {
        if (!is_closed) System.out.println("already opened");
        is_closed = false;
        System.out.println("Opened");
    }
}

class Library extends Building
{
    String worker;


    Library(String librarian, String adress){
        this.worker = librarian;
        this.adress = adress;
    }
    Library(String name, int age, String creator,
            String librarian, String adress)
    {
        this.name = name;
        this.age = age;
        this.creator = creator;
        this.worker = librarian;

        String adress1 = this.adress;

        this.adress = adress;

    }




    @Override
    void open()
    {super.open();}

    @Override
    void close() {
        super.close();
    }


}