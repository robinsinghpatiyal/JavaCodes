package Book;
import java.util.Scanner; //importing scanner for taking input
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book obj[] = new Book[3]; //creating array of 3 objects for easy input and output

        //taking input for 3 objects of book
        for (int i = 0; i < 3; i++) {
            int num = i+1;
            System.out.println("\nEnter the Title for the book: "+ num + ": ");
            System.out.print("Enter the Title of the book: ");
            String title = sc.next();
            System.out.print("Enter the Author of the book: ");
            String author = sc.next();
            System.out.print("Enter the Publication Year of the book: ");
            int publicationYear = sc.nextInt();
            System.out.print("Enter the number of pages in the book: ");
            int numberOfPages = sc.nextInt();
            System.out.print("Enter the Price of the book: ");
            double price = sc.nextDouble();
            obj[i] = new Book(title,author,publicationYear,numberOfPages,price); // assigning values to the object
        }
        //displaying the age fo book
        for(int i =0;i<3;i++){
            System.out.println("\nThe age of Book "+obj[i].title+" is "+ obj[i].getAge());
        }
        //displauing the information of books
        for(int i=0;i<3;i++){
            System.out.println("\nThe Information of Book "+obj[i].title+" is given below ");
            obj[i].displayInfo();
            System.out.println("\n");
        }

    }
}
/*
Geology
Ross
2001
3900
23
Acting
Joey
2020
400
20
Cooking
Monica
2011
4000
10
 */
