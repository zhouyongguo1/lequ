package lequ.oa.conf;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        System.out.println("---------bind");
//        bindCecdbPersistService();
//        bind(CurrentUser.class).toProvider(CurrentUserProvider.class).in(ServletScopes.REQUEST);
    }

    

}