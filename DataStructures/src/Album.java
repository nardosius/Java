import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class Album {
        private String name;
        private String artist;
        private ArrayList<Song> songs;
        private LinkedList<Song> playList;

        public Album(String name, String artist) {
            this.name = name;
            this.artist = artist;
            this.songs = new ArrayList<Song>();
            this.playList = new LinkedList<>();
        }

        public boolean addSong(String title, double duration) {
            songs.add(new Song(title, duration));
            for (Song s : songs) {
                if (s.getTitle().equals(title) && s.getDuration() == duration) {
                    return true;
                }
            }
            return false;
        }

        public Song findSong(String title) {

            for (Song s : songs) {
                if (s.getTitle().contains(title)) {
                    return s;
                }
            }
            return null;
        }

        public boolean addToPlaylist(int track, LinkedList<Song> playList) {
            playList.add(new Song(track));
            for (Song s : playList) {
                if (s.getTrack() == track) {
                    return true;
                }
            }
            return false;
        }

        public boolean addToPlaylist(String title, double duration) {
            playList.add(new Song(title, duration));
            for (Song s : playList) {
                if (playList.contains(s.getTitle())){
                    return true;
                }
            }
            return false;
        }
    }




