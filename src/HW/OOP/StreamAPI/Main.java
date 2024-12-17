package HW.OOP.StreamAPI;

public class Main {
    public static void main(String[] args) {
        Book book4 = new Book(4,"Eugene Onegin","Александр Пушкин", false);
        Book book1 = new Book(1,"Mumu","Иван Тургенев", true);
        Book book2 = new Book(2,"Metro 2033","Роман Глуховского", false);
        Book book5 = new Book(5,"Morphine","Михаил Булгаков", false);
        Book book3 = new Book(3,"The Queen of Spades","Александр Пушкин", true);

        Library.add(book1);
        Library.add(book2);
        Library.add(book3);
        Library.add(book4);
        Library.add(book5);
        System.out.println(Library.getBooks());

        System.out.println(Library.getBookID(2));

        Book.bookListAdd(book1);
        Book.bookListAdd(book2);
        Book.bookListAdd(book3);
        Book.bookListAdd(book4);
        Book.bookListAdd(book5);
        System.out.println(Library.getIsAvailableBook(Book.getBookList(), true));

        System.out.println(Library.numberBooks());
        System.out.println(Library.numberBooksAccess(false));

        System.out.println(Library.bookListSortedName());
        System.out.println(Library.author());

        System.out.println(Library.getPartitioningByIsAvailable());
        System.out.println(Library.getGroupingByAuthor());

        System.out.println(Library.getBookIDv2(1));
    }
}
