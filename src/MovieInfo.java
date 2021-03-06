import java.util.Date;

public class MovieInfo {

    private int id;
    private String title;
    private String movieType;
    private String director;
    private String[] cast;
    private Date movieStartTime; // nem-e lehet datetime formattal letrehozni?
    private char venue;

    public MovieInfo(int id, String title, String movieType, String director, String[] cast, Date movieStartTime, char venue) {
        this.id = id;
        this.title = title;
        this.movieType = movieType;
        this.director = director;
        this.cast = cast;
        this.movieStartTime = movieStartTime;
        this.venue = venue;
    }

    public void addMovie () {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public Date getMovieStartTime() {
        return movieStartTime;
    }

    public void setMovieStartTime(Date movieStartTime) {
        this.movieStartTime = movieStartTime;
    }

    public char getVenue() {
        return venue;
    }

    public void setVenue(char venue) {
        this.venue = venue;
    }
}
