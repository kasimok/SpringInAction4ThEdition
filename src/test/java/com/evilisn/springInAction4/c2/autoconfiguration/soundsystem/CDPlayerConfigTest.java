package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Devices.CDPlayer;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Configs.GeneralConfig;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration (classes = {GeneralConfig.class})
public class CDPlayerConfigTest {
    @Rule
    public StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Autowired
    private CompactDisk cd;

    @Test
    public void testInsertDiskAndPlay() throws Exception {
        cd.play();
        MatcherAssert.assertThat(log.getLog(), CoreMatchers.containsString("Play"));
    }

}