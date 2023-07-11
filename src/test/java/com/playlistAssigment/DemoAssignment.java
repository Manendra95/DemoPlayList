package com.playlistAssigment;
import java.util.ArrayDeque;
import java.util.Deque;

public class DemoAssignment {

	public static void main(String[] args) {
	        int initialCapacity = 3;
	        Deque<String> playlist = new ArrayDeque<>(initialCapacity);

	        // Play the first three songs
	        playSong(playlist, "S1");
	        playSong(playlist, "S2");
	        playSong(playlist, "S3");

	        // Play the fourth song
	        playSong(playlist, "S4");

	        // Play the second song again
	        playSong(playlist, "S2");

	        // Play the first song again
	        playSong(playlist, "S1");
	    }

	    private static void playSong(Deque<String> playlist, String song) {
	        if (playlist.size() >= 3) {
	            playlist.removeFirst();
	        }

	        playlist.addLast(song);
	        System.out.println("Current playlist: " + playlist);
	    }
	}


