import java.util.Arrays;

public class theQueue {
	private String[] queueArray;
	private int queueSize;					//MAX size queue can be
	
	private int head = 0;					//Keeps track of the first element of queue
	private int tail = 0;					//Keeps track of the last element of queue
	private int numOfItems = 0;				//How many items there are in the queue
	
	theQueue(int size)						//Constructor
	{
		queueSize = size;
		queueArray = new String[size];		
		Arrays.fill(queueArray, "-1");		//Fill queue with -1's
	}
	
	public void enqueue(String input) {		//Inserting to the end/tail of the queue
		
		if (numOfItems < queueSize)			//If there is still space..
		{
			queueArray[tail] = input;
			tail++;							//Updating because of new addition(new rear)
			numOfItems++;
		}
		else
		{
			System.out.printf("The queue is full!");
		}
	}
	
	
	public void priorityEnqueue(String input)			//Inserting item with sorting Biggest to smallest
	{
		int i;
		
		if (numOfItems == 0)
		{
			enqueue(input);
		} 
		else 
		{
			
			for (i = numOfItems-1; i >= 0; i--) 
			{
				if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) //if the input > tail
				{
					queueArray[i + 1] = queueArray[i]; //moving the element over by 1
					
				}
				
				else
				{
					break;
				}
			}
			
			queueArray[i + 1] = input;					
			
			tail++;
			numOfItems++;
		}
	}
	
	public void dequeue() {					//Deleting whats at the front/head of the queue
		if (numOfItems > 0)
		{
			queueArray[head] = "-1";
			head++;
			numOfItems--;
		}
		else
		{
			System.out.printf("The queue is empty!");
		}
	}
	
	public void peek() {					//Sees what is at head
		if (numOfItems > 0)
		{
			System.out.printf("%s", queueArray[head]);
		}
		else
		{
			System.out.printf("The queue is empty!");
		}
	}
	
	public void print() {
		for(int i = head; i < tail; i++)
		{
			System.out.printf("%s%n", queueArray[i]);
		}
	}
	
}
