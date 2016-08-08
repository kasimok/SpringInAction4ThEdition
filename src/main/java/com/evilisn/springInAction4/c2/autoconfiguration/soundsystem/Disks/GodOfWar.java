package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
public class GodOfWar implements CompactDisk {
    private String title = "God Of War";
    private String artist = "Santa Monica";
    public void play() {
        System.out.println("Playing "+ this.toString());
    }

    @Override
    public String toString() {
        return "GodOfWar{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
