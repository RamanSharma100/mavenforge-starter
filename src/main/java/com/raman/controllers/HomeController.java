package com.raman.controllers;

import com.mavenforge.Http.HTTPRequest;
import com.mavenforge.Http.HTTPResponse;
import com.mavenforge.Controllers.Controller;

public class HomeController extends Controller {

    public void index(HTTPRequest request, HTTPResponse response) {
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

}
