package nl._42.jarb.autoconfigure;

import nl._42.jarb.constraint.metadata.BeanConstraintController;
import nl._42.jarb.constraint.metadata.BeanConstraintService;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

public class JarbAutoConfig {

    @Bean
    @ConditionalOnMissingBean(BeanConstraintController.class)
    public BeanConstraintController beanConstraintController(BeanConstraintService beanConstraintService) {
        return new BeanConstraintController(beanConstraintService);
    }

}
