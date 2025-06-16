//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Война и Мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println(book1);
        System.out.println(book2);

        book2.setPublishingYear(1870);

        System.out.println("После изменения:");
        System.out.println(book2);

        Book duplicateBook = new Book("Война и Мир", new Author("Лев", "Толстой"), 1869);
        System.out.println("book1 equals duplicateBook: " + book1.equals(duplicateBook));
        System.out.println("book1 hashCode == duplicateBook hashCode: " + (book1.hashCode() == duplicateBook.hashCode()));
    }
}