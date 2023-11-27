package Searcher;
import Book.BookCopy;
import DataAccessor.DBAccessor;
import DataAccessor.Results;
import DataAccessor.ResultsConverter;

import java.util.List;

public class NameBaseBookSearcher implements BookSearcher
{
    private final String bookName;
    private final DBAccessor dbAccessor;
    public NameBaseBookSearcher(String bookName)
    {
        this.bookName = bookName;
        this.dbAccessor=new DBAccessor();
    }
    public List<BookCopy> search()
    {
       Results results= dbAccessor.getBookWithName(bookName);
       return ResultsConverter.convertToBookCopies(results);

    }




}
