
public class Music {
    private String title;
    private int duration;
    private double rating;
    private boolean explicit;

    public Music(String title, int duration, double rating, boolean explicit) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.explicit = explicit;
    }

    public String toString() {
        return "Song: " + title + ", Duration: " + duration + " seconds, Rating: " + rating + ", Explicit: " + explicit;
    }

    public boolean hasWord(String word) {
        if (title.indexOf(word) == -1) {
            return false;
        }
        return true;
    }

    public String getFirstWord() {
        int space = title.indexOf(" ");

        if (space == -1) {
            return title;
        }

        return title.substring(0, space);
    }

    public boolean isSameSong(String otherTitle) {
        return title.equals(otherTitle);
    }

    public int getDurationInMinutes() {
        return duration / 60;
    }

    public boolean isAppropriate() {
        return !explicit;
    }

}
