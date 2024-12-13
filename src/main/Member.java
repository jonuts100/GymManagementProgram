package main;
import java.time.*;
public class Member {
	private String name;
	private Integer age;
	private LocalDate firstSignUpDate;
	
	public Member(String name,Integer age) {
		// TODO Auto-generated constructor stub
		setName(name);
		setAge(age);
		this.firstSignUpDate = LocalDate.now();
	}
	
	public String getTier() {
		return "Basic";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getfirstSignUpDate() {
		return firstSignUpDate;
	}

	public void setfirstSignUpDate(LocalDate date) {
		this.firstSignUpDate = date;
	}

}
