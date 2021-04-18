package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args){
        //creaitng object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking mile input in float type variable
        System.out.println("Enter the number of miles:");
        float mile = sc.nextInt();

        //checking if miles are greater than 0 or not
        if(mile<0){
            System.out.println("Please Enter a value greater than 0");
        }
        else {
            //storing km in double type variable
            float km = (float)mile * (float)1.60935;
            //printing result
            System.out.println("The number of KM is: " + km);
        }

    }
}
