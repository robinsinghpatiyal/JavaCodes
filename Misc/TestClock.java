import java.util.Scanner;
public class TestClock {
    public static void main(String[] arg){
        ClockDisplay clock = new ClockDisplay();
        Scanner sc = new Scanner(System.in);

        int hrs,mins;
        int a =0;
        while(a==0) {
            System.out.println("Enter the hours and minutes respectively: ");
            hrs = sc.nextInt();
            mins = sc.nextInt();
            clock.setTime(hrs, mins);
            System.out.println(clock.getTime());

            System.out.println("Enter 0 if you want to add another input or 1 to exit: ");
            a = sc.nextInt();
        }

        /*
        //Hardcoded input so that it is easy to understand
        clock.setTime(21,10);
        System.out.println(clock.getTime());
        clock.setTime(20,38);
        System.out.println(clock.getTime());

        clock.setTime(01,10);
        System.out.println(clock.getTime());

        clock.setTime(0,15);
        System.out.println(clock.getTime());

         */
    }
}
