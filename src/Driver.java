
public class Driver {

	public static void main(String[] args) {
		theQueue queue1 = new theQueue(10);
		
		queue1.priorityEnqueue("10");
		queue1.priorityEnqueue("19");
		queue1.priorityEnqueue("15");
		queue1.priorityEnqueue("11");
		queue1.print();
	}

}
