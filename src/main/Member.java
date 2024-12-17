package main;
import java.time.*;
public class Member {
	private String name;
	private Integer age;
	private String id;
	private LocalDate firstSignUpDate;
	private Package memPackage;
	public Member(String name,Integer age,String ID) {
		// TODO Auto-generated constructor stub
		setName(name);
		setAge(age);
		setId(ID);
		this.firstSignUpDate = LocalDate.now();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Package getMemPackage() {
		return memPackage;
	}

	public void setMemPackage(Package memPackage) {
		this.memPackage = memPackage;
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
