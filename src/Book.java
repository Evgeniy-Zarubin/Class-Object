
public class Book {
    private String titleBook;
    private Author nameAuthor;
    private int publicationYear;

    public Book () {
    }

    public Book (String titleBook, Author nameAuthor, int publicationYear) {
        this.titleBook = titleBook;
        this.nameAuthor = nameAuthor;
        this.publicationYear = publicationYear;
    }

    public String getTitleBook() {
        return this.titleBook;
    }
    public Author getNameAuthor() {
        return this.nameAuthor;
    }
    public int getPublicationYear () {
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: " + titleBook + "; " + nameAuthor + " - издание " + publicationYear + "г.";
    }
}