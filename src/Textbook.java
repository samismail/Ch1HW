public class Textbook {
    private String title;
    private String author;
    private String subject;
    private long isbn;

    public Textbook(String title, String author, String subject, long isbn) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return  "Title: " + title + '\n' +
                "Author: " + author + '\n' +
                "Subject: " + subject + '\n' +
                "ISBN: " + isbn + '\n';
    }
}
