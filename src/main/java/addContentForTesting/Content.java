package addContentForTesting;


public class Content {
    private String comments;
    private String authors;
    private String publishers;
    private String titleBook;
    private String isbnBook;
    private String descripBook;

    public Content() {
    }

    public Content(String comments, String authors, String publishers, String titleBook, String isbnBook, String descripBook) {
        this.comments = comments;
        this.authors = authors;
        this.publishers = publishers;
        this.titleBook = titleBook;
        this.isbnBook = isbnBook;
        this.descripBook = descripBook;
    }

    @Override
    public String toString() {
        return comments + "\n" + authors + "\n" + publishers + "\n" + titleBook + "\n" + isbnBook + "\n" + descripBook + "\n";
    }


}
