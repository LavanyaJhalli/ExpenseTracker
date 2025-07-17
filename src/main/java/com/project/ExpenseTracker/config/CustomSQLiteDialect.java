package com.project.ExpenseTracker.config;

import org.hibernate.community.dialect.SQLiteDialect;

public class CustomSQLiteDialect extends SQLiteDialect {
    public CustomSQLiteDialect() {
        super();
        // No need to manually register column types in Hibernate 6
        // SQLiteDialect already handles common mappings
    }
}
