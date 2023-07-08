package Bai05;

import java.util.ArrayList;
import java.util.List;

public class BookStoreSimulation {
    public static void main(String[] args) {
        // Tạo dữ liệu sách cho cửa hàng
        List<Book> books = new ArrayList<>();

        TextBook textbook1 = new TextBook("SGK1", 150, "Nhi Đồng", false);
        TextBook textbook2 = new TextBook("SGK2", 180, "Kim Đồng", true);
        TextBook textbook3 = new TextBook("SGK3", 120, "Nhi Đồng", true);

        ReferBook referbook1 = new ReferBook("STK1", 80, "Thái Hà", 0.1);
        ReferBook referbook2 = new ReferBook("STK2", 100, "Nhi Đồng", 0.05);

        books.add(textbook1);
        books.add(textbook2);
        books.add(textbook3);
        books.add(referbook1);
        books.add(referbook2);

        // Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
        System.out.println("Danh sách sách thuộc nhà xuất bản Nhi Đồng:");
        for (Book book : books) {
            if (book.getPublisher().equals("Nhi Đồng")) {
                System.out.println(book.getBookID());
            }
        }

        // Tìm toàn bộ sách có đơn giá nhỏ hơn 50
        System.out.println("Danh sách sách có đơn giá nhỏ hơn 50:");
        for (Book book : books) {
            if (book.getPrice() < 50) {
                System.out.println(book.getBookID());
            }
        }

        // Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
        System.out.println("Danh sách sách giáo khoa có đơn giá từ 100 đến 200:");
        for (Book book : books) {
            if (book instanceof TextBook && book.getPrice() >= 100 && book.getPrice() <= 200) {
                System.out.println(book.getBookID());
            }
        }

        // Giải lập việc mua sách
        Customer customer = new Customer("KH1", "Nguyễn Văn A", "123456789", "Hà Nội");

        TextBook purchasedTextBook = textbook1;
        ReferBook purchasedReferBook = referbook1;

        // Tính tổng tiền mà khách hàng phải thanh toán
        double totalAmount = 0;

        if (purchasedTextBook.isNew()) {
            totalAmount += purchasedTextBook.getPrice();
        } else {
            totalAmount += purchasedTextBook.getPrice() * 0.7;
        }

        totalAmount += purchasedReferBook.getPrice() * (1 + purchasedReferBook.getTax());

        System.out.println("Tổng tiền khách hàng phải thanh toán: " + totalAmount);
    }
}