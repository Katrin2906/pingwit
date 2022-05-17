package org.example.homework_20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TickerWithA {

    private static final String URL = "jdbc:postgresql://localhost:5432/stocks";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "docker";

    private static final String SELECT_BY_TICKER = "SELECT * FROM stocks s WHERE s.ticker LIKE '%A%;";
    
    // лучше использовать PreparedStatement - мы на лекции разбирали пример
    //private static final String SELECT_BY_TICKER = "SELECT * FROM stocks s LIMIT ? OFSET ? WHERE s.ticker LIKE '%?%'";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        /*
        1. Сначала узнаем сколько записей в таблице stocks
        select count(*) from stocks;
        2. Допустим получили 100, хотим забирать по 20 -> 100/20 = 5 - такое кол-во будущих итераций в цикле
        3. запускаем цикл с SELECT_BY_TICKER с лимитом и офсетом.
        4. Выводим на экран полученные данные в каждой итерации цикла (например по 20 штук)
        */
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement prs = connection.prepareStatement(SELECT_BY_TICKER);
            prs.setString(1, "ticker");

            ResultSet rs = prs.executeQuery();

            List<Stock> stocks = new ArrayList<>();

            while (rs.next()) {
                Stock stock = new Stock(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getLong(4),
                        rs.getString(5),
                        rs.getLong(6)
                );
                stocks.add(stock);
            }
            stocks.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
