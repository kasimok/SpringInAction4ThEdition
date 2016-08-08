package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Devices;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisk cd;

    public CDPlayer(CompactDisk cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    public CompactDisk getCd() {
        return cd;
    }

    public void insertDisk(CompactDisk cd) {
        this.cd = cd;
    }
}
