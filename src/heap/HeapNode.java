package heap;

/**
 * 
 * @author Kritik Garg
 *
 * @param <E>
 */
public class HeapNode<E> {

	E data;
	int priority;

	/**
	 * Constructor
	 */
	
	public HeapNode() {
		this.priority = -1;
	}

	/**
	 * Constructor
	 * 
	 * @param priority
	 *            {@link Integer}
	 * @param data
	 *            E
	 */
	public HeapNode(int priority, E data) {
		this.priority = priority;
		this.data = data;
	}

	/**
	 * Getter for data
	 * 
	 * @return
	 */
	public E getData() {
		return data;
	}

	/**
	 * Setter for data
	 * 
	 * @param data
	 */
	public void setData(E data) {
		this.data = data;
	}

	/**
	 * getter for priority
	 * 
	 * @return
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * setter for priority
	 * 
	 * @param priorty
	 */
	public void setPriority(int priorty) {
		this.priority = priorty;
	}
}
