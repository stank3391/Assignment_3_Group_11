package A3G11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/** INVOKER **/
		SimpleButtonRemote button0 = new SimpleButtonRemote();
		SimpleButtonRemote button1 = new SimpleButtonRemote();
		SimpleButtonRemote button2 = new SimpleButtonRemote();
		SimpleButtonRemote button3 = new SimpleButtonRemote();
		SimpleButtonRemote button4 = new SimpleButtonRemote();
		SimpleButtonRemote button5 = new SimpleButtonRemote();
		SimpleButtonRemote button6 = new SimpleButtonRemote();
		SimpleButtonRemote button7 = new SimpleButtonRemote();
		SevenButtonRemote remote = new SevenButtonRemote();			//Remote is composed of 8 buttons
		remote.programCommand
		
		/** RECEIVER **/
		AirConditioning airConditioning = new AirConditioning();
		Door garageDoor = new Door("Garage");
		Light livingRoomLight = new Light("Living Room");
		Light outdoorLight = new Light("Outdoor");
		
		/** COMMAND **/
		TurnOnCommand airConditioningCommand = new TurnOnCommand(airConditioning);
		
		
		/** GUI **/
		Scanner scanner = new Scanner(System.in);
		int userInput = -1;
		while (userInput != 0) {
			userInput = displayMenu(scanner);
			System.out.println(userInput);
		}
		
	}
	
	private static int displayMenu(Scanner scanner) {
		System.out.println("=======Seven Button Remote=======");
		System.out.println("===========Group 7 \\o/===========");
		System.out.println("(1) Turn On/Off Air Conditioner");
		System.out.println("(2) Open/Close Garage Door");
		System.out.println("(3) Turn On/Off Living Room Light");
		System.out.println("(4) Turn On/Off Outdoor Light");
		System.out.println("(5) Turn On/Off All Lights");
		System.out.println("(6) Unused");
		System.out.println("(7) Undo Button");
		System.out.println("(8) Reset All Buttons");
		System.out.println("(0) Put Down Remote");	
		System.out.println("=================================");
		System.out.println("");
		
		int userInput = scanner.nextInt();
		return userInput;
	}

}
