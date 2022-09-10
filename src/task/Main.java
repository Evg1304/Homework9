package task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var author1 = new Author("Author1", "Author1");
        var author2 = new Author("Author2", "Author2");
        var book1 = new Book("Book1", author1, 1923);
        var book2 = new Book("Book2", author2, 1845);
        book1.setPublicationYear(LocalDate.now().getYear());

        System.out.println(book1);
        System.out.println(author1);
    }
}
