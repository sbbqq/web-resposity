package SoundSystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =CdPlayerConfig.class)
public class CdPlayerTest {
    @Autowired
    SegtPpers compDiscs;
    @Autowired
    SegtPpers2 comDisscs2;

    @Test
    public void cdNotshouldbeNull(){
        assertNotNull(compDiscs);
        System.out.println("hehehehehe");
        compDiscs.play();
        comDisscs2.play();
        System.out.println(compDiscs.getClass().getName());
        
    }
}
