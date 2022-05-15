package lesson2;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Толстой Л. Н.", Genre.Fiction, "Питер");
        System.out.println(book1);

        Book book2 = new Book("Петсон идет в поход", "Нурдквист С.", 150, 2011, Genre.Travel, "Белая Ворона");
        System.out.println(book2);

        Book book3 = new Book("Дом с волшебными окнами", "Эдмен Э.", 311, 2017, Genre.Fantasy, "Энигма");
        System.out.println(book3);

        System.out.println(book1.getGenre());
        System.out.println(book3.getTitle());

        book2.setGenre(Genre.Fiction);
        System.out.println(book2);

    }
}
