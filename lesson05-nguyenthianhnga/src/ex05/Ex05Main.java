package ex05;

public class Ex05Main {
	public static void main(String[] args) {
		Book sgk1 = new TextBook("SGK01",10000,"Nhi Đồng",Status.NEW);
		Book sgk2 = new TextBook("SGK02",200000,"Nhi Hà",Status.OLD);
		Book sgk3 = new TextBook("SGK03",30000,"Nhi Đồng",Status.OLD);
		Book stk1 = new ReferenceBook("STK01",30000,"Nhi Đồng",0.2);
		Book stk2 = new ReferenceBook("STK02",150000,"Nhi Đồng",0.15);
		
		Book[] books = {sgk1,sgk2,sgk3,stk1,stk2};
		findBooksByPrice(books,50000);
		System.out.println("---------------------------");
		findTextBookFrom100To200(books,10000,20000);
		System.out.println("---------------------------");
		 System.out.println("Sách thuộc nhà xuất bản Nhi Đồng:");
	        for (Book book : books) {
	            if (book.getPublisher().equals("Nhi Đồng")) {
                System.out.println(book.getBookCode() + " - " + book.getPrice());
	        }
	        }
	        System.out.println("---------------------------");
	        System.out.println("Tổng tiền thanh toán: " + calcSum(1,1,books));
	}
	
	
	      
	        public static void findBooksByPrice(Book[] books, double  price) {
	    	    System.out.println("Sách có đơn giá nhỏ hơn " +  price + ": ");
	    	    for (Book book : books) {
	    	        if (book.getPrice() < price) {
	    	            System.out.println(book.toString());
	    	        }
	    	    }
	    	}
	        public static void findTextBookFrom100To200(Book[] books, double priceMin, double priceMax) {
	            System.out.println("Sách giáo khoa có đơn giá từ " + priceMin + " đến " + priceMax + ": ");
	            for (Book book : books) {
	                if (book instanceof TextBook && book.getPrice() >= priceMin && book.getPrice() <= priceMax) {
	                    System.out.println(book.toString());
	                }
	            }
	        }
	        
	        public static double calcSum(int amountSGK, int amountSTK,  Book[] books) {
	        	  double totalMoney = 0;
		            int count = 0;
		            for (Book book : books) {
		            	if (book instanceof TextBook && ((TextBook) book).getStatus() == Status.OLD) {
		            		  count++;
	                    totalMoney += book.intoMoney() * 0.7;
	                }
	                if (book instanceof ReferenceBook) {
	                    totalMoney += book.intoMoney();
	                }
	            }
	            if (amountSGK > count) {
	                totalMoney += (amountSGK - count) * 100000;
	            }
	            if (amountSTK > 0) {
	                totalMoney += amountSTK * 200000 * 1.1;
	            }
	            return totalMoney;
	        }
	      
}
