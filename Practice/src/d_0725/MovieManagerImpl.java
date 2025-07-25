package d_0725;

import java.util.Arrays;

public class MovieManagerImpl implements IMovieManager {
	private static MovieManagerImpl instance = new MovieManagerImpl();

	private MovieManagerImpl() {}

	public static MovieManagerImpl getInatance() {
		return instance;
	}

	private final int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0;

	public void add(Movie movie) {
		movieList[size++] = movie;
	}

	public Movie[] getList() {
		return Arrays.copyOf(movieList, size);
	}

	public Movie[] searchByTitle(String text) {
		Movie[] tmp = new Movie[size];
		int j = 0;
		for (int i = 0; i < size; i++) {
			if (movieList[i].getTitle().contains(text)) {
				tmp[j++] = movieList[i];
			}
		}
		return Arrays.copyOf(tmp, j);
	}

	public Movie[] getMovies() {
		Movie[] tmp = new Movie[size];
		int i = 0;
		for (Movie m : movieList) {
			if (m instanceof Movie && !(m instanceof SeriesMovie)) {
				tmp[i++] = m;
			}
		}
		return Arrays.copyOf(tmp, i);
	}

	public SeriesMovie[] getSeriesMovies() {
		SeriesMovie[] tmp = new SeriesMovie[size];
		int i = 0;
		for (Movie m : movieList) {
			if (m instanceof SeriesMovie) {
				tmp[i++] = (SeriesMovie) m;
			}
		}
		return Arrays.copyOf(tmp, i);
	}

	public double getRunningTimeAvg() {
		if (size == 0) {
			return 0;
		} else {
			double sum = 0;
			for (Movie m : movieList) {
				if (m != null) {
					sum += m.getRunningTime();
				}
			}
			return sum / size;
		}
	}
}
