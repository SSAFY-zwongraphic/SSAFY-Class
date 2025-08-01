package d_0731;

import java.util.ArrayList;

public interface IMovieManager {
	void add(Movie movie);
	ArrayList<Movie> getList();
	ArrayList<Movie> searchByTitle(String title);
	ArrayList<Movie> getMovies();
	ArrayList<SeriesMovie> getSeriesMovies();
	double getRunningTimeAvg();
	void saveData();
}
