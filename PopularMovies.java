package movies.txstate.edu.moviesskeleton;

import java.util.ArrayList;

public class PopularMovies {
    private static PopularMovies instance = null;

    PopularMovies popularMovies = new PopularMovies();
    ArrayList <Movie> movies = new ArrayList <Movie> ();

    private PopularMovies()
    {

    }

    public static PopularMovies getInstance() {
        if (instance == null) {
            instance = new PopularMovies();
        }
        return instance;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public Movie getMovie (int index)
    {
        return movies.get(index);
    }

    public void clear()
    {
        movies.clear();
    }

    public int size()
    {
        int size = movies.size();
        return size;
    }

    public void add(Movie movie) {

    }
}
