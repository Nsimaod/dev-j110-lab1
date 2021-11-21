public class Book {
    private String name;
    private int year;
    private String[] authors;
    private Publisher publishedBy;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (year <= 0 || year>2099) {
            throw new IllegalArgumentException();
        }
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) throws IllegalArgumentException {
        if(authors==null)
        {
            throw new IllegalArgumentException();
        }
        for (String s : authors)
        {
            if (s == null || s.equals("")) {
                throw new NullPointerException();
            }
        }
        this.authors = authors;
    }

    public Publisher getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(Publisher publishedBy) throws IllegalArgumentException {
        if (publishedBy == null) {
            throw new IllegalArgumentException();
        }
        this.publishedBy = publishedBy;
    }

    public int authorsAmount()
    {
        return authors.length;
    }

    public String getSpecificAuthor(int pos) throws IllegalArgumentException
    {
        if(pos>=authors.length || pos<0)
        {
            throw new IllegalArgumentException();
        }
        if (authors[pos] == null) {
            throw new IllegalArgumentException();
        }
        return authors[pos];
    }

    public void setAuthor(String author)
    {
        if(author==null || author.equals(""))
        {
            throw new IllegalArgumentException();
        }
        if(this.authors==null) {
            this.authors = new String[1];
            this.authors[0] = author;
        }
        else
        {
            String[] newAuthors=new String[authors.length+1];
            for(int i=0;i<authors.length;i++)
            {
                newAuthors[i]=authors[i];
            }
            newAuthors[authors.length]=author;
            authors=newAuthors;
        }
    }

    public Book(String name, int year, Publisher publishedBy) throws IllegalArgumentException
    {
        setName(name);
        setYear(year);
        setPublishedBy(publishedBy);
    }

    public Book(String name, String author, int year, Publisher publishedBy) throws IllegalArgumentException
    {
        this(name, year, publishedBy);
        setAuthor(author);
    }

    public Book(String name, String[] authors, int year, Publisher publishedBy) throws IllegalArgumentException, NullPointerException
    {
        this(name, year, publishedBy);
        setAuthors(authors);
    }

    public static void print(Book book)
    {
        System.out.print(book.getName()+", ");
        if(book.getAuthors()!=null)
        {
            if(book.getAuthors().length==1)
            {
                System.out.print("автор ");
            }
            else
            {
                System.out.print("авторы: ");
            }
            for (String author : book.getAuthors()) {
                System.out.print(author + ", ");
            }
        }
        System.out.println(book.getYear()+", издательство "+book.getPublishedBy().getName()+", "+book.getPublishedBy().getCity());
    }

    public static void printAll(Book[] books)
    {
        for(Book book: books)
        {
            print(book);
        }
    }
}