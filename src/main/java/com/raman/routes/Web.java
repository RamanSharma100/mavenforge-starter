package com.raman.routes;

import java.util.HashMap;
import java.util.Map;

import com.mavenforge.Http.Route;
import com.mavenforge.Http.HTTPRequest;
import com.mavenforge.Http.HTTPResponse;
import com.raman.controllers.HomeController;
import com.mavenforge.Contracts.RoutesContract;

public class Web extends RoutesContract {
    public void init() {
        Route.get("/", "HomeController@index");
        Route.get("/about", "HomeController@about");
        Route.get("/contact", "HomeController@contact");
        Route.get("/dashboard", HomeController.class, "dashboard");

        Route.get("/login", this::login);
        Route.post("/login", "HomeController@login");

        Route.post("/register", "HomeController@storeUser");
        Route.get("/register", (request, response) -> {
            response.render("register");
        });

        Route.add("/users", "HomeController@users");

        Route.add("/cars", HomeController.class, "cars", new String[] { "GET", "POST" });
    }

    private void login(HTTPRequest request, HTTPResponse response) {
        response.render("login");
    }

}
