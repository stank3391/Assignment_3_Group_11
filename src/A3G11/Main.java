package A3G11;

import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		/** INVOKER **/
		/**	This is to create the physical remote **/
		SevenButtonRemote remote = new SevenButtonRemote();			//Remote is composed of 8 buttons
		SimpleButtonRemote button0 = new SimpleButtonRemote();
		remote.programCommand(button0, 0);
		SimpleButtonRemote button1 = new SimpleButtonRemote();
		remote.programCommand(button1, 1);
		SimpleButtonRemote button2 = new SimpleButtonRemote();
		remote.programCommand(button2, 2);
		SimpleButtonRemote button3 = new SimpleButtonRemote();
		remote.programCommand(button3, 3);
		SimpleButtonRemote button4 = new SimpleButtonRemote();
		remote.programCommand(button4, 4);
		SimpleButtonRemote button5 = new SimpleButtonRemote();
		remote.programCommand(button5, 5);
		SimpleButtonRemote button6 = new SimpleButtonRemote();
		remote.programCommand(button6, 6);
		SimpleButtonRemote button7 = new SimpleButtonRemote();
		remote.programCommand(button7, 7);
		
		
		/** RECEIVER **/
		/** This is to set up our smart home objects in the house **/
		AirConditioning airConditioning = new AirConditioning();
		Door garageDoor = new Door("Garage");
		Light livingRoomLight = new Light("Living Room");
		Light outdoorLight = new Light("Outdoor");
		
		/** COMMAND **/
		/** These are the programmed required by Akrem in the PDF **/
		//1. Control the air conditioner slot. This slot should be used to turn on/off the air conditioning of the house
		TurnOnCommand airConditioningCommand = new TurnOnCommand(airConditioning); 
		remote.getInvoker(0).programCommand(airConditioningCommand);
		//2. Garage door slot. This slot should be used to open/close the house's garage door.
		OpenCommand garageDoorCommand = new OpenCommand(garageDoor);
		remote.getInvoker(1).programCommand(garageDoorCommand);
		//3. Living room light slot. This slot should be used to turn on/off the living room's light.
		TurnOnCommand livingRoomLightCommand = new TurnOnCommand(livingRoomLight);
		remote.getInvoker(2).programCommand(livingRoomLightCommand);
		//4. Outdoor light slot. This slot should be used to turn on/off the outdoor light of the house.
		TurnOnCommand outdoorLightCommand = new TurnOnCommand(outdoorLight);
		remote.getInvoker(3).programCommand(outdoorLightCommand);
		//5. All lights slot. This slot should be used to turn on/off all house lights (The living room land the outdoor house lights).
		AllCommands allLightCommands = new AllCommands();
		allLightCommands.AddCommand(outdoorLightCommand);
		allLightCommands.AddCommand(livingRoomLightCommand);
		remote.getInvoker(4).programCommand(allLightCommands);
		//6. Unused slot. This slot should be left unused. It will not control anything, but it can be programmed in the future.
		//7. Undo button. This button should be used to undo the last used command used by the remote-control user.
		PreviousCommand previousCommand = new PreviousCommand();
		remote.getInvoker(6).programCommand(previousCommand);
		//8. Rest all buttons. This button should be used to reset all buttons. This means it clears all the assigned commands
		DeprogramRemote deprogramRemote = new DeprogramRemote();
		deprogramRemote.AddCommand(button0);
		deprogramRemote.AddCommand(button1);
		deprogramRemote.AddCommand(button2);
		deprogramRemote.AddCommand(button3);
		deprogramRemote.AddCommand(button4);
		deprogramRemote.AddCommand(button5);
		deprogramRemote.AddCommand(button6);
		deprogramRemote.AddCommand(button7);
		remote.getInvoker(7).programCommand(deprogramRemote);
		
		
		
		/** GUI **/
		Scanner scanner = new Scanner(System.in);
		int userInput = displayMenu(scanner);;
		while (userInput != 0) {
			remote.buttonWasPressed(userInput - 1);
			userInput = displayMenu(scanner);
			previousCommand.AddCommand(remote.getInvoker(userInput -1).getCommand());
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
