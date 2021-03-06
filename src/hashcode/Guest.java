package hashcode;

public class Guest {
	// variable for guest name
	private String guestName;

	// variable for guest age
	private int guestAge;

	/**
	 * Parameterized constructor for setting guest name and guest age
	 * 
	 * @param guestName
	 * @param guestAge
	 */
	public Guest(String guestName, int guestAge) {

		this.guestName = guestName;
		this.guestAge = guestAge;
	}

	/**
	 * return guest name
	 * 
	 * @return
	 */
	public String getGuestName() {
		return this.guestName;
	}

	/**
	 * return guest age
	 * 
	 * @return
	 */
	public int getGuestAge() {
		return this.guestAge;
	}

	@Override
	public String toString() {
		String string = "{Name=" + getGuestName() + ": Age=" + getGuestAge()
				+ "}";
		return string;
	}

}
