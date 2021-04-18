package PassValidator;

public class Truck extends Vehicle{
    //two data members
    int weight;
    int noOfWheels;

    //creating an object of Vehicle class
    Vehicle obj = new Vehicle();

    //construtor to initialize the data
    Truck(int w, int n){
        this.weight = w;
        this.noOfWheels = n;
    }
    void print(){
        System.out.println(weight+ " - "+ noOfWheels);
        //calling print of vehicle
        obj.print();
    }
}
