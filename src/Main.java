//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Война и Мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println("Книга: " + book1.getTitle() + ", автор: " + book1.getAuthor().getFullName() + ", год публикации: " + book1.getPublishingYear());

        System.out.println("Книга: " + book2.getTitle() + ", автор: " + book2.getAuthor().getFullName() + ", год публикации: " + book2.getPublishingYear());

        book2.setPublishingYear(1870);

        System.out.println("После изменения:");
        System.out.println("Книга: " + book2.getTitle() + ", автор: " + book2.getAuthor().getFullName() + ", год публикации: " + book2.getPublishingYear());
    }
}