package Book;

public class BookCopy {
    //composition =inside a class reference to another class
    private final BookDetails bookDetails;
    private final int id;
    public BookCopy(BookDetails bookDetails,int id)
    {
        this.bookDetails=bookDetails;
        this.id=id;
    }
}
