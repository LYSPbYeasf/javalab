package lesson2;

public class Book {
    private String title;
    private String author;
    private int page;
    private int year;
    private Genre genre;
    private String publishingHouse;

//    public Book() {
//
//    }

    public Book(String title, String author, Genre genre, String publishingHouse) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishingHouse = publishingHouse;
    }

    public Book(String title, String author, int page, int year, Genre genre, String publishingHouse) {
        this.title = title;
        this.author = author;
        this.page = page;
        this.year = year;
        this.genre = genre;
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", year=" + year +
                ", genre=" + genre +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
