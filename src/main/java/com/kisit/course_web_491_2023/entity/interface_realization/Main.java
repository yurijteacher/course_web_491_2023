package com.kisit.course_web_491_2023.entity.interface_realization;

public class Main {

    public static void main(String[] args) {

        JdbcToMySQL jdbc = new JdbcToMySQL();
        jdbc.connectionToDB("jdbc:mysql://localhost:3306/test_connection","user", "pass");
        jdbc.statementTo("select * from `category`");



    }
}
