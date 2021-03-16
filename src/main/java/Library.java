import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.bookCollection = new ArrayList<>();
    }


    public int countBooks() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (countBooks() < this.capacity) {
            this.bookCollection.add(book);
        }

    }
}




