package exercises2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test2 {
    String tenChuXe;
    String loaiXe;
    int dungTich;
    double triGia;

    public Test2(){

    }

    public Test2(String tenChuXe, String loaiXe, int dungTich, double triGia){
        this.tenChuXe=tenChuXe;
        this.loaiXe=loaiXe;
        this.dungTich=dungTich;
        this.triGia=triGia;
    }

    public double thuePhaiNop(){
        double thue=0;
        if(dungTich<100){
            thue=triGia/100;
        }else if(dungTich>=100 && dungTich<=200){
            thue=(triGia*3)/100;
        }else if(dungTich>200){
            thue=(triGia*5)/100;
        }
        return thue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Test2> list = new ArrayList<>();
        Test2 test2 = new Test2();
        while(true){
            System.out.println();
            System.out.println("1. Nhập thông tin và tạo đối tượng xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát chương trình");
            System.out.print("Nhập lựa chọn (1-3): ");
            String choose = sc.nextLine();
            switch (choose){
                case "1": {
                    System.out.println("--------------------------");
                    System.out.print("Nhập tên chủ xe: ");
                    String tenChuXe = sc.nextLine();
                    System.out.print("Nhập loại xe: ");
                    String loaiXe = sc.nextLine();
                    System.out.print("Nhập dung tích: ");
                    int dungTich = sc.nextInt();
                    System.out.print("Nhập trị giá: ");
                    double triGia = sc.nextDouble();
                    test2 = new Test2(tenChuXe, loaiXe, dungTich, triGia);
                    list.add(test2);
                    System.out.println("--------------------------");
                    break;
                }
                case "2": {
                    System.out.println("Tên chủ xe \t Loại xe \t  Dung tích  \t  Trị giá  \t  Thuế phải nộp  \t");
                    System.out.println("===================================================================");
                    for(Test2 t2:list){
                        double thue = test2.thuePhaiNop();
                        System.out.println(t2.tenChuXe + "\t\t\t\s" + t2.loaiXe + "\t\t\t\s\s" + t2.dungTich + "\t\t\t\s\s" + t2.triGia + "\t\t\s\s" + thue);
                    }
                    break;
                }
                case "3": {
                    return;
                }
            }
        }
    }
}