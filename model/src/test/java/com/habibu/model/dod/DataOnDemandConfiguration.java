package com.habibu.model.dod;
import org.springframework.roo.addon.jpa.annotations.dod.RooJpaDataOnDemandConfiguration;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;

/**
 * = DataOnDemandConfiguration
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaDataOnDemandConfiguration
@TestConfiguration
public class DataOnDemandConfiguration {

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param entityManager
     */
    @Autowired
    public DataOnDemandConfiguration(EntityManager entityManager) {
        setEntityManager(entityManager);
    }
}
