public class Book {
    private Long id;
    private String bookName;
    private String AuthorName;

    public Book(Long id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        AuthorName = authorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", AuthorName='" + AuthorName + '\'' +
                '}';
    }
}