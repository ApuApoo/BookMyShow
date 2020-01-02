import java.sql.Time;

public class ShowTimings extends SeatCapacity {
String movie;
Time time;
public ShowTimings(String movie, Time time) {
	super();
	this.movie = movie;
	this.time = time;
}
public String getMovie() {
	return movie;
}
public void setMovie(String movie) {
	this.movie = movie;
}
public Time getTime() {
	return time;
}
public void setTime(Time time) {
	this.time = time;
}

}
