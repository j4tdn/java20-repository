//package ex04humanresourcemanagement;
//
//import java.time.LocalDate;
//
//import static ex04humanresourcemanagement.Personnel.*;
//
//public class Utils {
//	private Utils() {
//	}
//	
//	private static void enterPersonnel() {
//		Personnel[] personnels = new Personnel[10];
//		personnels[1] = new Manager("Lê Na", LocalDate.of(2000, 10, 10), SALARY_LEVEL_3, TITLE_LEVEL_2);
//		personnels[2] = new Leader("Hoàng A", LocalDate.of(2002, 2, 22), SALARY_LEVEL_2, TITLE_LEVEL_1, "Phòng kinh doanh");	
//		personnels[3] = new Leader("Hoàng B", LocalDate.of(2002, 2, 24), SALARY_LEVEL_2, TITLE_LEVEL_1, "Phòng nhân sự");	
//		personnels[4] = new Staff("Văn A1", LocalDate.of(2005, 5, 5), SALARY_LEVEL_1, tl1);	
//		personnels[5] = new Staff("Văn A2", LocalDate.of(2006, 6, 6), SALARY_LEVEL_1, tl1);	
//		personnels[6] = new Staff("Văn A3", LocalDate.of(2007, 7, 7), SALARY_LEVEL_1, tl2);	
//		personnels[7] = new Staff("Văn A4", LocalDate.of(2008, 8, 8), SALARY_LEVEL_1, tl1);	
//	}
//	
//	private static void displayPersonnel(Staff[] staffs) {
//		for (Staff staff: staffs) {
//			System.out.println(staff);
//		}
//	}
//	
//}
