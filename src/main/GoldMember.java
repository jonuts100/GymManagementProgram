package main;

import java.util.ArrayList;

public class GoldMember extends Member {
	private ArrayList<String> enrolledClasses = new ArrayList<String>();
	private Integer PT_sessions;
	public GoldMember(String name, Integer age) {
		// TODO Auto-generated constructor stub
		super(name,age);
		PT_sessions = 3;
	}
	
	public ArrayList<String> getEnrolledClasses() {
		return enrolledClasses;
	}
	public void setEnrolledClasses(ArrayList<String> enrolledClasses) {
		this.enrolledClasses = enrolledClasses;
	}
	public Integer getPT_sessions() {
		return PT_sessions;
	}
	public void setPT_sessions(Integer pT_sessions) {
		PT_sessions = pT_sessions;
	}
	
	public String getTier() {
		return "Gold";
	}
	
	

}
