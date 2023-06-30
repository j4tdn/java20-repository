package ex04_personnel_management;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Personnel {
	String pattern = "dd-MM-yyyy";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
	protected String name;
	protected Date birthday;
	protected double salaryFactor;
	
	public Personnel() {
		
	};
	
	public Personnel(String name, String birthday, double salaryFactor) {
		super();
		this.name = name;
		try {
			this.birthday = simpleDateFormat.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.salaryFactor = salaryFactor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return simpleDateFormat.format(birthday);
	}

	public void setBirthday(String birthday) {
		try {
			this.birthday = simpleDateFormat.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		};
	}

	public double getSalaryFactor() {
		return salaryFactor;
	}

	public void setSalaryFactor(double salaryFactor) {
		this.salaryFactor = salaryFactor;
	}
}
