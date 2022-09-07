package _04_netflix;

import javax.swing.JOptionPane;

public class Netflix {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Top Gun: Maverick", 2);
		Movie movie2 = new Movie("Jurassic World Dominion", 3);
		Movie movie3 = new Movie("Doctor Strange in the Multiverse of Madness", 4);
		Movie movie4 = new Movie("Minions: The Rise of Gru", 5);
		Movie movie5 = new Movie("The Batman", 1);
		movie1.getTicketPrice();
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.printMovies();
		JOptionPane.showMessageDialog(null, "The best movie is," + queue.getBestMovie());
		JOptionPane.showMessageDialog(null, "The second best movie is," + queue.getSecondBestMovie());

	}
}
