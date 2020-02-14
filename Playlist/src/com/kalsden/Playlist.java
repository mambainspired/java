package com.kalsden;

import org.w3c.dom.Node;

import java.util.ArrayList;

public class Playlist {
    String name;
    ListItem head;
    ListItem tail;

    public ListItem createPlaylist(String name, ArrayList<Song> songs) {
        Playlist pl = new Playlist();
        pl.name = name;
        pl.head = new ListItem();
        pl.tail = pl.head;

        if (songs.size() > 0) {
            for (int i = 0; i < songs.size(); i++) {
                if (pl.head.song == null) {
                    pl.head.song = songs.get(i);
                    pl.tail = pl.head;
                } else {
                    ListItem li = new ListItem();
                    li.song = songs.get(i);
                    li.prev = pl.tail;
                    pl.tail.next = li;
                    pl.tail = li;
                }
            }
        }
        return pl.head;
    }

    public void addToPlaylist(Playlist pl, Song song) {
        ListItem li = new ListItem();
        li.song = song;
        li.next = null;
        pl.tail.next = li;
        li.prev = pl.tail;
        pl.tail = li;
    }

    public void displayPlaylist(Playlist pl) {
        System.out.println(pl.name);

        if (pl.head.song != null) {
            // Not an empty playlist
            System.out.println(pl.head.song.title + " - " + pl.head.song.length);
            while (pl.head.next != null) {
                System.out.println(pl.head.next.song.title + " - " + pl.head.next.song.length);
                pl.head = pl.head.next;
            }
        }

    }
}
