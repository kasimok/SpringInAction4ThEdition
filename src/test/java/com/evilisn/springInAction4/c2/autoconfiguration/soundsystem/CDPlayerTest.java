package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Devices.CDPlayer;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Configs.CdConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CdConfig.class)
public class CDPlayerTest {
    private CDPlayer cd;

    @Test
    public void play() throws Exception {
        cd.play();
    }

}