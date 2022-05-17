package org.example.homework_20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TickerOfset {

    private static final String URL = "jdbc:postgresql://localhost:5432/stocks";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "docker";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement statement = connection.createStatement();

            /* 1. у тебя две разные по смыслу квери, не стоит их объеденять в одну операцию
            2. Вариант с функцией в БД хороший, но лучше было вызвать LocalDateTime.now() и затем обновить записи таблицы
            */
            ResultSet rs = statement.executeQuery("SELECT * FROM stocks s LIMIT 5 OFSET 4; UPDATE stocks SET update_date_time SELECT NOW();");

            List<Stock> cars = new ArrayList<>(); // List<Stock> стоит назвать stocks, а не cars

            // таким образом ты получишь 5 записей с офсетом 4, а обновлять остальные кто будет?
            while (rs.next()) {
                Stock stock = new Stock(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getLong(4),
                        rs.getString(5),
                        rs.getLong(6)
                );
                cars.add(stock);
            }
            cars.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


