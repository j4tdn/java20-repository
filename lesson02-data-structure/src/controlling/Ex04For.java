package controlling;

public class Ex04For {
	public static void main(String[] args) {
		int n=12;
		for(int i=1;i<n;i++) {
			System.out.println(i+"");
		}
		System.out.println("\n---------------\n");
		//ff là laybel dùng để thoát ra khỏi vòng for tổng for của row
		ff: for(int row=1;row<=6;row++)
		{
			for(int col=1;col<=4;col++) {
			System.out.print(""+ row +col +" ");
			if(row==5 && col ==3 ){
				break ff;
			}
			System.out.println();
		}
	}
	}
}
