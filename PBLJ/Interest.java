package PBLJ;
import java.util.*;
public class Interest{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String Gender = sc.next();
        int age = sc.nextInt();
            if(Gender.equals("Male") || Gender.equals("Female"))
            {
                if(age>1 && age<=100)
                {
                    if (Gender.equals("Female") && (age >= 1 && age <= 58)) {
                        System.out.println("Interest == 8.2%");
                    } else if (Gender.equals("Female") && (age >= 59 && age <= 100)) {
                        System.out.println("Interest == 9.2%");
                    } else if (Gender.equals("Male") && (age >= 1 && age <= 58)) {
                        System.out.println("Interest == 8.4%");
                    } else if (Gender.equals("Male") && (age >= 59 && age <= 100)) {
                        System.out.println("Interest == 10.5%");
                    }
                }
        }
    }
}