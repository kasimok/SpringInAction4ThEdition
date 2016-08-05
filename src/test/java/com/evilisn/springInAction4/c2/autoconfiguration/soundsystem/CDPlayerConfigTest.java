package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.configs.CDPlayerConfig;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Test;
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
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerConfigTest {
    @Autowired
    private CompactDisk cd;
    @Autowired
    private ApplicationContext applicationContext;

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
}