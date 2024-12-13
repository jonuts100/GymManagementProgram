package main;
import java.util.*;
public class LocationManagement{
	private ArrayList<GymProgram> locationList = new ArrayList<GymProgram>();

	public ArrayList<GymProgram> getLocationList() {
		return locationList;
	}

	public void setLocationList(ArrayList<GymProgram> locationList) {
		this.locationList = locationList;
	}

	public ArrayList<GymProgram> getList() {
		// TODO Auto-generated method stub
		return new ArrayList<GymProgram>(locationList);
	}

}
