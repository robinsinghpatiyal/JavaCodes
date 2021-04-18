package PBLJ;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int age = sc.nextInt();

        if (age < 18 || age >= 60)
            throw new InvalidAgeException();

        System.out.println("Name: " + name + " Age: " + age);
    }

}