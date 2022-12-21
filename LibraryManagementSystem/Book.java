package LibraryManagementSystem;

public class Book {
    private int BookId;
    private String name;
    private float price;
    private String Genre;
    private int quantity;

    public Book(int bid, String bname, float bprice, String bgenre, int quantity){
        BookId=bid;
        name=bname;
        price=bprice;
        Genre=bgenre;
        this.quantity=quantity;
    }

    public Book(){};

    public int getBookId() {
        return BookId;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getGenre() {
        return Genre;
    }
}
