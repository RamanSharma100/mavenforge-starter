package com.raman.models;

import com.mavenforge.Database.Model;

public class User extends Model {

        /*
         * The table associated with the model.
         * The table name is automatically pluralized by the system unless you specify
         * it.
         * By default, the table name would be 'users' in this case.
         * If you want to specify the table name, you can do so by adding the following
         * line:
         * protected String table = "users";
         */

        protected String[] fillable = {
                        "email"
        };

        protected String[] guarded = {
                        "password"
        };
}
