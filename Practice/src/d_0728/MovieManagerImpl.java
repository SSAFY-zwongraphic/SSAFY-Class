package d_0728;

import java.util.ArrayList;

public class MovieManagerImpl implements IMovieManager {
	private static MovieManagerImpl instance = new MovieManagerImpl();

	private MovieManagerImpl() {
	}

	public static MovieManagerImpl getInatance() {
		return instance;
	}

	private final int MAX_SIZE = 100;
	private ArrayList<Movie> movieList = new ArrayList<>();

	public void add(Movie movie) {
		movieList.add(movie);
	}

	public ArrayList<Movie> getList() {
		return movieList;
	}

	public ArrayList<Movie> searchByTitle(String text) {
		ArrayList<Movie> tmp = new ArrayList<>();
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getTitle().contains(text)) {
				tmp.add(movieList.get(i));
			}
		}
		return tmp;
	}

	public ArrayList<Movie> getMovies() {
		ArrayList<Movie> tmp = new ArrayList<>();
		for (Movie m : movieList) {
			if (m instanceof Movie && !(m instanceof SeriesMovie)) {
				tmp.add(m);
			}
		}
		return tmp;
	}

	public ArrayList<SeriesMovie> getSeriesMovies() {
		ArrayList<SeriesMovie> tmp = new ArrayList<>();
		for (Movie m : movieList) {
			if (m instanceof SeriesMovie) {
				tmp.add((SeriesMovie) m);
			}
		}
		return tmp;
	}

	public double getRunningTimeAvg() {
		if (movieList.size() == 0) {
			return 0;
		} else {
			double sum = 0;
			for (Movie m : movieList) {
				if (m != null) {
					sum += m.getRunningTime();
				}
			}
			return sum / movieList.size();
		}
	}
}
