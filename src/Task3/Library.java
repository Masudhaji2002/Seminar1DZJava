package Task3;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }
    public void addBook(Book book){
        catalog.add(book);
    }
    public void removeBook(Book book){
        catalog.remove(book);
    }

    public void displayAvailableBooks(){
        System.out.println("Доступные книги в библиотеке:");
        for (Book book : catalog) {
            if (book.isAvailable()){
                System.out.println(book.getTitle() + "-" + book.getAuthor());
            }
        }
    }

    public void searchByAuthor(String author){
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle());
            }
        }
    }
}
