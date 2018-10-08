/*
Author:             William Dennis
Student Number:     100157542
Date:               29/11/2017
Project:            CMP-4008Y Programming Coursework
 */
package albumdatabase;
//importing libraries

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class AlbumDatabase {

    private static final String albumList = "albums.txt";

    public static void main(String[] args) throws java.io.IOException {
        //initialising variables
        int hours;
        int mins;
        int seconds;
        String songName;
        String artistName;
        String albumName;
        int i = 0;
        String sCurrentLine;

        //creating new album collection & output the name
        AlbumCollection aC = new AlbumCollection("Personal Collection");
        System.out.println(aC);
        //Reading in File
        try (BufferedReader br = new BufferedReader(new FileReader(albumList))) {
            //condition to read in file line by line 
            while ((sCurrentLine = br.readLine()) != null) {
                String[] parts = sCurrentLine.split("\\s*:\\s*|\\s*-\\s*"); //Splits string based on ":" and "-"

                if (parts[0].equals("0")) {  //Determines whether line in file begins with a number or letter

                    hours = Integer.parseInt(parts[0]);   //assigning variables to different splits
                    mins = Integer.parseInt(parts[1]);
                    seconds = Integer.parseInt(parts[2]);
                    songName = parts[3];
                    if (parts[3].equals("11")) {  //To make sure that any Track Name with ":" in is output properly          
                        songName = parts[3] + ":" + parts[4];
                    }
                    

                } else {
                    //asign read in parts to variables
                    artistName = parts[0];
                    albumName = parts[1];

                    //add album to collection
                    aC.add(new Album(artistName, albumName));
                    i = aC.albums.size();

                }

            }
            System.out.println("Non-Alphabetical:" + aC.albums); //Non-Alphabetical

            aC.largestAlbum();             //Output largest Album
            aC.largestSong();              //Output largest Song

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
