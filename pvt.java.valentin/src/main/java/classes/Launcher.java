package classes;

import static classes.Book.*;

public class Launcher {
    public static void main(String[] args) {
        Book book1 = new Book(978504, "Последний секрет", "Бернар Вербер", "Эксмо", 2019, 352, 12.69, "Мягкая обложка");
        Book book2 = new Book(978517, "Будущее", "Дмитрий Глуховский", "Аст", 2016, 480, 32.57, "Твёрдый переплёт");
        Book book3 = new Book(9785699, "Не навреди", "Генри Марш", "Эксмо", 2016, 320, 17.63, "Твёрдый переплёт");
        Book book4 = new Book(9785699, "Тук-тук, сердце!", "Йоганн Генрих фон Борстель", "Эксмо", 2016, 256, 20.88, "Твёрдый переплёт");
        Book book5 = new Book(9785170, "В интернете кто-то неправ! Научные исследования спорных вопросов", "Ася Казанцева", "Аст", 2016, 376, 21.29, "Твёрдый переплёт");
        Book book6 = new Book(9785389, "Братья Карамазовы", "Фёдор Достоевский", "Азбука", 2013, 832, 9.44, "Твёрдый переплёт");
        Book book7 = new Book(97856997, "Как работает Google", "Джонатан Розенберг, Эрик Шмидт", "Эксмо", 2019, 416, 13.40, "Мягкая обложка");
        Book book8 = new Book(9785171, "Администратор Инстаграм. Руководство по заработку", "Евгений Козлов, Дмитрий Кудряшов", "Аст", 2019, 322, 17.64, "Твёрдый переплёт");
        Book book9 = new Book(9785386, "Новая энциклопедия Относительного и Абсолютного знания", "Бернар Вербер", "Рипол Классик", 2015, 592, 25.15, "Твёрдый переплёт");
        Book book10 = new Book(9785389, "Незнайка в Солнечном городе", "Николай Носов", "Махаон", 2012, 448, 28.43, "Твёрдый переплёт");
        Book[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        String nameOfAuthorForSearch = getAuthorFromUser();
        findBooksByAuthor(books, nameOfAuthorForSearch);
        String nameOfPublisherForSearch = getPublisherFromUser();
        findBooksByPublisher(books, nameOfPublisherForSearch);
        int yearOfPublishing = getYearOfPublishingFromUser();
        findBooksAfterGivenYear(books, yearOfPublishing);
    }
}
