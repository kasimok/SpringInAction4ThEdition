package com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Disks;

import com.evilisn.springInAction4.c2.autoconfiguration.soundsystem.Interfaces.CompactDisk;
import org.springframework.stereotype.Component;
/**
 * Created by evilisn_jiang on 2016/8/5.
 */
@Component("LonelyClub")
//这里'Component' 注解将一个类声明成为一个组件类，并告知Spring： 为他创建一个Bean
public class SgtPeppers implements CompactDisk {
    private String title = "Sgt. pepper's Lonely Hearts Club Band.";
    private String artist = "The Beatles";
    public void play() {
        System.out.println("Playing "+ this.toString());
    }

    @Override
    public String toString() {
        return "SgtPeppers{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
