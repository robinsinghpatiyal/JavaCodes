package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        //creaitng object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking three inputs and storing them in int datatype variables
        System.out.println("Enter first number:");
        int one = sc.nextInt();
        System.out.println("Enter second number:");
        int two = sc.nextInt();
        System.out.println("Enter third number:");
        int three = sc.nextInt();

        //storing avg in double type variable
        double ans = (one+two+three)/3;

        //priting result
        System.out.println("The average of the numbers is: "+ans);

    }
}
/*
    public static void main(String[] args){

    }
 */