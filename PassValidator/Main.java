package PassValidator;

public class Main {
    public static void main(String[] args){
        //obj of Vehicle class to pass parameters
        Vehicle objVeh = new Vehicle("Merc",2001);

        //obj of Truck class to do the all task
        Truck objTru = new Truck(200,4);
        objTru.print();

    }
}
