package view;

import java.util.Scanner;

public class Test02 {
    public static void validate(String password) throws InvalidPasswordException{
        if(password.length()<8){
            throw new InvalidPasswordException("it nhat 8 ki tu");
        }else if(password.length()>256){
            throw new InvalidPasswordException("nhieu nhat 256 ki tu");
        }else if(!password.matches("(.*[a-z].*)")){
            throw new InvalidPasswordException("it nhat 1 ki tu chu thuong");
        }else if(!password.matches("(.*[A-Z].*)")){
            throw new InvalidPasswordException("it nhat 1 ki tu chu hoa");
        }else if(!password.matches("(.*\\d.*)")){
            throw new InvalidPasswordException("it nhat 1 so");
        }else if(!password.matches(".*[!@#$%^&*()].*")){
            throw new InvalidPasswordException("it nhat 1 ki tu dac biet");
        }
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Nhap mat khau: ");
                String password = sc.nextLine();
                validate(password);
                System.out.println("Thanh cong!");
                break;
            }catch (Exception e){
                System.out.println("Occured exception: " + e.getMessage());
            }
        }
    }

}
