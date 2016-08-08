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

    @Autowired
    public CDPlayer(CompactDisk cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }


    //Autowire 可以用在构造函数上，也可以用在Setter上，也可以用在任意方法的参数上
    @Autowired
    public void insertDisk(CompactDisk cd) {
        this.cd = cd;
    }
}
