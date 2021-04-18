package MultipleExercise;

//importing scanner to take input
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args){
        //creaitng object of scanner to take inputs
        Scanner sc = new Scanner(System.in);
        //taking the input and storing it in variable of string type
        System.out.println("Enter name");
        String name="";
        name+=sc.nextLine();

        System.out.println("Enter birthdate");
        String bd="";
        bd+=sc.nextLine();

        System.out.println("Enter interests");
        String intr="";
        intr+=sc.nextLine();

        System.out.println("Enter favourite books");
        String book="";
        book+=sc.nextLine();

        System.out.println("Enter favourite movies");
        String mov="";
        mov+=sc.nextLine();
        //this will take input with spaces

        //displaying
        System.out.println("Name: "+name+"\nBirthday: "+bd+"\nInterests: "+intr+"\nFavorite Books: "+book+"\nFavorite Movies: "+mov);
    }
}
