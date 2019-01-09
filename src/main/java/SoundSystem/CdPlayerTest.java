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
    CompDiscs compDiscs;

    @Test
    public void cdNotshouldbeNull(){
        assertNotNull(compDiscs);
    }
}
