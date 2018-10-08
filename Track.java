 /*
Author:             William Dennis
Student Number:     100157542
Date:               15/11/2017
Project:            CMP-4008Y Programming Coursework
 */
package albumdatabase;

public class Track {

    private String trackName;
    private Duration songLength;

    public Track(String title, Duration length) {
        trackName = title;
        songLength = length;

    }

    public String toString() {
        return ("\n" + songLength + " - " + trackName);     //Output of song info
    }

}
