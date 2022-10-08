import java.io.*;
import java.util.Scanner;
class Book {
    String title , author;
    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }
}
public class Exam13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book [] book = new Book[2] ;
        for (int i = 0 ; i < book.length ; i++){
            System.out.println("제목 : ");
            String title = in.nextLine();
            System.out.println("저자 : ");
            String author = in.nextLine();
            book[i] = new Book(title, author);
        }
        for(int i = 0 ; i< book.length; i++){
            System.out.println(book[i].title + book[i].author);
        }
        }
    }



