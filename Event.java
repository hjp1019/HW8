package hw8;

public class Event {
	private int EventSequenceNumber;
	private int EventDataValue;
	
	// constructor
	public Event(int seqNum, int data) {
		this.EventSequenceNumber = seqNum;
		this.EventDataValue = data;
	}
	
	public int getEventSeqnum() {
		return EventSequenceNumber;
	}
	
	public int getEventDataValue() {
		return EventDataValue;
	}
}
