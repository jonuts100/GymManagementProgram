package main;
import java.util.*;
public class Main {
	Scanner scan = new Scanner(System.in);
	InputHandler input = new InputHandler();
	public Main() {
		
		LocationManagement management = new LocationManagement();
		input.mainMenu(management);
	}
	
	public void addMember(GymProgram system) {
		String name,age,tier;
		
		System.out.print("Enter client name : ");
		name = scan.nextLine();
		
		System.out.print("Enter client's current age : ");
		age = scan.nextLine();
		
		System.out.print("Which tier would the client subscribe to ?\n1. Gold\n2. Base\n>> ");
		tier = scan.nextLine();
		
		if(tier == "1") {
		}
		else if(tier == "2") {
		}
		
		System.out.println("Member added Succesfully ! Press [ENTER] to Continue . . .");
		scan.nextLine();
		cls();
	}
	public static void main(String[] args) {
		new Main();
	}
	public void cls() {
		for(int i = 0;i < 50;i++) System.out.println();
	}
}
