package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
public class RandomAccessMemories implements CompactDisk {
    private String title = "Random Access Memories";
    private String artist = "Daft Punk";
    public void play() {
        System.out.println("Playing "+ this.toString());
    }

    @Override
    public String toString() {
        return "RandomAccessMemories{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
