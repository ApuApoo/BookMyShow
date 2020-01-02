
public class SeatCapacity {
 int totalSeats, occupied, unoccupied;

public SeatCapacity() {
	super();
	this.totalSeats = 100;
	this.occupied = 0;
	this.unoccupied = 100;
}

public int getTotalSeats() {
	return totalSeats;
}

public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}

public int getOccupied() {
	return occupied;
}

public void setOccupied(int occupied) {
	this.occupied = occupied;
}

public int getUnoccupied() {
	return unoccupied;
}

public void setUnoccupied(int unoccupied) {
	this.unoccupied = unoccupied;
}
public boolean bookTicket(int numberOfTickets)
{
	if(!isFull())
	{ if(numberOfTickets <= unoccupied )
	{
		for(int i =0; i<numberOfTickets;i++)
		{ occupied++;
		unoccupied--;
			}
		return true;
		}
	}
	
return false;
}
public boolean isFull()
{ if(occupied==100)
{
	return true;}
	
return false;}
}

