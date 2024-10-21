package HW.OOP;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book("Война и мир", 1865, author);
        book.printBook();

        book.setNameBook("Анна Каренина");
        book.setYear(1875);
        System.out.println(book.getNameBook() + " " + book.getYear() + " " + author.getName() + " " + author.getSurname());

        System.out.println();

        Author author1 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Преступление и наказание", 1866, author1);
        book1.printBook();

        author1.setName("Александр");
        author1.setSurname("Пушкин");
        System.out.println(book1.getNameBook() + " " + book1.getYear() + " " + author1.getName() + " " + author1.getSurname());
    }
}
