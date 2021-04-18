package PassValidator;

public class Vehicle {
    private String make;
    private int year;

    Vehicle(){}


    Vehicle(String m, int y){
        this.make = m;
        this.year = y;

    }

    void print(){
        System.out.println(make+" - "+ year);
    }
}
