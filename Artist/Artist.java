package Artist;

public class Artist {
    String name;
    int born;
    int death;

    //default Constructor initializing default values
    Artist(){
        this.name = "None";
        this.born = 0;
        this.death = 0;
    }
    //get method will take input and update the class variables
    void get(String n, int b, int d){
        name = n;
        born = b;
        death = d;
    }
    //this will print the info
    void printInfo(){
        //check if the death year is -1 or not
        if(death!= -1) {
            System.out.println("Artist: " + name+" ("+born+"-"+death+")");
        }
        else{
            System.out.println("Artist: " + name+", born "+born);
        }
    }


}
