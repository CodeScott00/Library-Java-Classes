import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Borrower> BookList;


    public Borrower(String name){
        this.name = name;
        this.BookList = new ArrayList<>();
    }
}
