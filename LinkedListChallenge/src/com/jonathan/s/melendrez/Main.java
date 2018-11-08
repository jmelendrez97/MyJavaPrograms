package com.jonathan.s.melendrez;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	Album album = new Album("Budots","Bisaya Rise Up");
	    album.addSong("Ultimate Badjao Beats", 4.9);
        album.addSong("Ultimate Badjao Beats 2", 4.9);
        album.addSong("Ultimate Badjao Beats 3", 2.9);
        album.addSong("Ultimate Badjao Beats 4", 3.9);
        album.addSong("Ultimate Badjao Beats 5", 6.9);
        albums.add(album);

        album = new Album("Bakte","Tagalogs rise up");
        album.addSong("Play the funky music", 5.44);
        album.addSong("Play the funky music 2", 5.34);
        album.addSong("Play the funky music 3", 6.44);
        album.addSong("Play the funky music 4", 2.44);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Ultimate Badjao Beats",playList);
        albums.get(0).addToPlayList("Ultimate Badjao Beats 2",playList);
        albums.get(0).addToPlayList("Play the funky music 69",playList);
        albums.get(0).addToPlayList(4,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(420,playList);

        play(playList);

    }
    private static void play(LinkedList<Song> playList){
        Scanner scan = new Scanner(System.in);
        boolean quit =false;
        boolean forward = true;
        ListIterator<Song> listIterator =  playList.listIterator();
        if(playList.size() ==0){
            System.out.println("No songs in the playlist");
            printMenu();
        }
        else{
            System.out.println("Now playing: "+listIterator.next().toString());
        }
        while (!quit){
            int action = scan.nextInt(); scan.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete!"); quit=true; break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: "+listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist.");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: "+listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the start of the playlist");
                    }
                    break;
                case 3:
                    if(forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward=false;
                        }else {
                            System.out.println("We are at the start of the list");
                        }
                    }

                    else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " +listIterator.next().toString());
                            forward=true;
                        }else {
                            System.out.println("We hav reached the end of the list");
                        }
                    }
                    break;
                case 4:
                   printList(playList);
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }
    private static void printMenu(){
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_RED+"Available actions:\npress"
                +"0 - to quit\n"
                +"1 -  to play next song\n"
                +"2 - to play previous song\n"
                +"3 -  replay the current song\n"
                +"4 - list songs in the playlist\n"
                +"5 - print available actions\n"
                +"6 - delete current song from playlist"+ANSI_RESET);
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("====================================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("====================================");
    }

}
