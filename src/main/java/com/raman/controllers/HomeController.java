package com.raman.controllers;

import com.mavenforge.Services.Auth;
import com.mavenforge.Http.HTTPRequest;
import com.mavenforge.Http.HTTPResponse;

import com.raman.models.User;

import java.util.Map;

import com.mavenforge.Controllers.Controller;

public class HomeController extends Controller {

    public void index(HTTPRequest request, HTTPResponse response) {
        response.status(200).send("Hello World from contwoman on top of man in busroller");
    }

    public void login(HTTPRequest request, HTTPResponse response) {
        Map<String, Object> body = request.getBody();
        for (Map.Entry<String, Object> entry : body.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        if (Auth.attempt(body.get("username").toString(), body.get("password").toString())) {
            System.out.println("Login successful");
        } else {
            response.redirect("/login");
        }
        // response.status(200).send("Login page from controller");
    }

    public void storeUser(HTTPRequest request, HTTPResponse response) {
        Map<String, Object> body = request.getBody();
        for (Map.Entry<String, Object> entry : body.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        response.redirect("/");
    }

    public void about(HTTPResponse response) {
        response.status(200).send("About page from controller");
    }

    public void contact(HTTPRequest request, HTTPResponse response) {
        response.status(200).send("Contact page from controller");
    }

    public void dashboard(HTTPResponse response) {
        response.status(200).send("Dashboard page from controller");
    }

    public void users(HTTPRequest request, HTTPResponse response) {
        String method = request.getMethod();
        if (method.equals("GET")) {
            response.status(200).send("Users page from controller GET request");
        } else if (method.equals("POST")) {
            response.status(200).send("Users page from controller POST request");
        } else {
            response.status(405).send("Method not allowed");
        }
    }

    public void cars(HTTPResponse response) {
        response.status(200).send("Cars page from controller");
    }

}
