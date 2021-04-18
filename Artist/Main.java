package Artist;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //creting scanner object for taking inputs
        Scanner sc = new Scanner(System.in);
        //taking name with spaces as input;
        String name =" ";
        name+=sc.nextLine();

        //taking year born and death year as input
        int born = sc.nextInt();
        int death = sc.nextInt();

        sc.nextLine();//the call to nextLine() first finishes the line where the user enters the number of students.
        //  Because nextInt() reads only one int and does not finish the line.
       // So adding an extra nextLine() statement would solve this problem.
        //You can remove this if your program misbeaves


        //taking the title as input
        String book=" ";
        book+=sc.nextLine();

        //taking yearcreated as input;

        int year = sc.nextInt();

        //creating the object of Artist class
        Artist obj = new Artist();

        //creating the object of Artwork class
        Artwork obj2 = new Artwork();

        //passing the values and showing output;

        obj.get(name,born,death);
        obj.printInfo();

        obj2.get(book,year);
        obj2.printInfo();
    }
}
