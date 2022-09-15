package prac3.task3;
public class BookTest {
    public static void main(String [] args){
        Book book = new Book("Sui Ishida", "Tokyo Ghoul", 22833769, 2011);
        book.setNumberOfPages(100000);
        System.out.println(book);
    }
}