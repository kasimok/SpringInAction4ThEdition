package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;
import org.springframework.stereotype.Component;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
public class Natives implements CompactDisk {
    private String title = "The natives";
    private String artist = "One republic";
    public void play() {
        System.out.println("Playing "+ this.toString());
    }

    @Override
    public String toString() {
        return "Natives{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
