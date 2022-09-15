package prac3.task3;
public class Book {
    private String author, name;
    private int numberOfPages, date;

    public Book(String author, String name, int numberOfPages, int date) {
        this.author = author;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.date = date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", date=" + date +
                '}';
    }
}