public class Book {
    String bookName;
    String authorName;
    double price;

    Book(){
        System.out.println("Title: Unknown");
        System.out.println("Author: Unknown");
        System.out.println("Price: 0.0");
    }

    Book(String bookName, String authorName, double price){
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }
    void displayditeals(){
        System.out.println("Ttile : " + bookName );
        System.out.println("Author : " + authorName);
        System.out.println("Price : " + price);
    }
}
