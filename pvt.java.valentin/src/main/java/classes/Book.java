package classes;

import java.util.Scanner;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;
    private String bindingType;

    public Book(int id, String title, String author, String publisher, int yearOfPublishing, int numberOfPages, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String toString() {
        return id + ", " + title + ", " + author + ", " + publisher + ", " + yearOfPublishing + ", " + numberOfPages + ", " + price + ", " + bindingType;
    }


    public void setId(int bookId) {
        if (bookId <= 0) {
            System.out.println("Without the correct book ID in the catalog, we cannot find it - enter a valid book ID");
        } else {
            id = bookId;
        }
    }

    public int getId() {
        return id;
    }

    public void setTitle(String bookTitle) {
        if (bookTitle.isEmpty()) {
            System.out.println("You did not enter a book title");
        } else {
            title = bookTitle;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String bookAuthor) {
        if (bookAuthor.isEmpty()) {
            System.out.println("Books always have an author - enter author");
        } else {
            author = bookAuthor;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String bookPublisher) {
        if (bookPublisher.isEmpty()) {
            System.out.println("Books are printed on printing - enter the name of the publisher");
        } else {
            publisher = bookPublisher;
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYearOfPublishing(int bookYearOfPublishing) {
        if (bookYearOfPublishing <= 0) {
            System.out.println("These are not jokes - the publication year cannot be less than or equal to zero");
        } else {
            yearOfPublishing = bookYearOfPublishing;
        }
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setNumberOfPages(int bookNumberOfPages) {
        if (bookNumberOfPages <= 0) {
            System.out.println("The book is not a black hole - there should be pages in it");
        } else {
            numberOfPages = bookNumberOfPages;
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setPrice(double bookPrice) {
        if (bookPrice <= 0) {
            System.out.println("We don’t give away books for free - determine the price");
        } else {
            price = bookPrice;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setBindingType(String bookBindingType) {
        if (bookBindingType.isEmpty()) {
            System.out.println("Books have not been written on birch bark for a long time - indicate the binding");
        } else {
            bindingType = bookBindingType;
        }
    }

    public String getBindingType() {
        return bindingType;
    }

    public static String getAuthorFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which author book do you want to find? \n*Please write the name of the author with a space");
        return scanner.next() + " " + scanner.next();
    }

    public static String getPublisherFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which publisher book do you want to find? \n* if there are several words in the name of the publisher - write them with a space");
        return scanner.next();
    }

    public static int getYearOfPublishingFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Books after what year do you want to find?");
        return scanner.nextInt();
    }

    public static void findBooksByAuthor(Book[] listOfBooks, String author) {
        int counter = 0;
        System.out.println("Book search result for a given author: ");
        for (Book book : listOfBooks) {
            String currentBookAuthor = book.getAuthor();
            boolean equalsOfAuthors = currentBookAuthor.equalsIgnoreCase(author);
            if (equalsOfAuthors) {
                System.out.println(book);
            } else {
                counter++;
            }
            if (counter >= listOfBooks.length) {
                System.out.println("No books found");
            }
        }
    }

    public static void findBooksByPublisher(Book[] listOfBooks, String publisher) {
        int numberOfBooks = 0;
        System.out.println("Book search results for a given publisher: ");
        for (Book currentBook : listOfBooks) {
            String currentBookPublisher = currentBook.getPublisher();
            boolean toPrint = currentBookPublisher.equalsIgnoreCase(publisher);
            if (toPrint) {
                System.out.println(currentBook);
            } else {
                numberOfBooks++;
            }
            if (numberOfBooks >= listOfBooks.length) {
                System.out.println("No books found");
            }
        }
    }

    public static void findBooksAfterGivenYear(Book[] listOfBooks, int yearOfPublishing) {
        int numberOfBooks = 0;
        System.out.println("Book search result after a given year:");
        for (Book book : listOfBooks) {
            int currentBookYear = book.getYearOfPublishing();
            if (currentBookYear > yearOfPublishing) {
                System.out.println(book.getTitle() + " " + book.getYearOfPublishing());
            } else {
                numberOfBooks++;
            }
            if (numberOfBooks >= listOfBooks.length) {
                System.out.println("No books found");
            }
        }
    }
}
