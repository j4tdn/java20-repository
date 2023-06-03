package view;

public class Test04 {
	public static int factSum(int n){
        int rs=1;
        if(n==0 || n==1){
            return rs;
        }
        for(int i=2; i<=n; i++){
            rs*=i;
        }
        return rs;
    }
    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i<4; i++){
            int n=(int)(Math.random() * 11) + 10;// [0, 1) * 11 -> [0,11) -> cast về int, bỏ thập phân -> [0, 10] -> + 10 -> random là 1 thì + thêm 10 là 11
            int factSum=factSum(n);
            sum+=factSum;
        }
        System.out.print("Kết quả: "+sum);
    }
}
