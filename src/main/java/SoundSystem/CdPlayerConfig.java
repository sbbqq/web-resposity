package SoundSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CdPlayerConfig {
    private static void config(){
        System.out.println("CdPlayer--config");
    }


}
