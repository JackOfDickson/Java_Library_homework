import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int collectionCount(){
        return collection.size();
    }

    public void addBook(Book book){
        collection.add(book);
    }

//    public void borrowBook(Library library, Book book){
//        for (int i=0; i < collectionCount(); i++){
//            if library.stock[i] === book;}
//        }
//    }
}
