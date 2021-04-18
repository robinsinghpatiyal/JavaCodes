package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        //creaitng object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking three inputs and storing them in int datatype variables
        System.out.println("Enter first number:");
        int one = sc.nextInt();
        System.out.println("Enter second number:");
        int two = sc.nextInt();

        //priting result
        System.out.println("The input fraction is: "+one+"/"+two);
        if(two==0){
            System.out.println("The quantity is undefined");
        }
        else {
            //storing div in float type variable
            float ans = ((float)one/(float)two);
            System.out.println("The decimal equivalence is: " + ans);
        }
    }
}
