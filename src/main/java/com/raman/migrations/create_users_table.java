package com.raman.migrations;

import com.mavenforge.Schemas.Schema;

public class create_users_table {
    public void up() {
        Schema.create("users", (table) -> {
            table.id().autoIncrement().primary();
            table.string("name").nullable();
            table.string("password").nullable();
            table.string("email").unique();
            table.integer("age").nullable();
            table.timestamps();
        });
    }

    public void down() {
        // Drop the table
    }
}
