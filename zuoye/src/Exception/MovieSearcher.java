package Exception;

public class MovieSearcher {
    public String searchMovie(String movieInfo) throws MovieNotFoundException {

        if (movieInfo == null) {
            throw new MovieNotFoundException("未知电影", "movieInfo == null");
        }

        return movieInfo;
    }
}
