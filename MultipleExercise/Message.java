package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class Message {
    public static void main(String[] args){
        //creaitng object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking the input and storing it in variable of string type
        System.out.println("What is the message?");
        String inp="";
        inp+=sc.nextLine();
        //this will take input with spaces

        //displaying
        System.out.println("The message is \""+inp+"\"");
    }
}
