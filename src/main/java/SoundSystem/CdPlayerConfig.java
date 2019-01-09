package SoundSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sun.rmi.runtime.Log;

import java.util.logging.LogRecord;
import java.util.logging.Logger;

@Configuration
@ComponentScan
public class CdPlayerConfig {
    private static void config(){
        System.out.println("CdPlayer--config");
    }


}
