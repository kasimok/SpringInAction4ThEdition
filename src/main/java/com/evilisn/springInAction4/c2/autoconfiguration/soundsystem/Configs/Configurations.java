package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Configs;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks.GodOfWar;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by evilisn_jiang on 2016/8/8.
 */
@Configuration
public class Configurations {
    @Bean
    public CompactDisk compactDisk(){
        return new GodOfWar();
    }
}
