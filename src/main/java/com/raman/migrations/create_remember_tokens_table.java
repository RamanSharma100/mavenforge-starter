package com.raman.migrations;

import com.mavenforge.Schemas.Schema;

public class create_remember_tokens_table {
    public void up() {
        Schema.create("remember_tokens", (table) -> {
            table.id().autoIncrement().primary();
            table.integer("user_id");
            table.string("token", 255).unique();
            table.datetime("expires_at");
            table.timestamps();
        });
    }

    public void down() {
        // Drop the table
    }
}
