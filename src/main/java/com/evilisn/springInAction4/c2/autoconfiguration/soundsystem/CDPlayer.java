package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisk cd;

    @Autowired
    public CDPlayer(CompactDisk cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    @Autowired
    public void insertDisk(CompactDisk cd) {
        this.cd = cd;
    }
}
