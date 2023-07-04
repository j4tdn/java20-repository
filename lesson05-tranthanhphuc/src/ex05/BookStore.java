package ex05;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {
        List<Object> books = createBookData();
        
        System.out.println("Sách thuộc nhà xuất bản Nhi Đồng:");
        findBooksByPublisher(books, "Nhi Đồng");
        
        System.out.println("\nSách có đơn giá nhỏ hơn 50:");
        findBooksByPrice(books, 50);
        
        System.out.println("\nSách giáo khoa có đơn giá từ 100 đến 200:");
        findTextBooksByPriceRange(books, 100, 200);
        
        Customer customer = new Customer("KH001", "Nguyễn Văn A", "0123456789", "Hà Nội");
        double totalPayment = simulatePurchase(books, customer);
        System.out.println("\nThông tin sách đã mua:");
        displayPurchasedBooks(books, customer);
        System.out.println("Tổng tiền phải thanh toán: " + totalPayment + " đồng");
    }

    public static List<Object> createBookData() {
        List<Object> books = new ArrayList<>();

        TextBook book1 = new TextBook("SGK1", 20, "Nhi Đồng", "Mới");
        TextBook book2 = new TextBook("SGK2", 180, "Kim Đồng", "Cũ");
        TextBook book3 = new TextBook("SGK3", 35, "Nhi Đồng", "Mới");

        ReferBook book4 = new ReferBook("STK1", 150, "Nhi Đồng", 0.1);
        ReferBook book5 = new ReferBook("STK2", 40, "Kim Đồng", 0.05);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        return books;
    }

    public static void findBooksByPublisher(List<Object> books, String publisher) {
        for (Object book : books) {
            if (book instanceof TextBook) {
                TextBook textBook = (TextBook) book;
                if (textBook.getPublisher().equals(publisher)) {
                    System.out.println(textBook.getBookID() + ": " + textBook.getPrice() + " đồng");
                }
            } else if (book instanceof ReferBook) {
                ReferBook referBook = (ReferBook) book;
                if (referBook.getPublisher().equals(publisher)) {
                    System.out.println(referBook.getBookID() + ": " + referBook.getPrice() + " đồng");
                }
            }
        }
    }

    public static void findBooksByPrice(List<Object> books, double price) {
        for (Object book : books) {
            if (book instanceof TextBook) {
                TextBook textBook = (TextBook) book;
                if (textBook.getPrice() < price) {
                    System.out.println(textBook.getBookID() + ": " + textBook.getPrice() + " đồng");
                }
            } else if (book instanceof ReferBook) {
                ReferBook referBook = (ReferBook) book;
                if (referBook.getPrice() < price) {
                    System.out.println(referBook.getBookID() + ": " + referBook.getPrice() + " đồng");
                }
            }
        }
    }

    public static void findTextBooksByPriceRange(List<Object> books, double minPrice, double maxPrice) {
        for (Object book : books) {
            if (book instanceof TextBook) {
                TextBook textBook = (TextBook) book;
                if (textBook.getPrice() >= minPrice && textBook.getPrice() <= maxPrice) {
                    System.out.println(textBook.getBookID() + ": " + textBook.getPrice() + " đồng");
                }
            }
        }
    }

    public static double simulatePurchase(List<Object> books, Customer customer) {
        double totalPayment = 0;
        boolean foundTextBook = false;
        boolean foundReferBook = false;

        for (Object book : books) {
            if (book instanceof TextBook && !foundTextBook) {
                TextBook textBook = (TextBook) book;
                totalPayment += calculateTextBookPrice(textBook);
                foundTextBook = true;
            } else if (book instanceof ReferBook && !foundReferBook) {
                ReferBook referBook = (ReferBook) book;
                totalPayment += calculateReferBookPrice(referBook);
                foundReferBook = true;
            }

            if (foundTextBook && foundReferBook) {
                break;
            }
        }

        return totalPayment;
    }

    public static double calculateTextBookPrice(TextBook textBook) {
        double price = textBook.getPrice();
        if (textBook.getCondition().equals("Cũ")) {
            price *= 0.7; // 30% discount for used books
        }
        return price;
    }

    public static double calculateReferBookPrice(ReferBook referBook) {
        double price = referBook.getPrice();
        double tax = referBook.getTax();
        return price * (1 + tax);
    }

    public static void displayPurchasedBooks(List<Object> books, Customer customer) {
        for (Object book : books) {
            if (book instanceof TextBook) {
                TextBook textBook = (TextBook) book;
                System.out.println(textBook.getBookID() + ": " + textBook.getPrice() + " đồng");
            } else if (book instanceof ReferBook) {
                ReferBook referBook = (ReferBook) book;
                System.out.println(referBook.getBookID() + ": " + referBook.getPrice() + " đồng");
            }
        }
    }
}
