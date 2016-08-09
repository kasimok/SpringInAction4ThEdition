package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
public class BlankDisk implements CompactDisk {
    private final String title ;
    private final String artist ;
    private List tracks;
    public void play() {
        System.out.println("Playing "+ this.toString());
    }

    public BlankDisk(String title, String artist, List tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        String tracks_info = (String) tracks.stream().map(i->String.format("Track Info:%s",i)).collect(Collectors.joining("\n"));
        return "BlankDisk{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", tracks='" + tracks_info + '\'' +
                '}';
    }


}
