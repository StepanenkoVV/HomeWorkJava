public class Book {
    private final String name;
    private final String author;
    private final int numberOfPages;
    private final int IsbnNumber;

    public Book(String name, String author, int numberOfPages, int isbnNumber) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.IsbnNumber = isbnNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getIsbnNumber() {
        return IsbnNumber;
    }

}
