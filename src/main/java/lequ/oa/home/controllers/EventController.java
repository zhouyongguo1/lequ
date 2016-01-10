package lequ.oa.home.controllers;

import lequ.web.annotation.Controller;
import lequ.web.annotation.Route;
import lequ.web.annotation.http.Get;
import ninja.Result;
import ninja.Results;

@Controller
public class EventController {
    @Get
    @Route("/events")
    public Result index() {
        return Results.html();
    }
}
