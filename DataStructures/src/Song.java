public class Song {
    private String title;
    private double duration;
    private int track;

       public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

    public Song(int track) {
        this.track = track;
    }

        public String getTitle() {
            return title;
        }

        public double getDuration() {
           return duration;
        }

        public int getTrack() {
           return track;
        }

        @Override
        public String toString() {
            return title + ": " + duration;
        }
    }

