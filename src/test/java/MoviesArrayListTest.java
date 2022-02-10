import com.cullenkuch.MoviesArrayList;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MoviesArrayListTest {

    @Test
    void ContainsAddedMovie() {
        MoviesArrayList testMovieArray = new MoviesArrayList();
        testMovieArray.addMovieToArray("Mean Girls");
        testMovieArray.addMovieToArray("Bridesmaids");
        assertTrue(testMovieArray.checkForMovie("Mean Girls"));
    }

    @Test
    void

}