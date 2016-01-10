package lequ.oa.home.controllers;

import com.google.inject.Inject;
import lequ.web.annotation.Controller;
import lequ.web.annotation.Route;
import lequ.web.annotation.http.Get;
import ninja.Result;
import ninja.Results;


@Controller
public class HomeController {


    @Inject
    public HomeController() {
    }

    @Get
    @Route("/")
    public Result index() {

        return Results.html();

    }

}
