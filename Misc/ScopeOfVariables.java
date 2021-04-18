public class ScopeOfVariables {
    final  int ADD = 15;
    public static void main(String []args){
   //     final int ADD = 5;
        double x = 10;
        System.out.print("In main before updating - ");
        System.out.println("x = " + x ) ;  //just printing out value of x that is 10
        update(x); // calling update method
        System.out.print("In main after updating - ");
        System.out.println("x = " + x) ; //will give us 15
    }

    public static void update (double x){
       final int ADD = 5;
        System.out.print("In update before updating - ");
        System.out.println("x = " + x ) ; //printing the initial value of x[0] that is 10
        x += ADD; // x[0]+ = Add gives 15 because x[0] = 10 +5 => x[0] =15
        System.out.print("In update after updating - ");
        System.out.println("x = " + x ) ; // prints 15 because of previous operation

    }
}