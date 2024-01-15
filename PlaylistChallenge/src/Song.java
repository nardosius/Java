public class Song {
    // write code here
    String title;
    double duration;
    int track;

    public Song(String title, double duration, int track) {
        this.title = title;
        this.duration = duration;
        this.track = track;
    }
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
        this.track = track;
    }

    public String getTitle() {
        return title;
    }

    public int getTrack() {
        return track;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}