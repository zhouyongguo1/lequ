package lequ.oa.core.repositories;


import lequ.oa.core.models.User;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class UserRepository {

    Provider<EntityManager> em;

    @Inject
    public UserRepository(Provider<EntityManager> emProvider) {
        em = emProvider;
    }

    public List<User> findUsers() {

        return em.get().createQuery("from User")
                .getResultList();
    }


}
