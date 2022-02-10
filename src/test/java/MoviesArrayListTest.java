import com.cullenkuch.MoviesArrayList;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class MoviesArrayListTest {

    @Test
    void ContainsOneAddedMovie() {
        MoviesArrayList testMovieArray = new MoviesArrayList();
        testMovieArray.addMovieToArray("Rebel Without A Cause");
        assertTrue(testMovieArray.checkForMovie("Rebel Without A Cause"));
    }

    @Test
    void ContainsTwoAddedMovies() {
        MoviesArrayList testMovieArray = new MoviesArrayList();
        testMovieArray.addMovieToArray("Mean Girls");
        testMovieArray.addMovieToArray("Bridesmaids");
        assertTrue(testMovieArray.checkForMovie("Bridesmaids"));
    }

    @Test
    void DoesNotContainAddedMovie(){
        MoviesArrayList testMovieArray = new MoviesArrayList();
        testMovieArray.addMovieToArray("Halloween");
        testMovieArray.addMovieToArray("Hereditary");
        assertFalse(testMovieArray.checkForMovie("Scream"));
    }

}