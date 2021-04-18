package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class NumOfSec {
    public static void main(String[] args){
        //creaitng object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking seconds input and storing them in int datatype variable
        System.out.println("Enter number of seconds:");
        int sec = sc.nextInt();

        //storing ans in double type variable
        System.out.println(sec + " is equivalent to: ");
        int hrs = sec/3600;
        sec = sec%3600;

        int min = sec/60;
        sec = sec%60;

        //priting result
        System.out.println(hrs+" hours"+"\n"+min+" minutes\n"+sec+" seconds");

    }
}
