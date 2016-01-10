package lequ.oa.work.controllers;

import lequ.web.annotation.Controller;
import lequ.web.annotation.Route;
import lequ.web.annotation.http.Get;
import ninja.Result;
import ninja.Results;

@Controller
public class WorkController {
    @Get
    @Route("/works")
    public Result index() {
        return Results.html();
    }

    @Get
    @Route("/work")
    public Result work() {
        return Results.html();
    }

    @Get
    @Route("/work/new")
    public Result add() {
        return Results.html();
    }

    @Get
    @Route("/work/archived")
    public Result archived() {
        return Results.html();
    }
}
