package henu.software.report3;
import java.util.ArrayList;
import java.util.List;

public class S3_5 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "ISBN001", "John Doe", true);
        Book book2 = new Book("Data Structures", "ISBN002", "Jane Smith", true);
        Book book3 = new Book("Python Basics", "ISBN003", "Bob Johnson", false);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        LibraryCard card1 = new LibraryCard("LC001", 5);
        Student student1 = new Student("张三", "S001", card1);

        student1.borrowBook(library, "Java Programming");
        student1.borrowBook(library, "Python Basics");
        student1.borrowBook(library, "Non-existent Book");
    }

    static class Book {
        private String title;
        private String isbn;
        private String author;
        private boolean available;

        public Book(String title, String isbn, String author, boolean available) {
            this.title = title;
            this.isbn = isbn;
            this.author = author;
            this.available = available;
        }

        public String getTitle() {
            return title;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        @Override
        public String toString() {
            return "《" + title + "》";
        }
    }

    static class LibraryCard {
        private String cardNumber;
        private int maxBooks;
        private List<Book> borrowedBooks;

        public LibraryCard(String cardNumber, int maxBooks) {
            this.cardNumber = cardNumber;
            this.maxBooks = maxBooks;
            this.borrowedBooks = new ArrayList<>();
        }

        public String getCardNumber() {
            return cardNumber;
        }

        public int getBorrowedCount() {
            return borrowedBooks.size();
        }

        public int getMaxBooks() {
            return maxBooks;
        }

        public boolean canBorrow() {
            return borrowedBooks.size() < maxBooks;
        }

        public void addBorrowedBook(Book book) {
            borrowedBooks.add(book);
        }

        public void returnBook(Book book) {
            borrowedBooks.remove(book);
        }

        public List<Book> getBorrowedBooks() {
            return new ArrayList<>(borrowedBooks);
        }
    }

    static class Student {
        private String name;
        private String studentId;
        private LibraryCard libraryCard;

        public Student(String name, String studentId, LibraryCard libraryCard) {
            this.name = name;
            this.studentId = studentId;
            this.libraryCard = libraryCard;
        }

        public String getName() {
            return name;
        }

        public String getStudentId() {
            return studentId;
        }

        public LibraryCard getLibraryCard() {
            return libraryCard;
        }

        public void borrowBook(Library library, String bookTitle) {
            if (!libraryCard.canBorrow()) {
                System.out.println(name + "没有借到《" + bookTitle + "》书（借书卡已达上限）");
                return;
            }

            Book book = library.findBookByTitle(bookTitle);

            if (book == null) {
                System.out.println(name + "没有借到《" + bookTitle + "》书（图书不存在）");
            } else if (!book.isAvailable()) {
                System.out.println(name + "没有借到《" + bookTitle + "》书（图书已被借出）");
            } else {
                book.setAvailable(false);
                libraryCard.addBorrowedBook(book);
                System.out.println(name + "借到了《" + bookTitle + "》书");
            }
        }
    }

    static class Library {
        private List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public Book findBookByTitle(String title) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
            return null;
        }

        public Book findBookByIsbn(String isbn) {
            for (Book book : books) {
                if (book.getIsbn().equals(isbn)) {
                    return book;
                }
            }
            return null;
        }
    }
}
