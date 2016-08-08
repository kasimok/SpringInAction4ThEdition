package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Configs;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks.CdMarker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@Configuration
@ComponentScan(basePackageClasses = {CdMarker.class})
public class CdConfig {
}
