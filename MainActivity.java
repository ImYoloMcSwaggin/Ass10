package movies.txstate.edu.moviesskeleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private final static String LOG_TAG             = MainActivity.class.getSimpleName();
    Button nextButton;
    Button backButton;
    ImageView movieImage;
    TextView movieTitle;
    TextView releaseYear;
    TextView rating;
    TextView description;
    int currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FetchMoviesTask MovieTask = new FetchMoviesTask();
        MovieTask.execute();
        Utils.addFirstMovie();
        //  Extend this method
        //
    }

    private void loadMovieImage (Movie movie, ImageView view) {

        // Uncomment when Movie and PopularMovies classes are defined
        try {
            URL url = Utils.buildMovieImageURL(movie.getPosterPath());
            Log.v(LOG_TAG, "Movie poster url " + url);
            //Load the image from the URL into imageView
            Picasso.with(this)
                    .load(url.toString())
                    .resize(Utils.IMAGE_SIZE_WIDTH, Utils.IMAGE_SIZE_HEIGHT)
                    .into(view);
        }
        catch (MalformedURLException e) {
            Log.e(LOG_TAG, e.toString());
        }
    }
}
