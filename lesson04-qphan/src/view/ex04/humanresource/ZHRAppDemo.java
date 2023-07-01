package view.ex04.humanresource;

import java.time.LocalDate;
import java.util.Arrays;

import static view.ex04.humanresource.BaseStaff.*;

public class ZHRAppDemo {
	
	public static void main(String[] args) {
		BaseStaff[] staffs = mockData();
		
		System.out.println("Câu 1: Hiển thị thông tin các nhân sự có trong công ty");
		displayCompEmpls(staffs);
		
		System.out.println("\n\n");
		
		System.out.println("Câu 2: Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng");
		TeamLeadParam[] tlParams = statistic(staffs);
		displayTlParams(tlParams);
	}
	
	// Hoàng A --> 3
	// Hoàng B --> 1
	// statistic: thống kê
	private static TeamLeadParam[] statistic(BaseStaff[] staffs) {
		// params {param0(tl, emps), param1(tl, emps), param2(tl, emps)
		//         param3(tl, emps), param4(tl, emps), param5(tl, emps), param6(tl, emps)};
		TeamLeadParam[] params = new TeamLeadParam[staffs.length];
		int running = 0;
		for (BaseStaff staff: staffs) {
			if (staff instanceof Employee) {
				Employee employee = ((Employee) staff);
				TeamLead teamLead = employee.getTeamLead();
				TeamLeadParam tlParam = getTlParam(params, teamLead);
				if (tlParam != null) {
					// đã tồn tại
					tlParam.newEmpl(employee);
					
				} else {
					// nếu chưa tồn tại
					params[running++] = TeamLeadParam.newParam(teamLead, employee, staffs.length);
				}
			}
		}
		
		return Arrays.copyOfRange(params, 0, running);
		
	}
	
	private static TeamLeadParam getTlParam(TeamLeadParam[] params, TeamLead teamLead) {
		for (TeamLeadParam param: params) {
			if (param != null && param.getTeamLead().equals(teamLead)) {
				return param;
			}
		}
		return null;
	}
	
	private static void displayTlParams(TeamLeadParam[] params) {
		for (TeamLeadParam param: params) {
			System.out.println(param);
		}
	}

	private static void displayCompEmpls(BaseStaff[] staffs) {
		for (BaseStaff staff: staffs) {
			System.out.println(staff);
		}
	}
	
	private static BaseStaff[] mockData() {
		TeamLead tl1 = new TeamLead("Hoàng A", LocalDate.of(2002, 2, 22), SALARY_LEVEL_2, TITLE_LEVEL_1, "Phòng kinh doanh");
		TeamLead tl2 = new TeamLead("Hoàng B", LocalDate.of(2002, 2, 24), SALARY_LEVEL_2, TITLE_LEVEL_1, "Phòng nhân sự");
		return new BaseStaff[] {
			new Director("Lê Na", LocalDate.of(2000, 10, 10), SALARY_LEVEL_3, TITLE_LEVEL_2),
			tl1,tl2,
			new Employee("Văn A1", LocalDate.of(2005, 5, 5), SALARY_LEVEL_1, tl1),
			new Employee("Văn A2", LocalDate.of(2006, 6, 6), SALARY_LEVEL_1, tl1),
			new Employee("Văn A3", LocalDate.of(2007, 7, 7), SALARY_LEVEL_1, tl2),
			new Employee("Văn A4", LocalDate.of(2008, 8, 8), SALARY_LEVEL_1, tl1)
		};
	}
	
}
