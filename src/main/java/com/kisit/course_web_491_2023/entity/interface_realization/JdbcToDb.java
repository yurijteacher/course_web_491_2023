package com.kisit.course_web_491_2023.entity.interface_realization;

public interface JdbcToDb {
    Object connectionToDB(String url, String username, String pass);
    void statementTo(String qwerty);


}
