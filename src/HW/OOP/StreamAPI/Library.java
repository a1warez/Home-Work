package HW.OOP.StreamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static HW.OOP.StreamAPI.Book.getIdBook;

public class Library {
    private static Book book;
    private static Integer bookID;
    static Map<Integer, Book> books;

    /**
     * Находит Book по id
     * @param o Integer
     * @return Book
     */
    public static Book getBookID(Integer o) {
        if (o == null) {}
        if (book == null) {}
        Book idBook = getIdBook(books, o);
        return idBook;
    }

    /**
     *
     * @return Map<Integer, Book>
     */
    public static Map<Integer, Book> getBooks() {
        return books;
    }

    /**
     *
     * @return Book с сортеровкой по title
     */
    public static List<Book> bookListSortedName() {
        return books.values()
                .stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .toList();
    }

    /**
     *
     * @param bookList лист книг
     * @param b значение boolean нахождения в Library
     * @return Book доступные к взятию
     */
    public static boolean getIsAvailableBook(List<Book> bookList, boolean b) {
        Map<Boolean, List<Book>> booTks = bookList.stream()
                .collect(Collectors.partitioningBy(Book::isAvailable));
        if (b == true) {
            System.out.println("Книги доступны к взятию " + booTks.get(b));
            return true;
        }else {
            System.out.println("Книги не доступны к взятию " + booTks.get(b));
            return false;
        }

    }

    /**
     *
     * @return возращяет кол-во всех книг
     */
    public static int numberBooks(){
        return books.size();
    }

    /**
     *
     * @param b значение boolean нахождения в Library
     * @return возвращяет long книг по isAvailable
     */
    public static long numberBooksAccess(boolean b) {
        long result;
        long count = 0;
        if (b == true) {
            count = books.values()
                    .stream()
                    .filter(Book::isAvailable)
                    .count();
            return count;
        }else if (b == false) {
            result = books.values()
                    .stream()
                    .filter(Book::isAvailable)
                    .count();
            count = books.size() - result;
            return count;
        }
        return count;
    }

    /**
     *
     * @return список авторов без дубликатов
     */
    public static List<String> author(){
        return books.values()
                .stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .map(Book::getAuthor)
                .distinct()
                .toList();
    }

    /**
     * Добавление Book в Map где ключ их id
     * @param book Book
     */
    public static void add(Book book) {
        if (books == null) {
            books = new HashMap<>();
        }
        int g = book.getId();
        books.put(g, book);
    }

    /**
     *
     * @return возвращяет списки по true и false
     */
    public static Map<Boolean, List<Book>> getPartitioningByIsAvailable() {
        Map<Boolean, List<Book>> f = books.values()
                .stream()
                .collect(Collectors.partitioningBy(Book::isAvailable));
        return f;
    }

    /**
     *
     * @return книги группируются по авторам
     */
    public static Map<String, List<Book>> getGroupingByAuthor(){
      return books.values()
              .stream()
              .collect(Collectors.groupingBy(Book::getAuthor));
    }

    /**
     * v2
     * @param o Integer id Book
     * @return находит Book по id
     */
    public static Book getBookIDv2(Integer o) {
        if (!books.containsKey(o)) {
            System.out.println("Книга с id " + o + " не найдена");
        }
        return books.get(o);
    }
}
