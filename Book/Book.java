package Book;
public class Book {
    String title;
    String author;
    int publicationYear;
    int numberOfPages;
    double price;
    //default constructor if no value is provided to the vars
    Book(){
        title = "No Information Available";
        author = "No Information Available";
        publicationYear = 0;
        numberOfPages = 0;
        price = 0;
    }
    //parameterised constructor for paassing th values
    Book(String title, String author, int publicationYear, int numberOfPages, double price){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }
    //will find the current age of book by subtracting the publication year from 2021
    int getAge(){
       int age = 2021 - publicationYear;
        return age;
    }
    //will display the information of books based on the objects
    void displayInfo(){
        System.out.println("Title of Book: "+title+"\nName of Author: "+author+
                "\n Publication Year: "+publicationYear+"\nNumber Of Pages: "+numberOfPages+
                "\nPrice: "+price);

    }
}
