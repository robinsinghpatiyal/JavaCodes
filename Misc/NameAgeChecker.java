import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputName;
        inputName = scnr.next();
        int age;
        while (!inputName.equals("-1")) {

            try {
                age = scnr.nextInt();
            }
            catch (InputMismatchException e) {
                age = -1;
                scnr.nextLine(); //this for that extra input but will make no differnce in code
            }
            // age = scnr.nextInt(); you are taking age input which is not supposed to be taken
            //because in each loop we will take age input only once
            System.out.println(inputName + " " + (age + 1));
            inputName = scnr.next();
        }
    }
}