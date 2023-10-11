import java.time.Year;

public class Book {

    private String title;
    private String author;
    private int releaseYear;
    private Genre genre;

    private final int CURRENT_YEAR = Year.now().getValue();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && title.length() > 1) {
            this.title = title;
        } else throw new IllegalArgumentException("Name can't be so short or empty");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && author.length() > 1) {
            this.author = author;
        } else throw new IllegalArgumentException("Author must be correctly valued");
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear > 0 && releaseYear <= CURRENT_YEAR) {
            this.releaseYear = releaseYear;
        } else throw new IllegalArgumentException("Year is not correct");
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        if (Genre.getListOfGenre().contains(genre)){
            this.genre = genre;
        } else throw  new RuntimeException("No such genre option");
    }


    public Book(String title, String author, int releaseYear, Genre genre) {
        this.author = author;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.title = title;
    }
    @Override
    public String toString(){
        return String.format("Book : title = %s , author = %s , released in %s year , the genre  = %s",
                title,
                author,
                releaseYear,
                genre);
    }
}
