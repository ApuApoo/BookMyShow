import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;



public class BookMyShowSystem {
	ArrayList<Cinema> cinemas;

public BookMyShowSystem(int number) {
	
	setCinema(number);
}
public void setCinema(int number)
{   this.cinemas= new ArrayList<>();
	for (int i = 0; i < number; i++) {
		System.out.println("Enter the name of the cinema");
		Scanner scanner=new Scanner(System.in);
		String cinemaName1=scanner.nextLine();
		this.cinemas.add(i, new Cinema(cinemaName1));
	
}
	
}

public void createShows(String movie, int numberOfShows)
{ for (int i = 0; i <cinemas.size(); i++) {
	this.cinemas.get(i).createShows(movie, numberOfShows);
}
}

public void showUpcomingShows(String cinemaName)
{   
	for (int i = 0; i < cinemas.size(); i++) 
	{ if(cinemas.get(i).getCinemaName()==cinemaName)
	{  
		cinemas.get(i).getShows();
	}
		
	}
	
	}
public void getCinema() {
	for (int i = 0; i < cinemas.size(); i++) {
		cinemas.get(i).showUpcomingShows();
	}
}

public void showUpcomingMovieShows(String cinemaName, String movie)
{  
	for (int i = 0; i < cinemas.size(); i++) 
	{ if(cinemas.get(i).getCinemaName().equals(cinemaName))
	{   
		cinemas.get(i).showUpcomingShows(movie);
		return;
	}
	}
	
		System.out.println("Wrong choice");
	
		
	}
	
	
public boolean bookShow(int show_no,String cinema,String movie,int tickt)
{

	for (int i = 0; i < cinemas.size(); i++) 
	{ if(cinemas.get(i).getCinemaName().equals(cinema))
	{   
		
		return cinemas.get(i).bookShow(show_no,movie,tickt);
	}
		
	}
	return false;
}
}
