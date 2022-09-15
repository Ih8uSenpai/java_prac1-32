package prac2.task3;
public class Book {
    String author;
    String name;
    int numberOfPages;
    public Book(String author, String name, int pages){
        this.author = author;
        this.name = name;
        this.numberOfPages = pages;
    }

    @Override
    public String toString() {
        return "Author: " + this.author + "\n" + "Name: " + this.name + "\n" + "Number of pages: " + this.numberOfPages;
    }
}