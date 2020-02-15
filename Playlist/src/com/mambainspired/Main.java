package com.mambainspired;

import java.util.ArrayList;

public class Main {
    public static Playlist pl = new Playlist();

    public static void main(String[] args) {
        // write your code here
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("What a wonderful world", "3:12"));
        songs.add(new Song("I walk the line", "2:22"));
        songs.add(new Song("In the ghetto", "3.43"));

        pl.name = "Current";
        pl.head = pl.createPlaylist(songs);

        pl.displayPlaylist(pl);

        ArrayList<Song> newSongs = new ArrayList<Song>();
        newSongs.add(new Song("Blinding lights", "3:21"));
        newSongs.add(new Song("Before you go", "3:35"));

        pl.addToPlaylist(pl, newSongs);

        System.out.println("======= Added New Songs =========");

        pl.displayPlaylist(pl);
    }
}

