package d_0723;

public class MovieManager {
	private final int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	int size = 0;

	public void add(Movie movie) {
		movieList[size++] = movie;
	}

	public Movie[] getList() {
		return movieList;
	}

	public Movie searchByTitle(String title) {
		Movie m = null;
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().equals(title)) {
				m = movieList[i];
			} 
		}
		return m;
	}
}
