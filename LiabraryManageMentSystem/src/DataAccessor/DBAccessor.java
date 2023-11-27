package DataAccessor;

import Book.BookCopy;

import java.lang.reflect.Member;


public class DBAccessor {

    public Results getBookWithName(String bookName)
    {
        return null;

    }

    public Results getBookWithAuthorName(String bookName)
    {
        return null;

    }
    public Results getMemberWithName(String memberName)
    {
        return null;

    }
    public void insertBookCopy(BookCopy bookCopy)
    {

    }
    public void deleteBookCopy(BookCopy bookCopy)
    {


    }
    public void markAsBlocked(Member member)
    {

    }
    public void issueBookCopyToMember(BookCopy bookCopy,Member member)
    {

    }
    public void submitBookCopyFromMember(BookCopy bookCopy,Member member)
    {

    }
    public boolean isCopyAvailable(BookCopy bookCopy)
    {
       return true;

    }
    public Results getBorrower(BookCopy bookCopy)
    {
        return null;

    }
    public Results getBorrowedBooks(Member member)
    {
        return null;

    }


}
