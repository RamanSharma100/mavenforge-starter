package com.raman.controllers;

import com.mavenforge.Http.HTTPRequest;
import com.mavenforge.Http.HTTPResponse;
import com.raman.models.User;
import com.mavenforge.Controllers.Controller;

public class HomeController extends Controller {

    public void index(HTTPRequest request, HTTPResponse response) {
        User.find(1);
        response.status(200).response("Hello World from controller").send();
    }

    public void about(HTTPResponse response) {
        response.status(200).response("About page from controller").send();
    }

    public void contact(HTTPRequest request, HTTPResponse response) {
        response.status(200).response("Contact page from controller").send();
    }

    public void dashboard(HTTPResponse response) {
        response.status(200).response("Dashboard page from controller").send();
    }

    public void users(HTTPRequest request, HTTPResponse response) {
        String method = request.getMethod();
        if (method.equals("GET")) {
            response.status(200).response("Users page from controller GET request").send();
        } else if (method.equals("POST")) {
            response.status(200).response("Users page from controller POST request").send();
        } else {
            response.status(405).response("Method not allowed").send();
        }
    }

    public void cars(HTTPResponse response) {
        response.status(200).response("Cars page from controller").send();
    }

}
