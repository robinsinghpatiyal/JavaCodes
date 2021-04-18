package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        //creating object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking fahrenheit input
        System.out.println("Please enter temperature in Fahrenheit:");
        //you can use int also
        float fahrenheit = sc.nextFloat();
        float celcius = (fahrenheit - (float) 32) * (float) (0.5556);
        System.out.println("The temperature "+fahrenheit+"F"+" is "+celcius+"C");
    }
}
