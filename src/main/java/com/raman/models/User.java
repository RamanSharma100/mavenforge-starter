package com.raman.models;

import com.mavenforge.Database.Model;

public class User extends Model {

    protected String[] fillable = {
            "email"
    };

    protected String[] gaurded = {
            "password"
    };
}
