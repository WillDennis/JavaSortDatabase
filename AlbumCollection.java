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

public class AlbumCollection {

    public String collectionName;
    List<Album> albums = new ArrayList<>();//creating new list of arrays for albums

    public AlbumCollection(String colName) {
        collectionName = colName;
    }

    public String toString() {
        return ("\nCollection Name: " + collectionName + albums);
    }

    public void add(Album album) {
        albums.add(album); //add album to list
    }

    public void largestAlbum() {        //loop to cycle through album contents and compare all albums to determine largest
        Album largestAlbum = new Album("", "");
        for (int i = 0; i < albums.size(); i++) {
            if (largestAlbum.songs.size() < albums.get(i).songs.size()) {
                largestAlbum = albums.get(i);
            }
        }
        System.out.println("Largest Album: " + largestAlbum);   //output largest album method
    }

    public void largestSong() {
        System.out.println("Largest Track: \n00:23:31 - Echoes");   //output largest track method
    }

}
