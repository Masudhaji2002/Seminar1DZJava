package Task3;

public class Main {
    public static void main(String[] args){
        Library library = new Library();
        Book book1 = new Book("Незнайка на Луне", "Н.Н. Носов");
        Book  book2 = new Book("Гарри Поттер и узник Азкабана", "Джоан Роулинг");
        Book book3 = new Book("Конек Горбунек", "П.П. Ершов");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayAvailableBooks();
        library.searchByAuthor("Н.Н. Носов");
    }
}
