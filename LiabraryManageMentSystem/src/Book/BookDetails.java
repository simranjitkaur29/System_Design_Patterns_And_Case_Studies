package Book;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;

public class BookDetails {
    private final String name;
    private final Date publicationDate;
    private final List<String>author;

    public BookDetails(String name, Date publicationDate, List<String> authors) {
        this.name=name;
        this.publicationDate=publicationDate;
        this.author=authors;

    }
}
