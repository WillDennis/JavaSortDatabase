/*
Author:             William Dennis
Student Number:     100157542
Date:               29/11/2017
Project:            CMP-4008Y Programming Coursework
 */
package albumdatabase;
//importing libraries

import java.util.ArrayList;
import java.util.List;

public class Album {

    //Initialising Variables
    private String albumArtist;
    private String albumTitle;
    List songs = new ArrayList();

    public Album(String title, String artist) {
        albumTitle = title;
        albumArtist = artist;
    }

    public String toString() {
        return ("\nArtist: " + albumTitle + "   Album: " + albumArtist + songs); //output to return album info to main
    }

    public void addTrack(Track track) {
        songs.add(track); //adds new track to songs list
    }

}
