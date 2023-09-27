package com.kisit.course_web_491_2023.entity.interface_realization;

public class JdbcToMySQL implements JdbcToDb{
    @Override
    public Object connectionToDB(String url, String username, String pass) {
        System.out.println("Підключення до БД MySQL");
        return null;
    }

    @Override
    public void statementTo(String qwerty) {
        System.out.println("Виконання запиту до бази даних MySQL");
    }
}
