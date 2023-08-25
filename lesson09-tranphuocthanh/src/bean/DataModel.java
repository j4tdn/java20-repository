package bean;

public class DataModel {

	public static Student[] getStudents() {
		return new Student[] { 
				new Student(102, "Nam", Rank.C), 
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), 
				new Student(105, "Nguyên", Rank.B), 
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A), 
				new Student(202, "Đạt", Rank.C),
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C),
				new Student(104, "Hoàng", Rank.B) 
		};
	}
}
