package lequ.oa.conf;

import com.google.inject.Singleton;
import lequ.web.routing.RoutesConfigurer;
import ninja.AssetsController;

@Singleton
public class Routes extends RoutesConfigurer {

    @Override
    protected void configure() {
        scan(lequ.oa.Marker.class.getPackage());
        getRouter().GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");
    }
}

