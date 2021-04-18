package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class FindSec {
    public static void main(String[] args){
        //creaitng object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking three inputs and storing them in int datatype variables
        System.out.println("Enter number of hours:");
        int hrs = sc.nextInt();
        System.out.println("Enter number of minutes:");
        int mins = sc.nextInt();
        System.out.println("Enter number of seconds:");
        int sec = sc.nextInt();

        //storing ans in double type variable

        int ans = (hrs*3600)+(mins*60)+sec;

        //priting result
        System.out.println("The average of the numbers is: "+ans);

    }
}
