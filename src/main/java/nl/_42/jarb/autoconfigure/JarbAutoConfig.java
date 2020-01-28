package nl._42.jarb.autoconfigure;

import nl._42.jarb.constraint.metadata.BeanConstraintController;
import nl._42.jarb.constraint.metadata.BeanConstraintService;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * If no BeanConstraintController is found, it will be created.
 */
public class JarbAutoConfig {

    /**
     * Creates a {@link BeanConstraintController} bean.
     * @param beanConstraintService BeanConstraintService
     * @return BeanConstraintController
     */
    @Bean
    @ConditionalOnMissingBean(BeanConstraintController.class)
    public BeanConstraintController beanConstraintController(BeanConstraintService beanConstraintService) {
        return new BeanConstraintController(beanConstraintService);
    }

}
