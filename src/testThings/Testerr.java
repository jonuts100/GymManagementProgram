package testThings;

import java.util.ArrayList;

public class Testerr {

	public Testerr() {
		// TODO Auto-generated constructor stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("BOBBY");
		arr.add("JIN");
		arr.add("NICK");
		arr.set(0,"Herro");
		arr.forEach(x->System.out.println(x));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Testerr();
	}

}
