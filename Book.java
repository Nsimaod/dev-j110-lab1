public class Book {
    private String name;
    private int year;
    private String[] authors;
    private Publisher publishedBy;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (year <= 0) {
            throw new IllegalArgumentException();
        }
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) throws IllegalArgumentException {
        for (String s : authors) {
            if (s == null) {
                throw new NullPointerException();
            }
            for (String author : authors) {
                if (author == null) {
                    throw new IllegalArgumentException();
                }
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
        if (authors[pos] == null) {
            throw new IllegalArgumentException();
        }
        return authors[pos];
    }

    public Book(String name, int year, Publisher publishedBy) throws IllegalArgumentException
    {
        if (name == null || year <= 0 || publishedBy == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.year = year;
        this.publishedBy = publishedBy;
    }

    public Book(String name, String author, int year, Publisher publishedBy) throws IllegalArgumentException
    {
        if (name == null || year <= 0 || publishedBy == null || author == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.year = year;
        this.publishedBy = publishedBy;
        this.authors = new String[1];
        this.authors[0] = author;
    }

    public Book(String name, String[] authors, int year, Publisher publishedBy) throws IllegalArgumentException, NullPointerException
    {
        if (name == null || year <= 0 || publishedBy == null || authors == null) {
            throw new IllegalArgumentException();
        }
        for (String a : authors) {
            if (a == null) {
                throw new NullPointerException();
            }
        }
        this.authors = authors;
        this.name = name;
        this.year = year;
        this.publishedBy = publishedBy;
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