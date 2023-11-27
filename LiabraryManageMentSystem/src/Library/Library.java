package Library;

import Book.BookCopy;
import Book.BookDetails;
import DataAccessor.DBAccessor;
import DataAccessor.Results;
import DataAccessor.ResultsConverter;
import User.Member;


import java.util.List;


public class Library {



    private final DBAccessor dbAccessor;
    public Library(DBAccessor dbAccessor) {
        this.dbAccessor=dbAccessor;
    }

    public void addBookCopy(BookCopy bookCopy)
    {
        if(bookCopy==null)
        {

       }
        dbAccessor.insertBookCopy(bookCopy);

    }
    public void deleteBookCopy(BookCopy bookCopy)
    {
//check if bookcopy is Available;
        if(dbAccessor.isCopyAvailable(bookCopy))
        {
            dbAccessor.deleteBookCopy(bookCopy);
        }
    }
    public void blockMember(Member member)
    {

    }
    public void issueBook(BookCopy bookCopy,Member member)
    {

    }
    public void submitBook(BookCopy bookCopy,Member member)
    {

    }
    public Member getBorrwer(BookCopy bookCopy)
    {
       Results results= dbAccessor.getBorrower(bookCopy);
        return  ResultsConverter.convertToMember(results);

    }
    public List<BookCopy>getBorrowedBooks(Member member)
    {
        return  null;

    }

}
