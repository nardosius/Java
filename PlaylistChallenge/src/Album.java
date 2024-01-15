import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private String artist;
    private List<SongList> playList;
    private List<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.playList = new ArrayList<>();

    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public void populateAlbum(List<Song> songs) {
        int track = 0;
        for (Song s : songs) {
            track += 1;
            s.track = track;
            System.out.println(s.track);
        }

    }

    public void addSongToAlbum(List<Song> songs, String title, double duration) {
        int track = songs.size() + 1;
        Song song = new Song(title, duration, track);
        songs.add(song);
    }


    public void printAlbum(List<Song> songs) {
        System.out.println("*".repeat(30));
        System.out.println("Album " + getAlbumName() + " " + "by " + getArtist() + ":");
        System.out.println("_".repeat(30));
        for (Song s : songs) {
            System.out.println("Title: " + s.getTitle() + " ||Duration: " + s.getDuration() +
                    " ||track#: " + s.getTrack());
        }
    }

    public List<SongList> addNewPlaylist(String listTitle) {
        SongList extraList = new SongList(albumName, listTitle);
        this.playList.add(extraList);
        return playList;
    }

    public void addSongToPlaylist(List<SongList> playList, String listTitle, String title, double duration) {
        for (SongList sl : playList) {
            if (listTitle.equalsIgnoreCase(sl.listTitle)) {
                sl.addToPlaylist(title, duration);
            }
        }
    }

    /****NEW INNER CLASS BEGIN********************************************************************/
    static class SongList {//creates a playlist and adds to List of playlists
        private static List<Song> songs;//holds songs for playlist
        private String listTitle;//Title of playlist
        private String album;

        SongList(String album, String listTitle) {
            super();
            this.album = album;
            this.listTitle = listTitle;
            songs = new ArrayList<>();//instantiates playlist with name of the playlist
        }

        //adds songs to playlist
        public boolean addToPlaylist(String title, double duration) {
            Song newSong = new Song(title, duration);
            int track = 0;
            for (Song s : songs) {
                track += 1;
                s.track = track;
                if (!songs.contains(newSong)) {
                    songs.add(newSong);
                }
            }
            return false;
        }

        private Song findSong(String title) {
            Song song = new Song(title, 5, 0);
            for (Song s : songs) {
                if (!s.title.equalsIgnoreCase(title)) {
                    System.out.println("Song not found!");
                }
                return null;
            }
            return song;
        }

        private Song findSong(int track) {
            for (Song s : songs) {
                if (s.track == (track)) {
                    System.out.println("Song found!");
                }
                return s;
            }
            System.out.println("Song not found!");
            return null;
        }
    }
}
