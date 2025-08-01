package d_0731;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MovieManagerImpl implements IMovieManager {
	private static MovieManagerImpl instance = new MovieManagerImpl();

	private MovieManagerImpl() {
		loadData();
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
	
	@SuppressWarnings("unchecked")
	private void loadData() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/d_0731/movie.dat"))) {
			movieList = (ArrayList<Movie>) ois.readObject();
			System.out.println("��ȭ �����͸� ���������� �ҷ��Խ��ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("movie.dat ������ �������� �ʽ��ϴ�. �� ����Ʈ�� �����մϴ�.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("��ȭ �����͸� �ҷ����� �� ������ �߻��߽��ϴ�.");
		}
	}
	
	@Override
	public void saveData() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"))) {
			oos.writeObject(movieList);
			System.out.println("��ȭ �����͸� ���������� �����߽��ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("��ȭ �����͸� �����ϴ� �� ������ �߻��߽��ϴ�.");
		}
	}
}
