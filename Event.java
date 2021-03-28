package hw8;

public class Event {
	private int eventSequenceNumber;
	private int eventDataValue;
	
	// constructor
	public Event(int seqNum, int data) {
		this.eventSequenceNumber = seqNum;
		this.eventDataValue = data;
	}
	
	public int getEventSeqnum() {
		return eventSequenceNumber;
	}
	
	public int getEventDataValue() {
		return eventDataValue;
	}
}
