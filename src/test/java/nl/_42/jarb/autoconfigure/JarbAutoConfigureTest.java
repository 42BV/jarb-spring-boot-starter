package nl._42.jarb.autoconfigure;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import nl._42.jarb.constraint.metadata.BeanConstraintController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class JarbAutoConfigureTest {

    @Autowired
    private BeanConstraintController controller;

    @Test
    public void beanConstraintController_shouldExistInContext() {
        assertNotNull(controller);
    }

}
