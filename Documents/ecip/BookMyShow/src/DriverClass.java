import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of cinemas");
		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();
		BookMyShowSystem bookMyShowSystem=new BookMyShowSystem(number);
	
		bookMyShowSystem.createShows("Jumanji", 5);
		bookMyShowSystem.createShows("Dolittle", 3);
		bookMyShowSystem.createShows("Ant Man", 4);
		bookMyShowSystem.createShows("The Grudge", 5);
		
	bookMyShowSystem.getCinema();
	while(true)
	{System.out.println("Enter 1 to continue \n  2 to exit");
	 Scanner scanner2=new Scanner(System.in);
	 int choice=scanner2.nextInt();
	 switch (choice) {
	 case 1:
		System.out.println("Enter the cinema where u wish to book the tickets");
		Scanner sca=new Scanner(System.in);
		
		String cinema=sca.nextLine();
		
		
		System.out.println("Enter the movie you wish to see");
		 Scanner scanner4=new Scanner(System.in);
		  String movie =scanner4.nextLine();
		  bookMyShowSystem.showUpcomingMovieShows(cinema,movie);
		System.out.println("Enter the show no. you wish to see and number of tickets");
		Scanner scanner3=new Scanner(System.in);
		int show_no=scanner3.nextInt();
		int tickt_no=scanner3.nextInt();
		Boolean result=bookMyShowSystem.bookShow(show_no,cinema, movie,tickt_no);
		if(result){	
		System.out.println("Your tickts has been booked");
		}
		else {
			System.out.println("Failed, these many tickets aren't available");
		}
		
		break;
	 case 2: 
         System.exit(0);		 
		

	}

}
}
}
