package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.MediaPlayer;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Configs.CdConfig;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Configs.MediaPlayerConfig;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CdConfig.class, MediaPlayerConfig.class})
public class CDPlayerConfigTest {

    @Autowired
    private CompactDisk cd;

    @Autowired
    private MediaPlayer player;

    @Autowired
    private ApplicationContext applicationContext;

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void cdShouldNotBeNull(){
        assertThat(cd,CoreMatchers.notNullValue());
    }

    @Test
    public void testBeanName() throws Exception {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        assertThat(beanNames,Matchers.hasItemInArray("LonelyClub"));
    }


    @Test
    public void testAllBeans() throws Exception {
        System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
    }

    @Test
    public void testInsertDiskAndPlay() throws Exception {
        player.play();
        MatcherAssert.assertThat(log.getLog(),CoreMatchers.containsString("Sgt"));
    }
}