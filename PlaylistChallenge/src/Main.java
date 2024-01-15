import java.util.*;

public class Main {
    public static void main(String[] args) {
/*class Song takes String title and double duration
* class Album takes String albumName and String artist
* inner class SongList is instantiated with a List<Song> and implemented as an
* ArrayList (basically ArrayList<Song>)*/
        Album album = new Album("First Cut", "BDog");
        /*List.of(new Song("I Feel Good", 5),
                new Song("More Than a Feeling", 4),
                new Song("Awesome", 3.5),
                new Song("Touch Me", 4.2))*/
        List<Song> songs = new ArrayList<>(List.of(new Song("I Feel Good", 5),
                new Song("More Than a Feeling", 4),
                new Song("Awesome", 3.5),
                new Song("Touch Me", 4.2)));
        /*album.populateAlbum(songs);
        album.printAlbum(songs);
        album.addSongToAlbum(songs,"Feelings", 6);
        album.addSongToAlbum(songs,"Run Away", 3);
        album.printAlbum(songs);*/

        Album.SongList songList = new Album.SongList("My Album", "First Playlist");
        /*The inner class must be at least package-private to access externally via enclosing class*/

        album.addNewPlaylist("My List");
        album.addNewPlaylist("Her List");
        album.addNewPlaylist("Kids List");




        }

    }
