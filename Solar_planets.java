import java.util.ArrayList;

public class Solar_planets {
    public static void main(String[] args){
        System.out.println(getPlanetGasByOrder(4));
        System.out.println(getPlanetGasByOrder(3));
        System.out.println(getPlanetGasByOrder(7));
        System.out.println(getPlanetGasByOrder(8));

    }

    public static ArrayList <String> getPlanetGasByOrder(int order)
    {
        ArrayList <String> Atmosphere = new ArrayList<>();

        switch (order)
        {
        case 1: 
            Atmosphere.add("No atmosphere");
            break;
        case 2:
            Atmosphere.add("Carbon dioxide");
            Atmosphere.add("Nitrogen");
            break;
        case 3:
            Atmosphere.add("Carbon dioxide");
            Atmosphere.add("Oxygen");
            Atmosphere.add("Nitrogen");
            break;
        case 4:
            Atmosphere.add("Carbon dioxide");
            break;
        case 5:
            Atmosphere.add("Hydrogen");
            break;
        case 6:
            Atmosphere.add("Hydrogen");
            break;
        case 7:
            Atmosphere.add("Methane");
            Atmosphere.add("Hydrogen");
            Atmosphere.add("Helium");
            break;

        default:
            System.out.println("We have got only 7 planets on Solar System so far.");
            break;    
        }
        return Atmosphere;
    }
}
