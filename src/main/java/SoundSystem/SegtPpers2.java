package SoundSystem;

import org.springframework.stereotype.Component;

@Component
public class SegtPpers2 implements CompDiscs{
    private String Artist="wqq2";
    private String title="--2tweencle tweencle little star---2";
    @Override
    public void play() {
      System.out.println("playing "+title+" by "+Artist);
    }
}
