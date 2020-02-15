package com.mambainspired;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String name;
    ListItem head;

    public ListItem createPlaylist(ArrayList<Song> songs) {
        ListItem playlistHead = new ListItem();
        ListItem playListTail = new ListItem();

        if (songs.size() > 0) {
            for (int i = 0; i < songs.size(); i++) {
                if (playlistHead.song == null) {
                    playlistHead.song = songs.get(i);
                    playListTail = playlistHead;
                } else {
                    ListItem li = new ListItem();
                    li.song = songs.get(i);
                    playListTail.next = li;
                    li.prev = playListTail;
                    playListTail = li;
                }
            }
        }
        return playlistHead;
    }

    public void addToPlaylist(Playlist pl, ArrayList<Song> songs) {
        // Add to the end of the playlist
        ListItem curr = pl.head;
        ListItem tail = null;
        while (curr.next != null) {
            curr = curr.next;
        }
        tail = curr;

        for (int i = 0; i < songs.size(); i++) {
            ListItem li = new ListItem();
            li.song = songs.get(i);
            tail.next = li;
            li.prev = tail;
            tail = li;
        }
    }

    public void displayPlaylist(Playlist pl) {
        System.out.println(pl.name);
        ListItem curr = pl.head;
        System.out.println(curr.song.title + " - " + curr.song.length);
        while (curr.next != null) {
            curr = curr.next;
            System.out.println(curr.song.title + " - " + curr.song.length);
        }
    }
}
