package SoundSystem;

import org.springframework.stereotype.Component;

@Component
public class SegtPpers implements CompDiscs{
    private String Artist="wqq";
    private String title="tweencle tweencle little star";
    @Override
    public void play() {
      System.out.println("playing "+title+" by "+Artist);
    }
}
