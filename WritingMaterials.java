
class Tool
{
    int price;
    String color, name;

    public Tool(){}
    public Tool(String name, String color){
        this.color = color;
        this.name = name;

    }

    public Tool(String name, int price){
        this.price = price;
        this.name = name;
        this.color = "No Color";

    }

    @Override
    public String toString(){
        return this.color + this.name + "Цена: " + this.price;}

    public void display(){
        System.out.printf("Название: %s Цвет: %s," +
                " Цена: %d", this.name, this.color, this.price);}
}

class WritingMaterials extends Tool
{

    // test
    /*
    WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isDraw());
     */

    private String name, color;
    private int price;
    private double length;
    private boolean draw;
    static int counter;


    public WritingMaterials(){super();}

    //Constructors
    public WritingMaterials(String name, String color){
        super(name,color);
    }

    public WritingMaterials(String name, int price){
        super(name, price);
    }

    public WritingMaterials(int price ,double length,boolean does_it_draw){
        this.price = price;
        this.length = length;
        this.color = "No Color";
        this.name = "No Name";


    }

    public WritingMaterials(String name, String color, int price, double length, boolean does_it_draw){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = does_it_draw;
    }
    //Getters and setters
    public int getPrice(){ return this.price;}
    public String getName(){ return this.name;}
    public double getLength(){ return this.length;}
    public String getColor(){ return this.color;}
    public boolean isDraw(){ return this.draw;}

    public void setName(String name){ this.name = name;}
    public void setPrice(int price){ this.price = price;}
    public void setColor(String color){ this.color = color;}
    public void setLength(double length){ this.length = length;}
    public void setDraw(boolean does_it_draw){ this.draw = does_it_draw;}

    // Public methods.

    public void display()
    {
        super.display();
        System.out.printf(" Длина: %f,  Умеет рисовать: %b", this.length,  this.draw);
    }

    public void replace_rod(String new_color)
    {
        this.color = new_color;
    }

    public void priceUp(int i)
    {
        this.price += i;
    }
    public void priceDown(int i)
    {
        this.price -= i;
    }
    public void draw()
    {
        if (this.draw)
        {
            System.out.printf("%s провёл линию. Её цвет - %s.",this.name, this.color);
        }
        else{
            System.out.printf(" %s не может ничего нарисовать.",this.name);
        }
    }

}



class Manager {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isDraw());

    }
}