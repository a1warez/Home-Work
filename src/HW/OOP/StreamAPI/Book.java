package HW.OOP.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Book {
    private final int id;
    private String title;
    private String author;
    private boolean isAvailable;
    private static List<Book> bookList;


    /**
     * Консструкток класса Book
     * @param id значение id
     * @param title название Book
     * @param author автор Book
     * @param isAvailable boolean значение на нохождение в Library
     */
    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    /**
     * добавление Book в список
     * @param b Book
     */
    public static void bookListAdd(Book b){
        if(bookList == null){
            bookList = new ArrayList<>();
        }
        bookList.add(b);

    }

    /**
     *
     * @return возращяет список Book
     */
    public static List<Book> getBookList() {
        return bookList;
    }

    /**
     *
     * @return возращяет id Book
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param books Book
     * @param o Integer
     * @return Book
     */
    public static Book getIdBook(Map<Integer, Book> books, Integer o){
        return books.get(o);
    }

    /**
     *
     * @return возращяет название Book
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return возращяет автора Book
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @return возращяет естли Book в Library
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     *
     * @return Override toString
     */
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
