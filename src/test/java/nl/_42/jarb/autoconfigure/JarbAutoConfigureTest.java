package nl._42.jarb.autoconfigure;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import nl._42.jarb.constraint.metadata.BeanConstraintController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JarbAutoConfigureTest {

    @Autowired
    private BeanConstraintController controller;

    @Test
    public void beanConstraintController_shouldExistInContext() {
        assertNotNull(controller);
    }

}
