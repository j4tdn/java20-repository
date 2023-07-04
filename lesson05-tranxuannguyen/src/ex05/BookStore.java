package ex05;

public class BookStore {
	public static void main(String[] args) {
		
		SGK[] sgk = new SGK[3];
		sgk[0] = new SGK("SGK01", 150, "Nhi Đồng", "mới");
		sgk[1] = new SGK("SGK02", 250, "VN", "cũ");
		sgk[2] = new SGK("SGK03", 30, "VN", "mới");
		
		STK[] stk = new STK[2];
		stk[0] = new STK("STK11", 100, "VN", 0.3f);
		stk[1] = new STK("STK12", 400, "Nhi Đồng", 0.4f);
		findBookOfNXB(sgk, stk);
		findBook50(sgk, stk);
		findBook100200(sgk);
		
	}
	public static void findBookOfNXB(SGK[] sgks, STK[] stks) {
		System.out.println("\nCác cuốn sách thuộc nhà xuất bản Nhi Đồng:");
        for (SGK sgk : sgks) {
            if (sgk.getPublishing().equals("Nhi Đồng")) {
                System.out.printf("\n%-30s%-30d%-30s%-30s\n", sgk.getId(), sgk.getPrice(), sgk.getPublishing(), sgk.getStatusBook());
            }
        }
        for (STK stk : stks) {
                if (stk.getPublishing().equals("Nhi Đồng")) {
                    System.out.printf("\n%-30s%-30d%-30s%-30f\n", stk.getId(), stk.getPrice(), stk.getPublishing(), stk.getTax());
                }
        }	
    }
	public static void findBook50(SGK[] sgks, STK[] stks) {
		System.out.println("Các cuốn sách đơn giá nhỏ hơn 50:");
        for (SGK sgk : sgks) {
            if (sgk.getPrice()<50) {
                System.out.printf("\n%-30s%-30d%-30s%-30s\n", sgk.getId(), sgk.getPrice(), sgk.getPublishing(), sgk.getStatusBook());
            }
        }
        for (STK stk : stks) {
                if (stk.getPrice()<50) {
                    System.out.printf("\n%-30s%-30d%-30s%-30f\n", stk.getId(), stk.getPrice(), stk.getPublishing(), stk.getTax());
                }
        }	
    }
	public static void findBook100200(SGK[] sgks) {
		System.out.println("\nCác cuốn sách giáo khoa từ 100 -> 200:");
        for (SGK sgk : sgks) {
            if (sgk.getPrice()<200 && sgk.getPrice()>100) {
                System.out.printf("\n%-30s%-30d%-30s%-30s\n", sgk.getId(), sgk.getPrice(), sgk.getPublishing(), sgk.getStatusBook());
            }
        }
    }
}
