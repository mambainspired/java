package com.kalsden;

import java.util.ArrayList;

public class Main {
    public static Playlist pl = new Playlist();

    public static void main(String[] args) {
        // write your code here
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("What a wonderful wold", "3:12"));
        songs.add(new Song("I walk the line", "2:22"));

        pl.head = pl.createPlaylist(songs);
        pl.name = "Current";
        pl.displayPlaylist(pl);
    }
}
