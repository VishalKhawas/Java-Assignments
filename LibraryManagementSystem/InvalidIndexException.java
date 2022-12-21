package LibraryManagementSystem;

public class InvalidIndexException extends Exception{
    public InvalidIndexException(Exception e){
        super(e);
    }
    public InvalidIndexException(String s){
        super(s);
    }
}
