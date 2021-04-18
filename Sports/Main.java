package Sports;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Creating Sports!");
        Football football = new Football("Football", 11);
        System.out.println(football);
        BasketBall baseball = new BasketBall("Baketball", 9);
        System.out.println(baseball);
        Cricket cricket = new Cricket("Cricket", 9);
        System.out.println(cricket);
        Tennis tennis = new Tennis("Tennis", 2);
        System.out.println(tennis);
        Shotput badminton = new Shotput("Shotput", 1);
        System.out.println(badminton);
    }
}
/*
You can also take input from teh user of game name and team size by using Scanner
import java.util.*
        Scanner sc = new Scanner(System.in)
        String name = sc.next();
        int size = sc.nextInt();

You can now pass these into the objects
        BasketBall baseball = new BasketBall(name, size);
        System.out.println(baseball);

 */
