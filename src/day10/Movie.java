package day10;

public class Movie implements Comparable<Movie> {
    String name;
    int year;
    double imdbRating;

    public Movie(String name, int year, double imdbRating) {
        this.name = name;
        this.year = year;
        this.imdbRating = imdbRating;
    }

    @Override
    public int compareTo(Movie other) {
        if (this.name.equals(other.name)) {
            return Double.compare(other.imdbRating, this.imdbRating);
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", imdbRating=" + imdbRating +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public int getYear() {
        return year;
    }
}
