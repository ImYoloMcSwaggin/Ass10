package movies.txstate.edu.moviesskeleton;

public class Movie {
    int id;
    String title;
    String releaseYear;
    String overview;
    String posterPath;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    @Override
    public String toString() {
        return "Movie{}";
    }

    public Movie(int id, String title, String rating, String releaseYear, String description, String posterPath)
    {

    }
    // WRITE THE MOVIE CLASS
}
