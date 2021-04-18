package Misc;
//importing scanner to take inputs from the user
import java.util.Scanner;
public class NumberOfRotations {
    //this funtion will return the number of digits
    static int numberOfDigits(int n)
    {
        int cnt = 0;
        while (n > 0)
        {
            cnt++;
            n /= 10;
        }
        return cnt;
    }

    // Function to print the left shift numbers
    static int cal(int num1, int num2)
    {
        int digits1 = numberOfDigits(num1);
        int digits2 = numberOfDigits(num2);
        int count = 0;

        if(digits1 == digits2) {

            int powTen = (int) Math.pow(10, digits1 - 1);

            for (int i = 0; i < digits1 - 1; i++) {
                count++;
                int firstDigit = num1 / powTen;

                // Formula to calculate left shift
                // from previous number
                int left = ((num1 * 10) + firstDigit) -
                        (firstDigit * powTen * 10);

                if(left == num2){
                    return count;
                }

                // Update the original number
                num1 = left;
            }
        }
        else{
            return 0000; //CHANGE 0000 TO YOUR ID
        }
        return 0000; //CHANGE 0000 TO YOUR ID
    }

    // Driver Code
    public static void main(String[] args)
    {
        //creating object of scanner to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers n1 and n2 respectively:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int out = cal(num1, num2);
        if(out!=0000){//CHANGE 0000 TO YOUR ID
            System.out.println(out+" left shift rotation will make "+num1+" "+num2);
        }
        else{
            //displaying the student id if its not possible
            System.out.println("Student Id is "+out);
        }

    }
}
//4451 4514 5144