package Artist;

public class Artwork {
    String title;
    int yearCreated;

    //default Constructor initializing default values
    Artwork(){
        this.title="None";
        this.yearCreated=0;
    }

    //get method will take input and update the class variables
    void get(String t, int year){
        title = t;
        yearCreated = year;
    }

    //this will print the info
    void printInfo(){
        System.out.print("Title: "+title+", "+yearCreated);
    }

}
