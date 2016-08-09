package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Configs;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Devices.CDPlayer;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks.GodOfWar;
import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@Configuration//表示这是一个配置类。这里移除了自动装载的标注，将下面的方法都生命成了Bean。
public class GeneralConfig {
    @Bean//默认Bean的name就是'playGodOfWar'
    public CompactDisk playGodOfWar() {
        return new GodOfWar();
    }
//
//    @Bean (name = "playGodOfWar2")//当然也可以指派Bean的名字
//    public CompactDisk godOfWar() {
//        return new GodOfWar();
//    }
//
//    @Bean (name = "randomLoadDisk")
//    public CompactDisk randomLoad() {
//        SecureRandom random = new SecureRandom();
//        int randomInt = (int) Math.floor(random.nextInt(4));
//        switch (randomInt) {
//            case 0:
//                return new GodOfWar();
//            case 1:
//                return new Natives();
//            case 2:
//                return new RandomAccessMemories();
//            default:
//                return new SgtPeppers();
//        }
//    }

    @Bean//这里的godOfWar()并不是真实的调用，而是被Spring框架拦截了，返回的相同的一个Bean,所以这里应该是"播放"相同(同一个对象)的一盘碟片
    public CDPlayer loadedGodOfWarCdPlayer() {
        return new CDPlayer(playGodOfWar());
    }

    @Bean//这里的godOfWar()并不是真实的调用，而是被Spring框架拦截了，返回的相同的一个Bean,所以这里应该是"播放"相同(同一个对象)的一盘碟片
    public CDPlayer loadedAnotherGodOfWarCdPlayer() {
        return new CDPlayer(playGodOfWar());
    }

    //__________________________________________________
    @Bean
    public CDPlayer cdPlayer(CompactDisk compactDisk){
        return new CDPlayer(compactDisk);
    }

}
