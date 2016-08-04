package hashcode;

import java.util.ArrayList;
import java.util.HashMap;

public class GuestHouse {
	ArrayList<Integer> emptyRooms = new ArrayList<Integer>();
	HashMap<Integer, Guest> filledRooms = new HashMap<Integer, Guest>();

	/**
	 * Constructor
	 * 
	 * @param noOfRooms
	 */
	public GuestHouse(int noOfRooms) {
		for (int i = 1; i <= noOfRooms; i++) {
			emptyRooms.add(i);
		}
	}

	/**
	 * Allot room to guest
	 * 
	 * @param guest
	 * @return
	 */
	public int allotRoom(Guest guest) {
		if (emptyRooms.size() > 0) {
			int code = ((Integer) guest.getGuestAge()).hashCode();
			int index = code % emptyRooms.size();

			filledRooms.put(emptyRooms.get(index), guest);
			emptyRooms.remove(index);
			return index;
		} else {
			return -1;
		}
	}

	/**
	 * getter for filled rooms
	 * 
	 * @return
	 */
	public HashMap<Integer, Guest> getFilledRooms() {
		return filledRooms;
	}

}
