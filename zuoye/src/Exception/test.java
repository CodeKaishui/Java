package Exception;

public class test {
    public static void main(String[] args) {

        MovieFileReader reader = new MovieFileReader();
        reader.readMovieFile("testMovie.txt");

        MovieResourceLoader loader = new MovieResourceLoader("movieData.dat");
        try {
            loader.loadMovieResource();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        MovieSearcher searcher = new MovieSearcher();
        try {
            searcher.searchMovie(null);
        } catch (MovieNotFoundException e) {
            e.printStackTrace();
        }
    }
}
