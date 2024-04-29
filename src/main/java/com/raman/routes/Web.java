package com.raman.routes;

import com.mavenforge.Http.Route;
import com.mavenforge.Contracts.RoutesContract;

public class Web extends RoutesContract {
    public void init() {
        Route.get("/", "HomeController@index");
        Route.get("/about", "HomeController@about");
        Route.get("/contact", "HomeController@contact");
    }
}
