package view;

import java.util.Scanner;

public class Test04 {
    public static void validate(String userName, String password) throws InvalidPasswordException{
        if(password.length()<8){
            throw new InvalidPasswordException("Do dai phai >=8");
        }else if(!password.matches("(.*[A-Z].*)")){
            throw new InvalidPasswordException("it nhat 1 ky tu hoa");
        }else if(!password.matches("(.*\\d.*)")){
            throw new InvalidPasswordException("it nhat 1 so");
        }else if(!password.matches(".*[!@#$%^&*()].*")){
            throw new InvalidPasswordException("it nhat 1 ky tu dac biet");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{    
                System.out.print("Nhập tên tài khoản: ");
                String username = sc.nextLine();

                System.out.print("Nhập mật khẩu: ");
                String password = sc.nextLine();

                validate(username, password);

                System.out.println("Đăng ký tài khoản thành công!");
                break;
            }catch (Exception e){
                System.out.println("Occured exception: " + e.getMessage());
            }
        }
    }
}