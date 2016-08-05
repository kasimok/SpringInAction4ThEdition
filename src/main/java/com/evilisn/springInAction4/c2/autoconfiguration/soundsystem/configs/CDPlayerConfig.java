package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.configs;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks.DisksMarkerInterface;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@Configuration
@ComponentScan(basePackageClasses = {DisksMarkerInterface.class})
public class CDPlayerConfig {
}
