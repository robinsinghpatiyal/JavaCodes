package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class FuelConsumed {
    public static void main(String[] args){
        //creaitng object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking two inputs and storing them in int datatype variables
        System.out.println("Enter number of miles travelled:");
        float one = sc.nextFloat();
        System.out.println("Enter the gallons of fuel used:");
        float two = sc.nextFloat();

        //priting result
        if(two==0){
            System.out.println("The fuel cant be 0");
        }
        else {
            //storing div in float type variable
            float ans = (one/two);
            System.out.println("Miles per gallon: " + ans);
        }
    }
}
