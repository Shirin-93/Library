package org.yearup;

public class BookClass {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public BookClass(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo )
    {
        this.id = id;
        this.isbn= isbn;
        this.title= title;
        this.isCheckedOut= isCheckedOut;
        this.checkedOutTo= checkedOutTo;
    }
    //getters and setters
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id =id;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn =isbn;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }

    public boolean getisCheckedOut()
    {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean isCheckedOut)
    {
        this.isCheckedOut = isCheckedOut;
    }
    public String getCheckedOutTo()
    {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo)
    {
        this.checkedOutTo = checkedOutTo;
    }
//    methods
    public void checkOutName(String name)
    {
        System.out.println(getCheckedOutTo()+ "check out name"+ name);
    }
    public void checkIn(boolean in)
    {
        System.out.println(getCheckedOutTo()+ "checkIn" +in);
    }

    //find book with book id;
//    private static BookClass findBookById(BookClass[] books, int Id)
//    {
//        for(BookClass book : books){
//            if (book.getId() == id)
//            { return book;
//        }
//    } return null;

    //To check out;
    public void checkOut(String name)
    {
        if(!isCheckedOut)
        {
            System.out.println("The Book" +title +"is already checked out by " + name +". Please choose another book");
        }
        else
        {
            checkedOutTo = name;
            isCheckedOut = true;
        }
    }
     //To checkIn;
    public void checkIn()
    {
        if(checkedOutTo !=null)
        {
            checkedOutTo = " ";
            isCheckedOut = false;
            System.out.println("The Book" +title + " is available, Enter your name to check in:" );

        }
    }

    //To exit to main screen;




}

