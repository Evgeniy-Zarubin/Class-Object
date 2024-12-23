public class App {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Author author2 = new Author("Самуил", "Маршак");
        Book book1 = new Book("Война и Мир", author, 1984);
        Book book2 = new Book("Кошкин Дом", author2, 1922);
        System.out.println(book1);
        System.out.println(book2);
        book2.setPublicationYear(1905);
        System.out.println(book2);


    }
}
