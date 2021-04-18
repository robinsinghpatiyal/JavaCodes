import java.util.Scanner; //importing scanner library to take inputs from user

public class Quiz2Coding{

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);//scan object will be used to take inputs
        int score =0;
        System.out.print("Enter your course score (0-100): ");
        score = scan.nextInt(); //nextInt is used to take integer inputs
        if(score<50){
            System.out.println("fail");
            System.out.println("no prerequisite credit");
        }
        else if(score>=50 && score < 60){ //this will only execute if both condtions are true becaue of and &&
            System.out.println("pass \nno prerequisite credit");//"\n" is used to inset new line
        }
        else {
            System.out.println("pass \ncredit for prerequisite");
        }
    }
}