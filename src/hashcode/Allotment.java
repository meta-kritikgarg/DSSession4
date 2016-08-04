package hashcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Allotment {

	public static void main(String[] args) {

		Allotment allotment = new Allotment();
		GuestHouse guestHouse = new GuestHouse(
				allotment.getIntfromUser("No of rooms in guest house"));

		while (guestHouse.emptyRooms.size() > 0) {
			int userChoice = 0;
			int roomNo = guestHouse.allotRoom(new Guest(allotment
					.getStringfromUser("Name of Guest"), allotment
					.getIntfromUser("Age")));

			if (roomNo == -1) {
				System.out.println("Room not alloted");
			} else {
				System.out.println("Alloted Successfull");
			}
			System.out.println("\nPress 1 for continue, 2 for exit");
			while (true) {
				userChoice = allotment.getIntfromUser("Choice ");
				if (userChoice == 1 || userChoice == 2) {
					break;
				} else {
					System.out.println("try again, Enter 1 or 2");
				}
			}
			if (userChoice == 2) {
				break;
			}
		}

		HashMap<Integer, Guest> guestHouseData = guestHouse.getFilledRooms();
		System.out.println(guestHouseData);

	}

	/**
	 * Method to read string data from standard input
	 * 
	 * @param Name
	 *            of variable to print
	 * @return String value input by user
	 */
	public String getStringfromUser(String Name) {
		Scanner s = new Scanner(System.in);
		String string = "";
		while (true) {
			try {
				System.out.println("Enter " + Name);
				string = s.next();
				if (string.length() > 0) {
					break;
				} else {
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}

		}
		return string;
	}

	/**
	 * Method to read integer data from standard input
	 * 
	 * @param Name
	 *            of variable to print
	 * @return int value of integer
	 */
	public int getIntfromUser(String Name) {
		Scanner s = new Scanner(System.in);
		int number = 0;
		while (true) {
			try {
				System.out.println("Enter " + Name);
				number = s.nextInt();
				if (number > 0) {
					break;
				} else {
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
		}
		return number;
	}
}