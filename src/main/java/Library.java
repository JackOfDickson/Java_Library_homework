import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return stock.size();
    }

    public void addBook(Book book) {
        if (bookCount() < capacity) {
            stock.add(book);
        }
    }

}
