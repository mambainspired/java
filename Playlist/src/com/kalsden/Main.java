package com.kalsden;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("What a wonderful wold", "3:12"));
        songs.add(new Song("I walk the line", "2:22"));

        Playlist pl = new Playlist();
        pl.createPlaylist("Current", songs);

        //pl.addToPlaylist(pl, new Song("In the ghetto", "2:34"));

        pl.displayPlaylist(pl);
    }
}
