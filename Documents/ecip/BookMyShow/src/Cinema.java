import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;

public class Cinema {
ArrayList<ShowTimings> shows;
String cinemaName;
 

public Cinema( String cinemaName) {
	
	this.shows=new ArrayList<>();
	this.cinemaName = cinemaName;

	

}

public String getCinemaName() {
	return cinemaName;
}
public void setCinemaName(String cinemaName) {
	this.cinemaName = cinemaName;
}
 public void createShows(String movie, int numberOfShows ){

for (int i = 1; i <=numberOfShows; i++) {
	final Random random = new Random();
	final int millisInDay = 24*60*60*1000;
	Time time = new Time((long)random.nextInt(millisInDay));
shows.add(new ShowTimings(movie, time));
}	 

}
 public void showUpcomingShows(String movie)
 {
for(int i=0;i<shows.size();i++)
{ if(shows.get(i).getMovie().equals(movie))
{ System.out.println(cinemaName +" " + " show NO  - " + i + " " +shows.get(i).getTime().toString()+ " " + shows.get(i).getMovie());
	}
	}
	 
 }
 public void showUpcomingShows(){
	 for (int i = 0; i <shows.size(); i++) {
		 System.out.println(cinemaName +" " +" show NO  - " + i + " " + shows.get(i).getTime()+ " " + shows.get(i).getMovie());
 }
 }

public ArrayList<ShowTimings> getShows() {
	return shows;
}

public void setShows(ArrayList<ShowTimings> shows) {
	this.shows = shows;
}
public boolean bookShow(int show_no,String movie,int tickt)
{// for(int i=1;i<=shows.size();i++)
 if(shows.get(show_no).getMovie().equals(movie)){
	return shows.get(show_no).bookTicket(tickt);
	}
  return false;
 
}

}
