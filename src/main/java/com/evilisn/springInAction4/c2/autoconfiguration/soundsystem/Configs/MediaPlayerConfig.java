package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Configs;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Devices.MediaPlayerMarker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by evilisn_jiang on 2016/8/8.
 */
@Configuration
@ComponentScan(basePackageClasses = {MediaPlayerMarker.class})
public class MediaPlayerConfig {
}
