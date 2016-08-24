package com.mavenBuildSix;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
@RequestScoped
public class MyModel {

    @PersistenceContext(unitName = "mavenBuildSix-pu")
    private EntityManager em;

    public Object getValue() {
        Content content = em.find(Content.class, "001");
        return content.getValue();
    }

}
