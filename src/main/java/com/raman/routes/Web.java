package com.raman.routes;

import com.mavenforge.Http.Route;
import com.mavenforge.Http.HTTPRequest;
import com.mavenforge.Http.HTTPResponse;
import com.mavenforge.Contracts.RoutesContract;

import com.raman.controllers.HomeController;

public class Web extends RoutesContract {
    public void init() {
        Route.get("/", "HomeController@index");
        Route.get("/about", "HomeController@about");
        Route.get("/contact", "HomeController@contact");
        Route.get("/dashboard", HomeController.class, "dashboard");

        Route.get("/login", this::login);
        Route.get("/register", (request, response) -> {
            response.status(200).response("Register page Lambda function").send();
        });

    }

    private void login(
            HTTPRequest request,
            HTTPResponse response) {
        response.status(200).response("Login page from Routes directory").send();
    }
}
