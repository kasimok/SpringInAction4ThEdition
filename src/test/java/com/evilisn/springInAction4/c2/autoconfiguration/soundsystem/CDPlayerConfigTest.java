package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;
import org.hamcrest.MatcherAssert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItemInArray;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration ("classpath:Beans.xml")
public class CDPlayerConfigTest {
    @Rule
    public StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisk cd;


    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void testBeanNamesContains() throws Exception {
        MatcherAssert.assertThat(applicationContext.getBeanDefinitionNames(), hasItemInArray("blank"));
    }

    @Test
    public void testPlayingElderScroll() throws Exception {
        cd.play();
        MatcherAssert.assertThat(log.getLog(), containsString("Fame Monster"));
        MatcherAssert.assertThat(log.getLog(), containsString("Pocker Face"));
    }
}