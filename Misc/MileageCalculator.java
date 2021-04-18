import java.util.Scanner; //importing scanner

public class MileageCalculator {
    public static void main(String[] args){
        int loop = 0;
        while (loop==0) {
            Scanner sc = new Scanner(System.in); //Scanner is used to get input from from user by creating object
            System.out.print("Enter the miles travelled : ");
            int miles_travelled = sc.nextInt();
            System.out.print("Enter the gallons needed : ");
            int gallons_needed = sc.nextInt();
            double gas_mileage = miles_travelled / gallons_needed; // Mileage = Miles travelled/gallons needed
            System.out.println("The Gas Mileage of the car is : " + gas_mileage + "mpg");
            System.out.print("Enter 0 if you want to calculate mileage again and 1 to exit the program: ");
            loop = sc.nextInt();
        }
    }

}
