package main;
import java.util.*;
public class InputHandler {
	Scanner scan = new Scanner(System.in);
	AppendData addData = new AppendData();
	
	public String getStringInput(String text) {
		System.out.print(text);
		return scan.nextLine();
	}
	
	public void mainMenu(LocationManagement management) {
		String n;
		while(true) {
		System.out.println("===System Initialization===");
		if(management.getList().isEmpty()) {
			System.out.println("System does not have any location registered !\n");
			n = getStringInput("Please register the gym's location : ");
			
			addData.append(management.getLocationList(), new GymProgram(n));
			
			System.out.println("Great , the location " + n + " has been added !");
			System.out.println();
			cls();
		} else {
			int j=1;
			int[] idx= {1};
			System.out.println("Location List:");
			
			for (GymProgram location : management.getList()) {
				System.out.println((j++)+". "+location.getLocation());
			}
			
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println("1. Manage Location\n2. Create New Location\n3. Delete Location\n4. Exit");
			n = getStringInput("Choice:");
			
			switch(n) {
				case "1":
					management.getList().stream().forEach(location ->{
						System.out.println((idx[0]++) + ". " + location);
					});
					
					n = getStringInput("\n[0 to Exit Program]\n>> ");
					
					Integer i = Integer.parseInt(n);
					if(i < -1 || i >= idx[0]) {
						getStringInput("Input not valid ! Press [ENTER] to continue . . .");
						cls();
						continue;
					}
					cls();
					if(i == 0) {
						System.out.println("Program has ended, Goodbye !");
						return;
					}
					systems(management,i-1);
				break;
				case "2"://MASUKKIN APPEND
					n = getStringInput("Please register the gym's location : ");
					
					management.getLocationList().add(new GymProgram(n));
					System.out.println("Great , the location " + n + " has been added !");
					System.out.println();
					break;
				case "3":
					//DELETE LOCATION DISINI
					
					break;
				case "4":
					System.out.println("Succesfully Exited the program !");
					return;
				default:
					getStringInput("You must enter the proper inputs ! Press [ENTER] to continue ...");
					cls();
					break;
				}
		
			}
	
		}
	}
	/*
	 ______________________________________________
	 | No. | Name  | Age | Sign Up Date | Package |
	 ______________________________________________
	 | 1.  | jonut | 20  | 20/11/24     | Package A |
	 _______________________________________________
	 
	 */
	
	public void systems(LocationManagement management,Integer idx) {
		String n;
		GymProgram system = management.getList().get(idx);
		while(true) {
			n = getStringInput("===GYM MANAGEMENT SYSTEM [" + system.getLocation() +"]===\n1. Manage Member\n2. Manage Package\n3. Manage Product\n4. System Guide (?)\n5. Exit Program\n>>");
			switch(n) {
			case "1":
				cls();
				CRUD(system.getMembersList());
				break;
			case "2":
				cls();
				CRUD(system.getPackagesList());
				break;
			case "3":
				cls();
				CRUD(system.getProductList());
				break;
			case "4":
				cls();
				getStringInput("This management system is a simple program that can do simple CRUD (Create, Read, Update, and Delete) functions. To do such functions, simply enter the number on the menu and then you will be given more options to do the CRUD functions.\n\nPress [ENTER] to go back to the menu . . .");
				cls();
				break;
			case "5":
				cls();
				return;
			default:
				getStringInput("You must enter the proper inputs ! Press [ENTER] to continue ...");
				cls();
			}
		}
	}
	
	public <T> void CRUD(ArrayList<T> array) {
		String n;
		while(true) {
			n = getStringInput("Options:\n1. Add\n2. Display\n3. Update\n4. Search\n5. Delete\n6. Back\n>> ");
			switch(n) {
			case "1" :
				addMenu(array);
				break;
			case "2" :
				break;
			case "3" :
				break;
			case "4" :
				break;
			case "5" :
				break;
			case "6" :
				cls();
				return;

			default:
				getStringInput("You must enter the proper inputs ! Press [ENTER] to continue ...");
				cls();
			}
		}
	}
	
	public Member addMember() {
		String name,age,tier;
		
		name = getStringInput("Enter client name : ");
		
		age = getStringInput("Enter client's current age : ");
		do {
			tier = getStringInput("Which tier would the client subscribe to ?\n1. Gold\n2. Base\n>> ");
			getStringInput("Input might be incorrect !\n");
		}while(!tier.equals("1") && !tier.equals("2"));
		
		if(tier == "1") {
			return new GoldMember(name,Integer.parseInt(age));
		}
		return new Member(name,Integer.parseInt(age));
	}
	
	public void cls() {
		for(int i = 0;i < 50;i++) System.out.println();
	}
}
