package HW.OOP;

public class Book {
    private String nameBook;
    private int year;
    private Author author;
    public Book() {
    }
    public Book(String nameBook, int year, Author author) {
        this.nameBook = nameBook;
        this.year = year;
        this.author = author;
    }
    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    private String getInfo() {
        return nameBook + " " + year;
    }
    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", year=" + year + " " +
                author +
                '}';
    }
    public void printBook() {
        System.out.println(this);
    }
}
