package datastructure.object;

public class Ex01ObjectDemo {
		public static void main(String[] args) {
			// Mac dinh 
			// Khi in bien KDL nguyen thuy --> Lay gia tri cua o nho ma bien tro den o STACK de in ra
			// Khi in bien KDL doi tuong --> tu dong lay bien do goi ham toString tu class cha ten la Object
			// De goi 1 bien thuoc tinh ,ham (phuong thuc
			// Khai bao va gan gia tri cho bien KDL nguyen thuy
			int digit =10;
			char letter = 'W';
			//Khai bao va gan gia tri cho bien KDL doi tuong
			//New Item()
			Item i1= new Item();
			i1.id=1;
			i1.name= 'M';
			i1.salesPrice= 11d;
			System.out.println("item i1 --> "+ i1);
			System.out.println("item i1 toString -->" + i1.toString());
			System.out.println("item i1 info --> id=" + i1.id +", name=" +i1.name +", salesPrice =" +i1.salesPrice);
		
			Item i2= new Item();
			i2.id=2;
			i2.name= 'H';
			i2.salesPrice= 11d;
			System.out.println("item i2 --> "+ i2);
			System.out.println("item i2 toString -->" + i2.toString());
			System.out.println("item i2 info --> id=" + i2.id +", name=" +i2.name+", salesPrice =" +i1.salesPrice);
			Item i3=null;
			System.out.println("item i3 -->" +i3); //null
			//System.out.println("item i3 toString --> " +i3.toString());
			//NPE --> JVM throws(nem) NullPointerException
			//Khong tim thay vi tri tro den tai vung nho HEAP -> Dung chuong trinh
			Item i4=new Item(4, 'B',44d);
			//Item i4= new Item();
			//i4.name= 'B';
			//i4.salesPrice =44d;
			System.out.println("item i4 --> "+i4);
		}
}