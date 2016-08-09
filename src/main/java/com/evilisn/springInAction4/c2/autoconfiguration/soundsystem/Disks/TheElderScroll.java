package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
public class TheElderScroll implements CompactDisk {
    private String title = "The Elder Scroll";
    private String artist = "Bethesda Game Studios";
    public void play() {
        System.out.println("Playing "+ this.toString());
    }

    @Override
    public String toString() {
        return "TheElderScroll{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
